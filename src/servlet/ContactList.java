package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ContactDao;
import dao.impl.ContactDaoImpl;
import entity.UserAb;

@WebServlet("/listcontact")
public class ContactList extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int uid = Integer.parseInt(req.getParameter("uid"));
		ContactDao cd = new ContactDaoImpl();
		List<UserAb> ua = cd.listContact(uid);
		resp.getWriter().println(ua);
	}

}
