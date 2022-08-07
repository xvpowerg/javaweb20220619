package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.bean.User;
import tw.com.db.DbTools;
import tw.com.db.UserDao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
				PrintWriter out = resp.getWriter();
				out.println("page1!");
//				String url = "jdbc:mysql://localhost:3306/testdb20220807?serverTimezone=CST&useSSL=false&allowPublicKeyRetrieval=true";
//				String user = "root";
//				String password = "123456";
//				
//				try(Connection con = DriverManager.getConnection(url,user,password)){
//					
//				}catch(SQLException ex){
//					System.out.println(ex);
//				}
				
				
			UserDao	userDao = DbTools.getMySqlUser();
//			boolean b1 =  userDao.regisrter("ken", "123456");
//			System.out.println(b1);
			
//			User user =   userDao.findUserByAccount("ken");
//			
//			System.out.println(user.getAccount());
			boolean login = 
				userDao.login("ken","123456");
			System.out.println(login);
			
			
		}
}
