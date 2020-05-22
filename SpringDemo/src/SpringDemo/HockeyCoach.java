package SpringDemo;

public class HockeyCoach implements Coach {
    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Email Setter");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("Team Setter");
        this.team = team;
    }

    public HockeyCoach()
    {
        System.out.println(" No arg Constructor of Hockey");
    }

    public void  setFortuneService(FortuneService fortuneService)
    {
        System.out.println("setFortuneService");
        this.fortuneService=fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return " 10 hockey goals ";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
