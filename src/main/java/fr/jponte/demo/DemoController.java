package fr.jponte.demo;

import org.springframework.web.bind.annotation.RestController;
import javax.inject.Inject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("demo-controller") 
public class DemoController { 
	
	@Inject
	private DemoTraitement demoTraitement;
	
    @RequestMapping("/{param}")
    public Integer traitement(@PathVariable(value = "param") Integer param) throws Exception {
    	return demoTraitement.traitement(param);
    }
    
}
