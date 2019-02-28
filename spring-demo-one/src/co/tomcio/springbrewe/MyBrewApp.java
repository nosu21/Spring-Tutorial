package co.tomcio.springbrewe;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBrewApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("breweContext.xml");
		
		Brewed cider = context.getBean("myCider", Brewed.class);
		Brewed beer = context.getBean("myBeer", Brewed.class);
		
		System.out.println(cider.getBrewedType());
		System.out.println(beer.getBrewedType());
		
		context.close();

	}

}
