package fr.jponte.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@SpringBootApplication
public class DemoTraitement{
	public Integer traitement(Integer param) throws Exception{
//		if (param.equalsIgnoreCase("nul")) {
//			throw new ResponseStatusException(
//					  HttpStatus.NOT_FOUND, "Rien n'est nul ici !!"
//					);
//		} 
		return param;
	}
}