package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
				PrintWriter out =   resp.getWriter();
				out.println("Page1!");
				String p = req.getParameter("p");
				out.println("p:"+p);
				//¦r¦êÂà¾ã¼Æ
				int v = Integer.parseInt(p);
				for(int i = 1; i <= v;i++) {
					out.println(i);
				}
				
		}
}
