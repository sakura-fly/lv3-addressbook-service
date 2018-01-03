package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ContactDao;
import dao.GroupDao;
import dao.impl.ContactDaoImpl;
import dao.impl.GroupDaoImpl;
import entity.Contact;

@WebServlet("/contact/cg")
public class ContactChangeGroup extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int cid = Integer.parseInt(req.getParameter("cid"));
		GroupDao gd = new GroupDaoImpl();
		int res = gd.changeGro(cid, Integer.parseInt(req.getParameter("gid")));
		resp.getWriter().println(res);
	}
	
}
