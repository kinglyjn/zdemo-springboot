package test12.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testunit12")
public class UserController {

	@Autowired
	private UserService userService;

	
	@RequestMapping("/test01/addMemberAndEmail")
	public String addMemberAndEmail(String username) {
		System.err.println("1");
		
		String result = userService.sendEmail(username);
		
		System.err.println("4");
		return result;
		
		/*
		
		 1
		 4
		 2, username=zhangsan
		 3, result=ok
		 
		*/
	}
}
