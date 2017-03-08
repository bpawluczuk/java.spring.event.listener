package pl.itse.listener.example;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service("customEventPublisher")
public class CustomEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher applicationEventPublisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {

		this.applicationEventPublisher = applicationEventPublisher;
	}

	public void publish() {		
		CustomEvent ce = new CustomEvent(this);
		applicationEventPublisher.publishEvent(ce);
	}

}
