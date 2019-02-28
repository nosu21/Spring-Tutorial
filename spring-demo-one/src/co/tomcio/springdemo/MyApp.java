package co.tomcio.springdemo;

public class MyApp {

	public static void main(String[] args) {

		//create object
		Coach theCoach = new TrackCoach(); //its hardcodede, should be configurable
		
		//use object
		System.out.println(theCoach.getDailyWorkout());
	}

}
