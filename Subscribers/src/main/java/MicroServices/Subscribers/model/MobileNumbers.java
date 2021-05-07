package MicroServices.Subscribers.model;
import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="MobileNumbers")
public class MobileNumbers {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	 public BigInteger mobileNumber;
	 public String type;
	
/*	 
	@ManyToOne
	@JoinColumn(name="subscriberid")
	Subscriber subscriber;


	
	*//**
	 * @return the subscriber
	 *//*
	public Subscriber getSubscriber() {
		return subscriber;
	}
	*//**
	 * @param subscriber the subscriber to set
	 *//*
	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}*/
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
	 * @return the mobileNumber
	 */
	public BigInteger getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(BigInteger mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	 

}
