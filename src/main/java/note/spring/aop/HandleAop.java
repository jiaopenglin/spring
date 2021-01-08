package note.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HandleAop {
    /**
     * 切点表达式:
     *     ..两个点表明多个，*代表一个
     *     表达式代表切入com..service包下的所有类的所有方法，方法参数不限，返回类型不限。
     *  其中访问修饰符可以不写，不能用*，，第一个*代表返回类型不限，第二个*表示所有类，第三个*表示所有方法，..两个点表示方法里的参数不限。
     */
    private final String POINT_CUT = "execution(* com.spring.*..*(..))";
    /**
     * 命名切点
     * public 切点可访问性修饰符
     *         与类可访问性修饰符的功能是相同的，它可以决定定义的切点可以在哪些类中可使用。
     * pointCut 切点名称
     * void   返回类型
     *
     *     因为命名切点仅利用方法名及访问修饰符的信息，
     *  一般定义方法的返回类型为 void ，并且方法体为空
     */
    @Pointcut(POINT_CUT)
    public void pointCut(){}

    /**
     * 在切点方法之前执行
     * @param
     */
    @Before(value="pointCut()")
    public void doBefore(){
        System.out.println("@Before：切点方法之前执行.....");
    }

    @After(value="pointCut()")
    public void   after(){

        System.out.println("aop方法执行完  after");
    }




}
