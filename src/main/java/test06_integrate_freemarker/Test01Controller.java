package test06_integrate_freemarker;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@EnableAutoConfiguration
@Controller
@RequestMapping("/testunit06")
public class Test01Controller {
	
	@RequestMapping("/test01/1")
	public String test01(Map<String,Object> map) {
		map.put("name", "张三");
		map.put("sex", "1");
		map.put("age", 23);
		
		return "index";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(Test01Controller.class, args);
	}
}
