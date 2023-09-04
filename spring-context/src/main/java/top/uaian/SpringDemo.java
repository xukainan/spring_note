package top.uaian;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.uaian.config.AppConfig;
import top.uaian.config.MyBeanFactoryPostProcessor;
import top.uaian.event.MyApplicationEvent;
import top.uaian.service.UserService;

public class SpringDemo {


	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-spring.xml");


		//创建容器
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);

		annotationConfigApplicationContext.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());

		UserService userService = annotationConfigApplicationContext.getBean("userService", UserService.class);
		userService.say();

//		//2.注册配置类
//		annotationConfigApplicationContext.register(MyConfiguration.class);
//		//3.启动容器
//		annotationConfigApplicationContext.refresh();
//		//4.停止容器
//		annotationConfigApplicationContext.stop();
//		//5.重启容器
//		annotationConfigApplicationContext.start();
//		//6.关闭容器
//		annotationConfigApplicationContext.close();

//		MyApplicationEvent myApplicationEvent = new MyApplicationEvent(annotationConfigApplicationContext, " this MyApplicationEvent");
//
//		annotationConfigApplicationContext.publishEvent(myApplicationEvent);
	}
}