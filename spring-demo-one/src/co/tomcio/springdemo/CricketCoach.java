package co.tomcio.springdemo;

public class CricketCoach implements  Coach {

	private FortuneService fortuneService;
	//fields
	private String emailAdress;
	private String team;
	private int numberOfMembers;
	
	// create non-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	
	// create a setter for injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practise fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}


	public String getEmailAdress() {
		return emailAdress;
	}


	public void setEmailAdress(String emailAdress) {
		System.out.println("CricketCoach: inside setter method - setEmailAdress");
		this.emailAdress = emailAdress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}


	public int getNumberOfMembers() {
		return numberOfMembers;
	}


	public void setNumberOfMembers(int numberOfMembers) {
		System.out.println("CricketCoach: inside setter method - setMembers");
		this.numberOfMembers = numberOfMembers;
	}
	
	
	
	

	

}
