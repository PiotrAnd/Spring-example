package Spring.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class IndexAOP {

    Logger logger = Logger.getRootLogger();

    @After("execution(* Spring.controllers.IndexController.index(..))")
    public void visitMainPage(JoinPoint joinPoint){
        logger.info("Someone enters main page");
    }
}
