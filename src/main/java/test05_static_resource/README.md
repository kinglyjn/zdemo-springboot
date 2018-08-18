
### springboot静态资源处理

	springboot默认将静态资源目录放在classpath下，目录名称需要符合如下规则：
	
	/static
	/public
	/resources
	/META-INF/resources
	[注] 在这些目录下面放置的静态资源，访问路径没有static或public等中间路径，这些目录只是springboot放置静态
	资源的目录，不代表真实的访问路径URL。
	
	举例：我们可以在 src/main/resources/ 目录下创建 static目录，在static目录下放置一张图片，启动程序后访问
	http://localhost:8080/xxx.jpg，如能显示图片则表示配置成功。
	
	
	