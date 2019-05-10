package Spring.aop;

import java.util.Arrays;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ProductAOP {

    Logger logger = Logger.getRootLogger();

    @Before("execution(* Spring.services.ProductServiceImpl.deleteProduct(..))")
    public void beforeDeleteProduct(JoinPoint joinPoint) {
        logger.info("ProductController.deleteProduct() : " + joinPoint.getSignature().getName());
        Arrays.stream(joinPoint.getArgs()).forEach(logger::info);
    }
}
