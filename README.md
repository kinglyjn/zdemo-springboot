# zdemo-springboot

## 什么是springboot？

	springboot：
	a) 是一个快速开发框架，能够帮助我们快速整合第三方常用 框架（maven依赖和继承）
	b) 配置完全注解化，大大简化了传统的XML配置
	c) 内置了http服务器（tomcat、jetty）
	d) 最终可以以java应用程序执行（java -jar）
	
	springcloud：
	是目前为止比较完整的微服务解决框架，主要核心的一些模块：
	a) 注册中心 Eureka
	b) 客户端调用工具
	c) 服务治理（负载均衡、断路器、分布式配置中心、网关、服务链路、消息总线等） 
	
	springboot与springcloud的区别：
	单纯的springboot只是实现应用的快速快发，而springcloud依赖于springboot，是一套完整的微服务解决框架，
	通常涉及到服务治理和RPC远程通讯等技术。
	
	springboot与springmvc的区别：
	springboot的web组件集成了springmvc框架。springbboot中并没有传统繁琐的配置文件，springboot如何启动springmvc呢？
	其实，springmvc自从3.0版本之后支持注解（@EnableWebMvc）方式启动应用服务。