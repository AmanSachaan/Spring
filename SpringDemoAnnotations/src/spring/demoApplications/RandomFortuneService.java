package spring.demoApplications;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data=
            {
                    "Rcb",
                    "Csk",
                    "Mi",
                    "KKr",

            };
    private Random myRandom=new Random();

    public String getFortune() {
        int index=myRandom.nextInt(data.length);
        return data[index];
    }
}
