package MicroServices.Subscribers.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import MicroServices.Subscribers.model.Books;

@Entity
@Table(name="newsletter")
public class NewsLetter {
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	@Column
	public int newsLetterId;
	/**
	 * @return the newsLetterId
	 */
	public int getNewsLetterId() {
		return newsLetterId;
	}
	/**
	 * @param newsLetterId the newsLetterId to set
	 */
	public void setNewsLetterId(int newsLetterId) {
		this.newsLetterId = newsLetterId;
	}
	@Column
	public String name;
	@OneToMany(targetEntity=Books.class, cascade = CascadeType.ALL)
	@JoinColumn(name="newsletterid")
	List<Books> books= new ArrayList<Books>();
	@OneToMany(targetEntity=Articles.class,  cascade = CascadeType.ALL)
	@JoinColumn(name="newsletterid")
	List<Articles> articles=new ArrayList<Articles>();
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
	 * @return the books
	 */
	public List<Books> getBooks() {
		return books;
	}
	/**
	 * @param books the books to set
	 */
	public void setBooks(List<Books> books) {
		this.books = books;
	}
	/**
	 * @return the articles
	 */
	public List<Articles> getArticles() {
		return articles;
	}
	/**
	 * @param articles the articles to set
	 */
	public void setArticles(List<Articles> articles) {
		this.articles = articles;
	}
	
	
}
