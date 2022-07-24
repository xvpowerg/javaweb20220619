package tw.com.web.tools;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class InitContextLinstner implements ServletContextListener {
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		String file_path = 
				sce.getServletContext().getInitParameter("file_path");
		System.out.println("InitContextLinstner !!:"+file_path);
		ImageTools.setImagePath(file_path);
		
	}
}
