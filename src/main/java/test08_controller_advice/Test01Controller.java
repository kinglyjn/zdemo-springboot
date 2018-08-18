package test08_controller_advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/testunit08")
public class Test01Controller {
	private static final Logger LOGGER = LoggerFactory.getLogger(Test01Controller.class);
	
	
	@RequestMapping("/test01/1")
	public String test01() {
		LOGGER.info("访问 /testunit08/test01/1 ");
		int j = 1/0;
		return "result=" + j;
	}
}
