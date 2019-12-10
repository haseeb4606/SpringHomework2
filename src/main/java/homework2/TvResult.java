package homework2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvResult {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springhomework2.xml");
		
		Remote rm = (Remote) ctx.getBean("rmot");
		rm.trunOnTv();
		

	}

}
