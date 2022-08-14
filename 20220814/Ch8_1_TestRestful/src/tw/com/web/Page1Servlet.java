package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import tw.com.beans.MyMsge;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
				throws ServletException, IOException {
		
			OkHttpClient clinet = new OkHttpClient().
					newBuilder().build();
			
			Request okRequest = new Request.Builder().
					url("http://localhost:8080/Ch8_1_TestRestful/test").
					build() ;
			Call call = clinet.newCall(okRequest);
			call.enqueue(new Callback() {
				
				@Override
				public void onResponse(Call arg0, Response res) throws IOException {
					// TODO Auto-generated method stub
					String result = res.body().string();
					ObjectMapper objMap = new ObjectMapper();
					MyMsge msg = objMap.readValue(result, MyMsge.class);
					System.out.println(msg);
										
				}
				
				@Override
				public void onFailure(Call arg0, IOException ex) {
					// TODO Auto-generated method stub
					System.out.println(ex);
				}
			});
		}
}
