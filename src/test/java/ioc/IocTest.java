package ioc;

import note.spring.model.User;
import note.spring.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-application.xml");
        User user = applicationContext.getBean("user", User.class);



    }

    /**
     * ioc注入方式
     * 构造方法注入
     */
    @Test
    public  void ioc1(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-application1.xml");
        User user = applicationContext.getBean("user", User.class);


    }
    /**
     * ioc注入方式
     * 构造方法注入
     */
    @Test
    public  void ioc2(){
        BeanNameAware d;
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-application1.xml");
        UserService userService = applicationContext.getBean( UserService.class);
        userService.update();

    }


}
