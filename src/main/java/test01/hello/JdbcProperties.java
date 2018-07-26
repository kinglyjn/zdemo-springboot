package test01.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * JdbcProperties
 * @author kinglyjn
 * @date 2018年7月21日
 *
 */
@Component
@ConfigurationProperties(prefix="datasource")
public class JdbcProperties {
	private String url;
	private String driver;
	private String username;
	private String password;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "JdbcProperties [url=" + url + ", driver=" + driver + ", username=" + username + ", password=" + password
				+ "]";
	}
}
