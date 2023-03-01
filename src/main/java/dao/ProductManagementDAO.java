package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dbutil.DBUtil;
import pojo.Product;

public class ProductManagementDAO {

	public static List<Product> getAllProducts() {

		List<Product> products = new ArrayList<>();

		try {

			Connection conn = DBUtil.getConnection();

			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery("SELECT * FROM product");

			while (rs.next()) {

				Product product = new Product(rs.getString("id"), rs.getString("name"), rs.getString("category"),
						rs.getBigDecimal("price"));

				products.add(product);

			}

			DBUtil.closeConnection(conn);

		} catch (Exception e) {

			e.printStackTrace();

		}

		return products;

	}

	public static Product getProductById(String id) {
		Product product = null;
		try {
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM product WHERE id = ?");
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				product = new Product(rs.getString("id"), rs.getString("name"), rs.getString("category"),
						rs.getBigDecimal("price"));
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
			PreparedStatement ps = conn.prepareStatement("INSERT INTO product VALUES(?,?,?,?)");
			ps.setString(1, product.getId());
			ps.setString(2, product.getName());
			ps.setString(3, product.getCategory());
			ps.setBigDecimal(4, product.getPrice());
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
					.prepareStatement("UPDATE product SET name=?, category=?, price=? WHERE id=?");
			ps.setString(1, product.getName());
			ps.setString(2, product.getCategory());
			ps.setBigDecimal(3, product.getPrice());
			ps.setString(4, product.getId());
			status = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static int deleteProduct(String productId) {
		int status = 0;
		try {
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("DELETE FROM product where id = ?");
			ps.setString(1, productId);
			status = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
