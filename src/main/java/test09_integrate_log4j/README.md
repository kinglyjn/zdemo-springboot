
### springboot整合log4j

	1. 依赖
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-log4j</artifactId>
		<version>1.3.8.RELEASE</version>
	</dependency>
	
	2. 使用
	private static final Logger LOGGER = LoggerFactory.getLogger(Xxx.class);
	...
	LOGGER.info("xxx");
	
	