package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import kr.co.softsoldesk.config.BeanConfigClass;


public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("===============XML===============");
	      ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
	      
	    
	      System.out.println();
	      
	      ctx1.close();
	      System.out.println();
	      
	      System.out.println("===============JAVA===============");
	      AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
	    
	      System.out.println();
	      ctx2.close();
	      
		
	}
	
}
