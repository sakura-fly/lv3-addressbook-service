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

@WebServlet("group/add")
public class GroupAdd extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GroupDao gd = new GroupDaoImpl();
		int res = gd.add(req.getParameter("groupname"));
		resp.getWriter().println(res);
	}

}
