package tw.com.web;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import tw.com.web.tools.ImageTools;

import java.io.FileOutputStream;
import java.io.File;
//�i�W���ɮ�
@MultipartConfig
@WebServlet("/upload")
public class UploadServlet extends HttpServlet{
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			
			Part part =  req.getPart("photo");
			String fileName = part.getSubmittedFileName();		
			InputStream inpuStr = part.getInputStream();
			ImageTools.uploadFile(inpuStr, fileName);					
			resp.sendRedirect("view_images");		
		
		}
}
