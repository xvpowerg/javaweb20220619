package tw.com.web;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class MyUserBinding implements HttpSessionBindingListener{
	private MyUser user;

	public MyUserBinding(MyUser user) {
		super();
		this.user = user;
	}
	
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		String name = event.getName();
		Object obj= event.getValue();
		System.out.println(name+":"+obj);
	}
}
