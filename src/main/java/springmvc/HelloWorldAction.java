package springmvc;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//实现了Controller接口,需要在导入spring.jar包
public class HelloWorldAction implements Controller{
    private Logger logger=Logger.getLogger(this.getClass().getName());
    private String helloWorld;
    private String viewPage;

public String getHelloWorld() {
        return helloWorld;
    }

    public void setHelloWorld(String helloWorld) {
        this.helloWorld = helloWorld;
    }

    public String getViewPage() {
        return viewPage;
    }

    public void setViewPage(String viewPage) {
        this.viewPage = viewPage;
    }

    //    实现Controller接口中的handleRequest方法
    public ModelAndView handleRequest(HttpServletRequest req,
            HttpServletResponse res) throws Exception {
        // TODO Auto-generated method stub
        
        Map<String, String> model=new HashMap<String, String>();
        model.put("helloWorld",getHelloWorld());
        return new ModelAndView(getViewPage(),model);
        
    }
    
    protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView model = new ModelAndView("HelloWorldPage"); //加上配置文件中的prefix和suffix就是完整的URL 
		model.addObject("msg", "hello world"); //设置模型的值，在视图中可以访问  

		return model;
	}
    

}