package foo.bar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloService helloService = context.getBean("helloService1",HelloService.class);
        System.out.println(helloService.sayHello());
        System.out.println(helloService.getMsg());

        HelloService helloService2 = context.getBean("helloService2", HelloService.class);
        System.out.println(helloService2.sayHello());
        System.out.println(helloService2.getMsg());

        HelloService helloService3 = context.getBean("p", HelloService.class);
        System.out.println(helloService3.sayHello());
        System.out.println(helloService3.getMsg());
    }
}

