package SpringDemo;

public class CricketCoach implements Coach {


    private FortuneService fortuneService;
    public CricketCoach(FortuneService fortuneService)
    {
        this.fortuneService=fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Coach teels to score 200 runs ";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
