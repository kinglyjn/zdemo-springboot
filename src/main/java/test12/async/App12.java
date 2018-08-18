package test12.async;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync //将会查找响应类的注解中是否包含 @Async配置，如果有的话，就将其单独一个线程去执行
public class App12 {
	
	public static void main(String[] args) {
		SpringApplication.run(App12.class, args);
	}
}