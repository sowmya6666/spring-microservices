package MicroServices.Subscribers.model; 


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import MicroServices.Subscribers.model.Channels;

@javax.persistence.Entity
@Table(name="Subscriber")
public class Subscriber {
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int Id;
	
	@Column
	public String name;
	 
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	@OneToMany(targetEntity=MobileNumbers.class,cascade = CascadeType.ALL)
	 @JoinColumn(name = "subscriberId")
	List<MobileNumbers> mobileNumbers= new ArrayList<MobileNumbers>();
	
	/**
	 * @return the mobileNumbers
	 */
	public List<MobileNumbers> getMobileNumbers() {
		return mobileNumbers;
	}

	/**
	 * @param mobileNumbers the mobileNumbers to set
	 */
	public void setMobileNumbers(List<MobileNumbers> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}

	@OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="addressid")
	 Address address;

	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
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

	@ManyToMany(cascade=CascadeType.ALL,targetEntity=Channels.class)
	@JoinTable(
			  name = "subscriber_channel", 
			  joinColumns = @JoinColumn(name = "channal_detailsid"), 
			  inverseJoinColumns = @JoinColumn(name = "subscriberid"))
	List<Channels> channels= new ArrayList<Channels>();
	



	/**
	 * @return the channels
	 */
	public List<Channels> getChannels() {
		return channels;
	}

	/**
	 * @param channels the channels to set
	 */
	public void setChannels(List<Channels> channels) {
		this.channels = channels;
	}
	 public int NewsLetterId;

	/**
	 * @return the newsLetterId
	 */
	public int getNewsLetterId() {
		return NewsLetterId;
	}

	/**
	 * @param newsLetterId the newsLetterId to set
	 */
	public void setNewsLetterId(int newsLetterId) {
		NewsLetterId = newsLetterId;
	}

}
