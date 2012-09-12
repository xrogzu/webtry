package freemarker.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringMvcController {

	@RequestMapping(value = "/welcome", method = { RequestMethod.GET })
	public ModelAndView getFirstPage(HttpServletRequest request) {
		// welcom就是视图的名称（welcom.ftl）
		ModelAndView mv = new ModelAndView("welcom");
		mv.addObject("name", "me ,my tomorrow My First Spring Mvc2");
		return mv;
	}
}