package tw.com.web;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.io.IOException;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req,
			HttpServletResponse resp)throws IOException {
		//HttpServletRequest ¿é¤J
	    //HttpServletResponse ¿é¥X
	   Enumeration<String> eh = req.getHeaderNames();
	   while(eh.hasMoreElements()) {
		 System.out.println( req.getHeader(eh.nextElement()));
		
	   }
		   
		 PrintWriter p =   resp.getWriter();
		 p.println("doGet!");

	} 
}
