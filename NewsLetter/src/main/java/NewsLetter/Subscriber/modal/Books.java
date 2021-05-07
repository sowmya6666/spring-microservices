package NewsLetter.Subscriber.modal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="books")
public class Books {
	
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int Id;
	
	@Column
	public String name;
	
	/*@ManyToOne
	@JoinColumn (name="newsletter_id",referencedColumnName="Id",nullable=false,unique=true)
	NewsLetter  letter;
	
	*//**
	 * @return the letter
	 *//*
	public NewsLetter getLetter() {
		return letter;
	}

	*//**
	 * @param letter the letter to set
	 *//*
	public void setLetter(NewsLetter letter) {
		this.letter = letter;
	}*/

	
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
	
	

}
