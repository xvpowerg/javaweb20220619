package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
//asyncSupported可非同步
@WebServlet(urlPatterns = {"/page1"},asyncSupported = true)
public class Page1Servlet extends HttpServlet {
	private ExecutorService es;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
			es = Executors.newCachedThreadPool();
	}
	
	private String getNumber() {
		Random ran = new Random();
		try {
			TimeUnit.SECONDS.sleep(10);	
		}catch(Exception ex) {
			
		}		
		 int v = ran.nextInt();
		 return v+"";
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
					throws ServletException, IOException {
		AsyncContext ctx =   req.startAsync();
		es.execute(()->{
				String v =  getNumber();
				try {
					PrintWriter out = ctx.getResponse().getWriter();
					out.print(v);
					ctx.complete();//這次工作完成
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}			
		});
	
		
	}
}
