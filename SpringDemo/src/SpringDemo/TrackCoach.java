package SpringDemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;
    public TrackCoach()
    {

    }
    public TrackCoach(FortuneService fortuneService)
    {
        this.fortuneService=fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Track Coach Runs 100km ";
    }

    @Override
    public String getDailyFortune() {
        return "track"+fortuneService.getFortune();
    }
    public void doMyStartupStuff()
    {
        System.out.println("Do my StartUp Stuff");
    }
    public void doMyCleanupStuff()
    {
        System.out.println("Do my Cleanup Stuff");
    }
}
