package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	private ExecutorService es;
	
	@Override
	public void init() throws ServletException {
		
		es = Executors.newCachedThreadPool();
	}
	
	private void testWork(HttpServletResponse resp)  {
		for (int i = 1;i<=10;i++) {
			System.out.println("Thread Start:"+i);
		    try {
		    	Thread.sleep(1000);	
		    }catch(Exception ex) {
		    	
		    }	
		    	
			System.out.println("Thread End:"+i);
		}
		
	    try {
	    	resp.getWriter().println("Page1Servlet Finish");	
	    }catch(IOException ex) {
	    	
	    }
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  PrintWriter  out =  resp.getWriter();
		  out.println("Page1Servlet Start!!");
		  es.execute(()->testWork(resp));  ;
		 out.println("Page1Servlet End!!");
	}
}
