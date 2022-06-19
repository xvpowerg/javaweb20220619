package tw.com.web;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/page2")
public class Page2Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req,
			HttpServletResponse resp)throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("Page2");
	}
}
