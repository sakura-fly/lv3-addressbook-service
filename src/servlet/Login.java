package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dao.impl.UserDaoImpl;

@WebServlet("/login")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String useid= req.getParameter("userid");
		String pwd = req.getParameter("pwd");
		UserDao ud = new UserDaoImpl() ;
		int res = ud.login(useid, pwd);
		resp.getWriter().println(res);
	}
}
