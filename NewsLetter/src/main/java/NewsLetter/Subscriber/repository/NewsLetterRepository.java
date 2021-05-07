package NewsLetter.Subscriber.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import NewsLetter.Subscriber.modal.NewsLetter;

public  interface NewsLetterRepository extends JpaRepository<NewsLetter,Integer> {

	  
}
