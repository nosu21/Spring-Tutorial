package co.tomcio.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	Random rand = new Random();
	
	int n = rand.nextInt(3);
	
	String[] randomTab = {"Today is your lucky day!", "Today i feel mild", "Today is my bad day"};
	@Override
	public String getFortune() {
		return randomTab[n];
	}

}
