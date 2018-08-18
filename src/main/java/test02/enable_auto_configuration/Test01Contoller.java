package test02.enable_auto_configuration;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试 @EnableAutoConfiguration 注解
 * 这个注释告诉SpringBoot“猜”你将如何想配置Spring,基于你已经添加jar依赖项。如果
 * spring-boot-starter-web已经添加Tomcat和Spring MVC,这个注释自动将假设您正
 * 在开发一个web应用程序并添加相应的spring设置。自动配置被设计用来和“Starters”一
 * 起更好的工作,但这两个概念并不直接相关。您可以自由挑选starter依赖项以外的jar包，
 * springboot仍将尽力自动配置您的应用程序。
 *
 * spring通常建议我们将main方法所在的类放到一个root包下，@EnableAutoConfiguration
 * 注解通常都放到main所在类的上面，下面是一个典型的结构布局：
 * com                                     
 *  +- example                             
 *      +- myproject                       
 *          +- Application.java            
 *          |                              
 *          +- domain                      
 *          |   +- Customer.java           
 *          |   +- CustomerRepository.java 
 *          |                              
 *          +- service                     
 *          |   +- CustomerService.java    
 *          |                              
 *          +- web                         
 *              +- CustomerController.java 
 * 这样@EnableAutoConfiguration可以从逐层的往下搜索各个加注解的类，例如，你正在
 * 编写一个JPA程序（如果你的pom里进行了配置的话），spring会自动去搜索加了@Entity
 * 注解的类，并进行调用。          
 * 
 */
@RestController
@EnableAutoConfiguration //
@RequestMapping("/testunit02")
public class Test01Contoller {

	@RequestMapping("/test01/1")
	public List<String> test01() {
		return Arrays.asList("a", "b", "c");
	}
	
	 /*
	 * main
	 * 
	 */
	public static void main(String[] args) {
		SpringApplication.run(Test01Contoller.class, args);
	}
}
















