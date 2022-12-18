import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld1 = (HelloWorld) applicationContext.getBean("helloworld");
//        System.out.println(helloWorld1.getMessage());
        HelloWorld helloWorld2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("\"HelloWorld\" beans are matches: " + (helloWorld1 == helloWorld2));

        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println("\"Cat\" beans are matches: " + (cat1 == cat2));
    }
}