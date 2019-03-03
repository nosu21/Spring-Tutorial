package co.tomcio.springdemo;

public class TrackCoach implements Coach {
	//commit test
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDailyWorkout() {		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do It: "+fortuneService.getFortune();
	}
	
	// add an inti method
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: iside method doMyStartupStuff");
	}
	
	// add a destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach inside method doMyCleanupStuffYoYo");
	}

}
