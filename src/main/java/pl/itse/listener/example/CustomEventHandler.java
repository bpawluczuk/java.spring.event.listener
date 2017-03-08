package pl.itse.listener.example;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service("customEventHandler")
public class CustomEventHandler implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(CustomEvent event) {
		System.out.println(event.toString());
	}

}
