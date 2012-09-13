package sitemesh;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller  
public class TestController {  
    @RequestMapping(value="/hello", method=RequestMethod.GET)  
    public void sayHello(Model model){  
        model.addAttribute("timestamp",new Long(System.currentTimeMillis()));  
    }  
} 