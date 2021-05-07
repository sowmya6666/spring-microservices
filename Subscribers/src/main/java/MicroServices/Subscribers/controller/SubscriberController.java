package MicroServices.Subscribers.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import MicroServices.Subscribers.model.ResponseVO;
import MicroServices.Subscribers.model.Subscriber;
import MicroServices.Subscribers.subscriberservice.SubscriberService;


@RestController
@RequestMapping("/subscriber")
public class SubscriberController {
	
	@Autowired
	SubscriberService subscriberService;
	
	
	@PostMapping("/subscriberDetails")
	public String saveSubscriberDetails(@RequestBody Subscriber subscriber){
		
		try {
			subscriberService.saveSubscriberDetails(subscriber);
		return "Succesfully inserted";
		}catch(Exception e) {			e.printStackTrace();
			return "Userdetails are not saved";
		}
		
	}
	
	@GetMapping("/subcribersnewsletters/{Id}")
 public ResponseVO getSubscribersNewsLetters(@PathVariable int Id ) {
		ResponseVO vo=	subscriberService.findSubWithNewsLetters(Id);
		
	return vo;
		
	}

}
