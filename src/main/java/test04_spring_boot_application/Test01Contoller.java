package test04_spring_boot_application;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testunit04")
public class Test01Contoller {

	@RequestMapping("/test01/1")
	public List<String> test01() {
		return Arrays.asList("a", "b", "c");
	}
}
















