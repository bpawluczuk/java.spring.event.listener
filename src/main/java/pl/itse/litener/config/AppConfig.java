package pl.itse.litener.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ResourceBundleMessageSource;

import pl.itse.listener.example.CustomEventPublisher;

@Configuration
@ComponentScan(basePackages="pl.itse.listener.example")
public class AppConfig {
	
	@Bean("customEventPublisher")
	public CustomEventPublisher customEventPublisher() {
		return new CustomEventPublisher();
	}
}
