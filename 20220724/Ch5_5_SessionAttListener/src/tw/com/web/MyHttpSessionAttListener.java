package tw.com.web;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.time.LocalDateTime;
public class MyHttpSessionAttListener implements HttpSessionAttributeListener{
		@Override
		public void attributeAdded(HttpSessionBindingEvent event) {
			String name = event.getName();
			Object obj = event.getValue();
			if (name.equals("acc")) {
				System.out.println("add:"+name+":"+obj);
				LocalDateTime now =   LocalDateTime.now();
				System.out.println("登入時間:"+now);
			}
		
		}
		@Override
		public void attributeRemoved(HttpSessionBindingEvent event) {
			String name = event.getName();
			Object obj = event.getValue();
			System.out.println("remove:"+name+":"+obj);
			LocalDateTime now = LocalDateTime.now();
			System.out.println("登出時間:"+now);
		}
		@Override
		public void attributeReplaced(HttpSessionBindingEvent event) {
			String name = event.getName();
			Object value = event.getValue();
			Object obj2 = event.getSession().getAttribute(name);
			System.out.println("Replaced:"+name+":"+value+":"+obj2);
		}
		
}
