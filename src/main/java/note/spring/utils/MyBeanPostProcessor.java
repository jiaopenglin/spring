package note.spring.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    public MyBeanPostProcessor() {
        super();
        System.out.println("这是BeanPostProcessor实现类构造器！！");
        // TODO Auto-generated constructor stub
    }
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor接口方法postProcessAfterInitialization对属性进行更改！");
        System.out.println(beanName+"BeforeInitialization"+bean.toString());
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
      //  System.out.println("BeanPostProcessor接口方法postProcessBeforeInitialization对属性进行更改！");
        System.out.println(beanName+"*********BeanPostProcessor接口方法postProcessBeforeInitialization后处理了"+bean.toString());

        return bean;
    }
}
