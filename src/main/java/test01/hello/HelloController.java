package test01.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 * @author kinglyjn
 * @date 2018年7月21日
 *
 */
@RestController
@RequestMapping("/test01")
public class HelloController {
	
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${ctx}")
	private String ctx;
	@Autowired
	private JdbcProperties jdbcProperties;
	@Autowired
	private GirlService girlService;
	
	
	@RequestMapping("/hello1")
	public String hello1() {
		String result = url + "<br>" + ctx + "<br>" + jdbcProperties;
		return result;
	}

	@RequestMapping("/hello2/{id}")
	public String hello2(@PathVariable(value="id", required=false) Integer myId) {
		return "hello2" + ", id=" + myId;
	}
	
	@RequestMapping("/hello3")
	public String hello3(@RequestParam(value="id", defaultValue="0") Integer myId) {
		return "hello3" + ", id=" + myId;
	}
	
	@RequestMapping("/hello4/???/haha") 	//?表示任意一个字符
	public String hello4() {
		return "hello4";
	}
	
	@GetMapping("/hello5/**/heihei") 		//**表示任意多层路径，*表示任意一层路径
	public String hello5() {
		return "hello5";
	}
	
	@PostMapping("/hello6/add")
	public String hello6() {
		girlService.addTwoGirls();
		return "SUCCESS";
	}
}
