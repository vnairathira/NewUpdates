package java8;

public class ComporatorEx {

	private String name;
	private int salry;
	private int age;
	
	public ComporatorEx(String name, int salry, int age) {
		super();
		this.name = name;
		this.salry = salry;
		this.age = age;
	}
	@Override
	public String toString() {
		return "ComporatorEx [name=" + name + ", salry=" + salry + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalry() {
		return salry;
	}
	public void setSalry(int salry) {
		this.salry = salry;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
