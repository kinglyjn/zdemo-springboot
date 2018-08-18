package test03_component_scan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ComponentScan 如果不设置basePackage的话 默认会扫描包的所有类，所以最好还是写上
 * basePackage ,减少加载时间。默认扫描** /*.class路径 比如这个注解在com.keyllo 
 * 下面 ，那么会扫描这个包下的所有类还有子包的所有类,比如com.keyllo.service包的应用
 * 
 */
@EnableAutoConfiguration
@ComponentScan("test03_component_scan")
public class App03 {
	
	public static void main(String[] args) {
		SpringApplication.run(App03.class, args);
	}
}
