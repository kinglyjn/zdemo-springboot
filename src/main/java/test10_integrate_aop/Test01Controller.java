package test10_integrate_aop;

import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testunit10")
public class Test01Controller {
	
	@RequestMapping("/test01/1")
	public String test01(Map<String,Object> map) {
		return "haha";
	}
}
