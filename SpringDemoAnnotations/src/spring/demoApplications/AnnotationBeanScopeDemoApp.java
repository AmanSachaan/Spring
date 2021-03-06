package spring.demoApplications;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach=context.getBean("tennisCoach",Coach.class);
        Coach aplhaCoach=context.getBean("tennisCoach",Coach.class);

        boolean result=(theCoach==aplhaCoach);
        System.out.println(result);
        System.out.println("theCoach memory location "+theCoach);


        System.out.println("alphaCoach memory location"+aplhaCoach);

        context.close();


    }
}
