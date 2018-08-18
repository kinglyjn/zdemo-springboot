package test08_controller_advice;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 采用AOP技术实现全局捕获异常
 * 
 */
@ControllerAdvice(basePackages={"test08_controller_advice"})
public class GlobalExceptionHandler {

	
	@ExceptionHandler(RuntimeException.class) //
	@ResponseBody
	public Map<String,Object> error(HttpServletRequest request, Exception ex) {
		Map<String, Object> resultMap = new HashMap<String,Object>();
		resultMap.put("errorCode", 500);
		resultMap.put("errorMsg", ex.getMessage());
		return resultMap;
	}
}
