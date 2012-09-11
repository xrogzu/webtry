package hessian.server;

public class HelloImpl implements Hello {
	
	public String hello(String name) {
		return "hello," + name + "! 欢迎学习Hessian";
	}
}