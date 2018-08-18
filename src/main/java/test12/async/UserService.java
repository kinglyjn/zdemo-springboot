package test12.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	
	@Async //单独启动一个线程执行该方法
	public String sendEmail(String username) {
		System.err.println("2, username=" + username);
		
		try { Thread.sleep(5000); } catch (Exception e) {}
		
		System.err.println("3, result=ok");
		return "ok";
	}
}
