package note.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

public class AnnotationAop {
    /**
     * 切点表达式:
     *     ..两个点表明多个，*代表一个
     *     表达式代表切入com..service包下的所有类的所有方法，方法参数不限，返回类型不限。
     *  其中访问修饰符可以不写，不能用*，，第一个*代表返回类型不限，第二个*表示所有类，第三个*表示所有方法，..两个点表示方法里的参数不限。
     */
    private final String POINT_CUT = "@annotation(com.spring.ioc.annotation.SystemLog.)";
    @Pointcut(POINT_CUT)
    public void pointCut(){}

    @Before(value="pointCut()")
    public void doBefore(ProceedingJoinPoint jp){
        System.out.println("@Before：切点方法之前执行.....");
    }

}
