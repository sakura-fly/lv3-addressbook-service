package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ContactDao;
import dao.impl.ContactDaoImpl;
import entity.Contact;

@WebServlet("/onecontact")
public class ContactOne extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		ContactDao cd = new ContactDaoImpl();
		Contact c = cd.findById(id);
		resp.getWriter().println(c);
	}
	
}
