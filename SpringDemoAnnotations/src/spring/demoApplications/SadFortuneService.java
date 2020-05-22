package spring.demoApplications;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "This is a SadFortuneService Class";
    }
}
