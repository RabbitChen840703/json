package com.example.json.objectmapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@RestController
public class ObjectMapperController{
	@GetMapping("/convert")
	public String convert() throws JsonProcessingException{
		User user = new User();
		user.setId(1);
		user.setName("Judy");
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonResult = objectMapper.writeValueAsString(user);
		System.out.println("jsonResult: " + jsonResult);
		String json = "{\"id\":1,\"name\":\"Judy\"}";
		objectMapper.readValue(json, User.class);
		return "convert success";
	}
}