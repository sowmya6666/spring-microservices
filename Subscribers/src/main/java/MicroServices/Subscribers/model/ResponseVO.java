package MicroServices.Subscribers.model;



public class ResponseVO {

	 Subscriber subscriber;
	 
	 NewsLetter newsLetter;

	/**
	 * @return the subscriber
	 */
	public Subscriber getSubscriber() {
		return subscriber;
	}

	/**
	 * @param subscriber the subscriber to set
	 */
	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}

	/**
	 * @return the newsLetter
	 */
	public NewsLetter getNewsLetter() {
		return newsLetter;
	}

	/**
	 * @param newsLetter the newsLetter to set
	 */
	public void setNewsLetter(NewsLetter newsLetter) {
		this.newsLetter = newsLetter;
	}
}
