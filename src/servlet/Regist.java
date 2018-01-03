package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import entity.User;

@WebServlet("/regist")
public class Regist extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User u = new User();
		u.setHobby(req.getParameter("hobby"));
		u.setName(req.getParameter("name"));
		u.setUserid(req.getParameter("userid"));
		u.setPassword(req.getParameter("pwd"));
		u.setRemark(req.getParameter("remark"));
		UserDao ud = new UserDaoImpl();
		int res = ud.regist(u);
		resp.getWriter().println(res);
	}

}
