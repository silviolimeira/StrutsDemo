package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dbutil.DBUtil;
import pojo.Product;

public class ProductManagementDAO {

	public static List<Product> getAllProducts(String productName, String productCategory, Date createdDate) {

		List<Product> products = new ArrayList<>();
		String whereClause = "";
		if ((productName == null || productName.equals("")) &&
				(productCategory == null || productCategory.equals("")) &&
				(createdDate == null)) {
			whereClause = "";
		} else {
			whereClause = " WHERE ";
		}
		int count = 0;
		if ((productName != null && !productName.equals(""))) {
			count++;
			if (count != 1) {
				whereClause = " AND ";
			}
			whereClause += "name LIKE " + "'%" + productName + "%'";
		}
		if ((productCategory != null && !productCategory.equals(""))) {
			count++;
			if (count != 1) {
				whereClause = " AND ";
			}
			whereClause += "name LIKE " + "'%" + productCategory + "%'";
		}
		if (createdDate != null) {
			count++;
			if (count != 1) {
				whereClause = " AND ";
			}
			System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(createdDate));
			whereClause += "created = " + "'" + new SimpleDateFormat("yyyy-MM-dd").format(createdDate) + "'";
		}
		
		try {

			Connection conn = DBUtil.getConnection();

			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery("SELECT * FROM product" + whereClause);
			System.out.println("SELECT * FROM product" + whereClause);

			while (rs.next()) {

				Product product = new Product(rs.getLong("id"), rs.getString("name"), rs.getString("category"),
						rs.getBigDecimal("price"), rs.getDate("created").toLocalDate());

				products.add(product);

			}

			DBUtil.closeConnection(conn);

		} catch (Exception e) {

			e.printStackTrace();

		}

		return products;

	}

	public static Product getProductById(Long id) {
		Product product = null;
		try {
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM product WHERE id = ?");
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				product = new Product(rs.getLong("id"), rs.getString("name"), rs.getString("category"),
						rs.getBigDecimal("price"), rs.getDate("created").toLocalDate());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return product;
	}

	public static int addProduct(Product product) {
		int status = 0;
		try {
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("INSERT INTO product VALUES(?,?,?,?,?)");
			ps.setLong(1, product.getId());
			ps.setString(2, product.getName());
			ps.setString(3, product.getCategory());
			ps.setBigDecimal(4, product.getPrice());
			ps.setString(5, product.getCreated().toString());
			status = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static int updateProduct(Product product) {
		int status = 0;
		try {
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn
					.prepareStatement("UPDATE product SET name=?, category=?, price=?, created=? WHERE id=?");
			ps.setString(1, product.getName());
			ps.setString(2, product.getCategory());
			ps.setBigDecimal(3, product.getPrice());
			ps.setString(4, product.getCreated().toString());
			ps.setLong(5, product.getId());
			status = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static int deleteProduct(Long id) {
		int status = 0;
		try {
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("DELETE FROM product where id = ?");
			ps.setLong(1, id);
			status = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
