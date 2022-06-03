package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.beans.Send;

public class LoginDAO extends DAO {

	public Send search(String id, String password) throws Exception {

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"SELECT * FROM login WHERE id = ? and password = ?");
		st.setString(1, id);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();

		Send s = new Send();

		while (rs.next()) {
			s.setId(rs.getString("id"));
			s.setPassword(rs.getString("password"));
		}

		st.close();
		con.close();

		return s;

	}
}
