package tw.com.web;

import java.io.IOException;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import tw.com.beans.Mask;
import tw.com.json.MaskJsonTools;
import tw.com.net.MaskNetTools;
@WebServlet(urlPatterns = {"/mask"},asyncSupported = true)
public class MaskServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("Thread Name:"+Thread.currentThread().getName());
		AsyncContext ctx =   req.startAsync();
		Consumer<List<Mask>> maskObjToPage = (list)->{
			
		//	System.out.println("Consumer Thread Name:"+Thread.currentThread().getName());
			try {
				ServletRequest  newRequest = ctx.getRequest();
				ServletResponse  newResponse =  ctx.getResponse();
				//System.out.println("list:"+list);
				newRequest.setAttribute("maskList", list);
				newRequest.getRequestDispatcher("/mask.jsp").
				forward(newRequest, newResponse);
				
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ctx.complete();
			
		};
		MaskNetTools.getMaskJson(json->{			
			try {
				MaskJsonTools.maskJsonToObj(json, maskObjToPage);
			} catch (JsonParseException |  JsonMappingException e) {
					System.out.println(e);
			} catch (IOException e) {			
				System.out.println(e);
			}	
		});
		
	}
}
