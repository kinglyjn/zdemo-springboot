package test04_spring_boot_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 测试 @SpringBootApplication 注解
 * 该注解被 @Configuration、@EnableAutoConfiguration、@ComponentScan修饰
 * 换言之 @SpringBootApplication 提供了统一的注解来替代以上三个注解，扫包范围
 * 为：与当前启动类同级的包及其子包
 * 
 */
@SpringBootApplication
public class App04 {

	public static void main(String[] args) {
		SpringApplication.run(App04.class, args);
	}
}
