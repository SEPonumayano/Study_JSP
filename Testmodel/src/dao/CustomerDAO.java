package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Customer;

public class CustomerDAO {

	public Customer search(String login,String password) throws Exception{
		Customer customer=null;

		Connection con =null;
		ResultSet rs = null;

		String user = "root";
		String pass = "";
		String url = "jdbc:mysql://localhost/onuma?serverTimezone=JST";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("接続おｋk");

			String CntQuery="SELECT * FROM onuma.customer where login=? and password=?";
			PreparedStatement ps = con.prepareStatement(CntQuery);
			ps.setString(1,login);
			ps.setString(2,password);
			rs = ps.executeQuery();

			while (rs.next()) {
				customer=new Customer();
				customer.setId(rs.getInt("id"));
				customer.setLogin(rs.getString("login"));
				customer.setPassword(rs.getString("password"));
			}
			ps.close();
			con.close();

		} catch (ClassNotFoundException e) {
			System.out.println("クラスが見つかりません");
		} catch (SQLException e) {
			System.out.println("データ検索に失敗しました");
		}
		return customer;
	}

}
