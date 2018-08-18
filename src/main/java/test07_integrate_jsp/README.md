
### springboot整合jsp

	
	1. 依赖
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-web</artifactId>
	</dependency>

	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-tomcat</artifactId>
		<scope>provided</scope>
	</dependency>
	<dependency>
		<groupId>org.apache.tomcat.embed</groupId>
		<artifactId>tomcat-embed-jasper</artifactId>
	</dependency>
	[注意] springboot jsp项目的打包类型一定要是war类型的，因为项目最终是依靠外部web容器来跑的。
	
	
	2. 配置application.properties
	spring.mvc.view.prefix=/WEB-INF/views/
	spring.mvc.view.suffix=.jsp
	
	
	3. 后端程序
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	
	4. 前端jsp页面
     src
       +--main
             +--webapp
                     +--WEB-INF
                              +--views
                                     +--index.jsp
     
     
     
     
                                     
                                     
	
	