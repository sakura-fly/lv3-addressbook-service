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

@WebServlet("/updatecontact")
public class ContactUpdate extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Contact c = new Contact();
		c.setId(Integer.parseInt(req.getParameter("id")));
		c.setName(req.getParameter("name"));
		c.setSex(req.getParameter("sex"));
		c.setBirthday(req.getParameter("birthday"));
		c.setPhone(req.getParameter("phone"));
		c.setEmail(req.getParameter("email"));
		c.setAddress(req.getParameter("address"));
		c.setGroup(req.getParameter("group"));
		c.setRemark(req.getParameter("remark"));
		ContactDao cd = new ContactDaoImpl();
		int res = cd.update(c);
		resp.getWriter().println(res);
	}

}
