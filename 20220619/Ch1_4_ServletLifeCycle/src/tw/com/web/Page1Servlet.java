package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	private int[] value = new int[1000];
	 @Override
	public void init() throws ServletException {
		 System.out.println("page1 init()");
		 Random r = new Random();
		 for (int i =0; i <value.length;i++) {
			 value[i] = r.nextInt();
		 }
		 
	}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			PrintWriter out =   resp.getWriter();
			out.println("Page1:"+value[1]);
		}
}
