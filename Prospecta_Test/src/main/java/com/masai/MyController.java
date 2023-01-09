package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class MyController {

	@Autowired
	private RestTemplate restTemplate;
	
	
	
	
//	Question 1
	@GetMapping("/entries/{category}")
	public List<ResultDto> getEntriesHandler(@PathVariable("category") String category){
		
		AllData data = restTemplate.getForObject("https://api.publicapis.org/entries", AllData.class);
		
		List<Entry> list = data.getEntries();
		
		List<ResultDto> resultDtos = new ArrayList<>();
		
		for (Entry l : list) {
			if (l.getCategory().equals(category)) {
				resultDtos.add(new ResultDto(l.getApi(),l.getDescription()));
			}
		}
		return resultDtos;
	}
	
	
	
	
//	Question 2
	@PostMapping("/entries")
	public String saveEntryHandler(@RequestBody Entry entry) {

		AllData data = restTemplate.postForObject("https://api.publicapis.org/entries", entry, AllData.class);
		data.getEntries().add(entry);

			return "added successfully !";		
		
	}
}


//Question 3

//ans : the key things we would consider while creating/consuming an API to secure and reliable 
//      that we should handle all the posible checked/uncheked exception, apply all the validation
//      properly and apply proper athentication and authorization.
	




















