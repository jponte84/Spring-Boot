package fr.jponte.demo;

import org.springframework.web.bind.annotation.RestController;
import javax.inject.Inject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DemoController { 
	
	@Inject
	private DemoTraitement demoTraitement;
	
    @RequestMapping("/{param}")
    public String traitement(@PathVariable(value = "param") String param) throws Exception {
    	return demoTraitement.traitement(param);
    	
    }
    
}
