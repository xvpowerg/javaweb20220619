package tw.com.web;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.bean.MyApple;
@WebServlet("/page1")
public class Page1Servet extends HttpServlet{
	    @Inject
	    @Named("redApple")
		private MyApple myappple;
	    
	    @Inject
	    @Named("QueryApples")
	    private List<MyApple> appleList;
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			System.out.println(myappple);	
			System.out.println(appleList);	
		}
}
