package NewsLetter.Subscriber.controller;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import NewsLetter.Subscriber.modal.NewsLetter;
import NewsLetter.Subscriber.service.NewsLetterService;

@RestController
public class NewsLetterController {
	
	@Autowired
	NewsLetterService newsletterService;
	
	@GetMapping("/")
	public List<NewsLetter> getNewsLettersList() {
		
		List<NewsLetter> newsletterList=newsletterService.findAllNewsLetterDetails();
		
		return newsletterList;
		
	}
	
	@PostMapping("/newletters")
	public String saveNewsLetters(@RequestBody NewsLetter newsLetter) {
	
		String id=newsletterService.saveNewsLetterDetails(newsLetter);
		return "Succssfullyinserted"+id;
	}

	@GetMapping("/{id}")
	@ResponseBody
	public Optional<NewsLetter> getNewslettersId(@PathVariable int id ) {
		
		Optional<NewsLetter> newsLetter=newsletterService.findNewsLetterDetails(id);
		return newsLetter;
		
	}
}
