package MicroServices.Subscribers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import MicroServices.Subscribers.model.Subscriber;

//import SpringBootWithJPA.micro.model.Subscriber;



public interface SubscriberRepository extends JpaRepository<Subscriber, Integer> {

	
}
