package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	//查詢
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}
	//登入 新增 刪除 修改
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String myAcc = "qwer";
		String myPwd = "12345";
		PrintWriter out = resp.getWriter();
		out.println("Page1");
		String acc = req.getParameter("acc");
		String pwd = req.getParameter("pwd");
		out.println(acc+":"+pwd);
		
		if (myAcc.equals(acc) && myPwd.equals(pwd)) {
			req.getRequestDispatcher("/page2").forward(req, resp);
		}else {
			req.getRequestDispatcher("/page3").forward(req, resp);
		}
		
	}
}
