package MicroServices.Subscribers.subscriberservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import MicroServices.Subscribers.model.NewsLetter;
import MicroServices.Subscribers.model.ResponseVO;
import MicroServices.Subscribers.model.Subscriber;
import MicroServices.Subscribers.repository.SubscriberRepository;



@Service
@Transactional
public class SubscriberService {
	
	@Autowired
	SubscriberRepository subscriberRepository;
	
	
	 
	
	
	public Object saveSubscriberDetails(Subscriber subscriber) {
		
		return subscriberRepository.save(subscriber);
	}


	public ResponseVO findSubWithNewsLetters(int subId) {

	ResponseVO vo= new ResponseVO();
Subscriber sub =	subscriberRepository.findById(subId).orElse(new Subscriber());
RestTemplate restTemplate = new RestTemplate();
NewsLetter newsLetter= restTemplate.getForObject("http://localhost:8084/"+sub.getNewsLetterId(), NewsLetter.class);
vo.setNewsLetter(newsLetter);
vo.setSubscriber(sub);
		return vo;
	}

}
