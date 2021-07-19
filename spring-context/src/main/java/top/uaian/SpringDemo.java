package top.uaian;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.uaian.config.AppConfig;
import top.uaian.event.MyApplicationEvent;
import top.uaian.service.UserService;

public class SpringDemo {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建容器
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);

		UserService userService = annotationConfigApplicationContext.getBean("userService", UserService.class);
		userService.say();

		MyApplicationEvent myApplicationEvent = new MyApplicationEvent(annotationConfigApplicationContext, " this MyApplicationEvent");

		annotationConfigApplicationContext.publishEvent(myApplicationEvent);
	}
}