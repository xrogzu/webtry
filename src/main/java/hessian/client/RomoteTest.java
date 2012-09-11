package hessian.client;

import hessian.server.Hello;

import java.net.MalformedURLException;
import com.caucho.hessian.client.HessianProxyFactory;

public class RomoteTest {
	
	public static void main(String[] args) {
		// hessian服务的url 其中hessian-v1是项目名
		String url = "http://127.0.0.1:8080/webtry/hessianService";
		
		// 创建HessianProxyFactory实例
		HessianProxyFactory factory = new HessianProxyFactory();
		
		// 获得Hessian服务的远程引用
		try {
			Hello hello = (Hello) factory.create(Hello.class, url);
			System.out.println(hello.hello("kingtoon"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}