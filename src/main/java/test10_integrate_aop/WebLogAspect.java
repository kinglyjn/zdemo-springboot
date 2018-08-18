package test10_integrate_aop;

import java.util.Enumeration;
import javax.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * WebLogAspect 应用层日志切面
 *
 */
@Component
@Aspect
public class WebLogAspect {
	private static final Logger LOGGER = LoggerFactory.getLogger(WebLogAspect.class);
	
	/** 
     * 声明一个切入点（包括切入点表达式和切入点签名） 
     */  
    @Pointcut("execution(* test10_integrate_aop.Test01Controller.*(..))")  
    public void webLog(){}  
	
    
    /** 
     * 声明一个前置通知 
     */  
    @Before(value="webLog()")
    public void beforeAdvide(JoinPoint point) {  
    	// 接收到请求，记录请求内容
    	ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
    	HttpServletRequest request = attributes.getRequest();
    	
    	// 记录下请求内容
    	LOGGER.info("URL: " + request.getRequestURL().toString());
    	LOGGER.info("HTTP_METHOD: " + request.getMethod());
    	LOGGER.info("IP: " + request.getRemoteAddr());
    	Enumeration<String> namesEnumeration = request.getParameterNames();
    	while (namesEnumeration.hasMoreElements()) {
    		String name = namesEnumeration.nextElement();
    		String value = request.getParameter(name);
    		LOGGER.info("PARAM: name={}, value={}", name, value);
    	}
    }
    
    /** 
     * 声明一个返回后通知 
     */ 
    @AfterReturning(value="webLog()", returning="ret")
    public void afterReturningAdvice(JoinPoint point, Object ret) {
    	LOGGER.info("RESPONSE: " + ret);
    }
}
