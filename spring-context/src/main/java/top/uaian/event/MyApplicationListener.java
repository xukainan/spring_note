package top.uaian.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {

	@Override
	public void onApplicationEvent(MyApplicationEvent event) {

		System.out.println("MyApplicationListener receive messgae: " + event.getMessage());

	}
}


/* 也可以使用注解 @EventListener 的方式来使用。
* @Component
public class MyAnnotationApplicationListener {

 @EventListener(classes = MyApplicationEvent.class)
 public void myApplicationEventListener(MyApplicationEvent event) {

  System.out.println("使用注解的方式, 收到事件: " + event.getMessage());
 }
}
*
*
* */