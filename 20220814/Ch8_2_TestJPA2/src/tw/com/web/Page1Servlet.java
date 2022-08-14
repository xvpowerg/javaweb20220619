package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.ejb.MyUserBeanLocal;
import tw.com.jpa.MyUser;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet  {
	@EJB
	private MyUserBeanLocal myuserBean;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		MyUser myUser = new MyUser();
		myUser.setAccount("Ken");
		myUser.setPassword("123456");
	boolean b1 = myuserBean.regisrter(myUser);
		System.out.println(b1);
		
		System.out.println(myuserBean.login(myUser));
		System.out.println(myuserBean.deleteUser(myUser));
//			PrintWriter out = resp.getWriter();
//			out.println("page1!!");
//			MyUser myuser = new MyUser();
//			myuser.setAccount("Ken");
//			myuser.setPassword("123456");
//			em.persist(myuser);
	}
}
