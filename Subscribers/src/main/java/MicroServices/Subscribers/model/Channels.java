package MicroServices.Subscribers.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="channal_details")
public class Channels {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	
	
	public String name;
	
	/*@ManyToMany(cascade=CascadeType.ALL,targetEntity=Subscriber.class)
	@JoinColumn(name="subscriberId")*/
	/*@ManyToMany
	List<Subscriber> subscribers= new ArrayList<Subscriber>();*/

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the subscribers
	 *//*
	public List<Subscriber> getSubscribers() {
		return subscribers;
	}

	*//**
	 * @param subscribers the subscribers to set
	 *//*
	public void setSubscribers(List<Subscriber> subscribers) {
		this.subscribers = subscribers;
	}*/
	
	
	

}
