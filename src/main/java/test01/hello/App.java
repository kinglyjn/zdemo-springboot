package test01.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 测试 @SpringBootApplication 注解
 * 使用@SpringbootApplication注解  可以解决根类或者配置类（我自己的说法，就是main所在类）头上注解过多的问题，
 * 一个@SpringbootApplication相当于@Configuration,@EnableAutoConfiguration和@ComponentScan 并具有
 * 他们的默认属性值。
 * 
 * [注意] App.java文件不能直接放在main/java文件夹下，必须要建一个包把他放进去
 *
 *
 */
@SpringBootApplication
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
