package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String acc = req.getParameter("acc");
		String pwd = req.getParameter("pwd");
		
		req.setAttribute("acc", acc);
		//req.setAttribute("acc", "PPP");
		req.removeAttribute("acc");
		req.setAttribute("pwd", pwd);
		req.getRequestDispatcher("/page1.jsp").
		forward(req, resp);
	}
}
