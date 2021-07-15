package top.uaian.service;

import org.springframework.stereotype.Component;

@Component
public class UserService {

	String msg = "hello spring";

	public void say(){
		System.out.println(msg);
	}
}
