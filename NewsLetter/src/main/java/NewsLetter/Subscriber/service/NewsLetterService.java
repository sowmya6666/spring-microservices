package NewsLetter.Subscriber.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import NewsLetter.Subscriber.modal.NewsLetter;
import NewsLetter.Subscriber.repository.NewsLetterRepository;

@Service
public class NewsLetterService {

	
	@Autowired
	NewsLetterRepository newsLetterRepository;
	
	
	public String saveNewsLetterDetails(NewsLetter newsLetter) {
		
		NewsLetter id=newsLetterRepository.save(newsLetter);
		return "successfully inserted"+id.getId();
		
	}
	
	public Optional<NewsLetter> findNewsLetterDetails(int id) {
		
		Optional<NewsLetter> letter=newsLetterRepository.findById(id);
		
		return letter;
		
		
	}
	
	
	public List<NewsLetter> findAllNewsLetterDetails() {
		
		List<NewsLetter> newsletters= newsLetterRepository.findAll();
		
		return newsletters;
	}
}
