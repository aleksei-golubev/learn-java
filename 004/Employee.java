//import java.io.*

public class Employee {
	String name;
	String position;
	int age;
	double salary;
	
	public Employee(String name, String position, int age, double salary) {
		this.name = name;
		this.position = position;
		this.age = age;
		this.salary = salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Position: " + position);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
	}
}