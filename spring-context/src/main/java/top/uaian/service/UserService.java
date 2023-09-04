package top.uaian.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class UserService implements InitializingBean {

	String msg = "hello spring";

	public void say(){
		System.out.println(msg);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("UserService: afterPropertiesSet()方法调用");
	}
}
