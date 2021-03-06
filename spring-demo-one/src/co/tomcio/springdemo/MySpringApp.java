package co.tomcio.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
	
		//load the spring configurtion file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");		
		//retrieve bean from spring container	
		Coach theCoach  = context.getBean("myCoach", Coach.class);				
		//call methods on the bean		
		System.out.println(theCoach.getDailyWorkout());	
		// lets call new method for fortunes	
		System.out.println(theCoach.getDailyFortune());
		//close context
		context.close();

	}

}
