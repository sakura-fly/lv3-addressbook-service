package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GroupDao;
import dao.impl.GroupDaoImpl;
import entity.Group;

@WebServlet("group/list")
public class GroupList extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GroupDao gd = new GroupDaoImpl();
		List<Group> s = gd.list(Integer.parseInt(req.getParameter("uid")));
		resp.getWriter().println(s);
	}
	
}
