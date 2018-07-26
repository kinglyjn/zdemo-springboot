package test01.hello;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="t_girl")
public class Girl implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String cupSize;

	public Girl(String name, String cupSize) {
		super();
		this.name = name;
		this.cupSize = cupSize;
	}
	public Girl() {
		super();
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="cup_size")
	public String getCupSize() {
		return cupSize;
	}
	public void setCupSize(String cupSize) {
		this.cupSize = cupSize;
	}

	@Override
	public String toString() {
		return "Girl [id=" + id + ", name=" + name + ", cupSize=" + cupSize + "]";
	}
}
