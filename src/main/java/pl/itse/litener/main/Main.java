package pl.itse.litener.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.itse.listener.example.CustomEventPublisher;
import pl.itse.listener.example.CustomException;
import pl.itse.litener.config.AppConfig;

@SpringBootApplication
public class Main {

	public static void main(String[] args) throws CustomException {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
		
		cvp.publish();
	}
}
