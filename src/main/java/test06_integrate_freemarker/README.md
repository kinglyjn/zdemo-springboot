
### springboot整合freemarker

	1.依赖：
	 <dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-freemarker</artifactId>
	 </dependency>
	
	2.在src/main/resources目录下创建 templates文件夹用于放置 *.ftl 文件
	
	3.后台代码
	 @RequestMapping("/xxx")
	 public String xxx(Map<String,Object> map) {
		 map.put("xxx", "xxx");
		 return "index";
	 }
	
	4.前台代码
	