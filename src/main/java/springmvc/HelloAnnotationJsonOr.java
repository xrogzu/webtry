package springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloAnnotationJsonOr {

	@RequestMapping("/hellome2")
	@ResponseBody
	public String hellome(@RequestParam String name, HttpServletRequest request, HttpServletResponse response){
		
		return "xxx";
	}
	
	/*@RequestMapping(value="/user/{userid}", method=RequestMethod.GET)
	public @ResponseBody User queryUser(@PathVariable("userid") long userID) {

	       Calendar d = Calendar.getInstance();

	       d.set(1987, 12, 9);

	       User u = new User();

	       u.setUserID(userID);

	       u.setUserName("zhaoyang");

	       u.setBirth(d.getTime());

	       return u;

	}*/
	
	
}
