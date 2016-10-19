//import java.io.*

public class MakeEmployees {
	public static void main(String []args) {
		Employee bob = new Employee("Bob Smith", "Software Engineer", 24, 6400.50);
		Employee jack = new Employee("Jack White", "Project Manager", 32, 5040.15);
		pstr("Hello, we have two employees:");
		pstr("");
		
		printEmployees(bob, jack);
		sep();
		pstr("");
		
		jack.setSalary(bob.getSalary() + 1700.30);
		jack.setPosition("Product Owner");
		pstr(jack.getName() + " has a new position: ");
		pstr("");
		
		jack.printInfo();
		
		bob.setAge(bob.getAge() + 1);
		bob.setSalary(bob.getSalary() + 300);
		sep();

		pstr("Today is " + bob.getName() + "'s birth day. Now he is " + bob.getAge() +". So his salary is grown up to: " + bob.getSalary() + ".");
		sep();

		_pstr(jack.getName() + " decided to change his last name. Now he is: ");
		jack.setName("Jack Thunders");
		pstr(jack.getName() + ". ");
		sep();
		
		pstr("");
		pstr("Funally:");
		pstr("");
		printEmployees(bob, jack);
		
	}
	
	public static void sep() {
		pstr("-----------------");
	}
	
	public static void pstr(String str) {
		System.out.println(str);
	}
	
	public static void _pstr(String str) {
		System.out.print(str);
	}
	
	public static void printEmployees(Employee emp1, Employee emp2) {
		emp1.printInfo();
		sep();
		emp2.printInfo();
	}
}