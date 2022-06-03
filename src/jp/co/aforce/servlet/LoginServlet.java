package jp.co.aforce.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.Send;
import jp.co.aforce.dao.LoginDAO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {

		try {
			//入力値取得
			String id = request.getParameter("id");
			String password = request.getParameter("password");

			LoginDAO dao = new LoginDAO();
			Send s = dao.search(id, password);

			String login_id = s.getId();
			String login_pass = s.getPassword();

			if (id.equals(login_id) && password.equals(login_pass)) {
				//ログイン成功
				request.setAttribute("send", s);
				request.getRequestDispatcher("/jsp/welcome.jsp").forward(request, response);
			}else {
				//ログイン失敗
				request.setAttribute("miss", "miss");
				request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
