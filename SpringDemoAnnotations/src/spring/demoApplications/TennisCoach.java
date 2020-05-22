package spring.demoApplications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("tennisCoach")
@Scope("singleton")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;
    @Override
    public String getDailyWorkout() {
        return "Practise Volley";
    }
//    @Autowired
//    public TennisCoach(FortuneService fortuneService)
//    {
//        this.fortuneService=fortuneService;
//    }
    public TennisCoach()
    {
        System.out.println("TennisCoach Default Cons");
    }
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService)
//    {
//        System.out.println("TennisCoach setter method");
//        this.fortuneService=fortuneService;
//    }
    @PostConstruct
    public void doMyStartupStuff()
    {
        System.out.println("insisde doMyStartUpStuff");
    }
    @PreDestroy
    public void doMyCleanupStuff()
    {
        System.out.println("inside my doMyCleanupstuff");
    }
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
