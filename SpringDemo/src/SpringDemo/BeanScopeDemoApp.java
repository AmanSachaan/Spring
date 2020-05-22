package SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String args[])
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        Coach theCoach=context.getBean("myCoach",Coach.class);
        Coach alphaCoach=context.getBean("myCoach",Coach.class);
        boolean result=(theCoach==alphaCoach);
        System.out.println("\nSame"+result);
        System.out.println("\n Coach "+theCoach);
        System.out.println("\n Alpha Coach "+alphaCoach);

    }
}

