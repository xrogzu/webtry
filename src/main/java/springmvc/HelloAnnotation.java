package springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloAnnotation {

	@RequestMapping("/hellome")
	@ResponseBody
	public String hellome(@RequestParam String name, HttpServletRequest request, HttpServletResponse response){
		
		return "xxx";
	}
	
	 @RequestMapping("/hello")
	 public ModelAndView helloWorld() {

	  String message = "Hello World, Spring 3.0!";
	  System.out.println(message);
	  return new ModelAndView("hello", "message", message);
	 }
	
	
}
