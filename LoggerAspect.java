package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggerAspect {
  @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void logger(JoinPoint jp) {
	 String str= jp.getArgs()[0].toString();
  	  System.out.println("Logger called: "+str);
    }
//	  @After("execution(* demo.ShoppingCart.checkout(..))")
//	  public void afterLogger() {
//		  System.out.println("After logger called");
//	  }
	  
	  @Pointcut("within(demo..*)")
	  public void authPointcut() {
		  
	  }
	  @Before("authPointcut()")
	  public void auth() {
		  System.out.println("Request called");
	  }
	  
}
