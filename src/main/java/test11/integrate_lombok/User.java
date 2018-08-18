package test11.integrate_lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
public class User {
	private String name;
	private int age;

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}
	
	public static void main(String[] args) {
		
	}
}
