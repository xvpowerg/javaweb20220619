package tw.com.web;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class MyRequestListener implements ServletRequestAttributeListener {
	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
//		String name = srae.getName();
//		String value = srae.getValue().toString();
//		System.out.println(name);
//		System.out.println(value);
	}
	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
		String name = srae.getName();
		Object obj = srae.getValue();
		System.out.println("Removed:"+name+":"+obj);
		
	}
	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
//		String name = srae.getName();
//		String value = srae.getValue().toString();
//		System.out.println("Replaced:");
//		String v2 =  srae.getServletRequest().
//				getAttribute(name).toString();
//		System.out.print(name+":"+value+":"+v2);
	}
}
