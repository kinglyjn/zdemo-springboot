
1. 启动方式

	方式一：
	通过@SpringBootApplication注解的类的main方法启动
	
	方式二：
	通过maven插件启动 $mvn springboot:run
	
	方式三：
	通过java命令行启动 $java -jar xxxx.jar
	
	
	
2. 配置文件
	
	支持两种格式的文件 application.properties 或 application.yml（推荐）
	文件位置默认为类路径的根目录，默认名称为 application.xxx
	
	多环境下的配置文件：
	application.yml
		----------------
		# set active env
		spring:
	 		profiles:
	    	active: prod
		-----------------
	application-dev.yml
	application-prod.yml
	

	
3. 热启动和热部署的实现
	
	a.热启动的实现方式
	<!-- 主程序热启动依赖包 -->
	<dependency>
      	<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-devtools</artifactId>
		<scope>provided</scope>
		<optional>true</optional>
    </dependency>
    
    b.MVN热部署的实现方式
    <plugin>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-maven-plugin</artifactId>
		<dependencies>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>springloaded</artifactId>
                <version>1.2.8.RELEASE</version>
            </dependency>
        </dependencies>
	</plugin>



4. SpringBoot的默认模板引擎
	
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-thymeleaf</artifactId>
	</dependency>
	
	resources
		|--static
			|--img
				|--favicon.ico
		|--templates
			|--xxx.html
	






	