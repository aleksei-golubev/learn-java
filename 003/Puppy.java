public class Puppy {
	String puppyName;
	int puppyAge;
		
	public Puppy(String name, int age, boolean printOnCreate) {
		setName(name);
		setAge(age);

		if (printOnCreate) {
			System.out.println("Puppy name is " + puppyName + ".");
			System.out.println("Puppy age is " + puppyAge + ".");
		}
	}

	public void setName(String name) {
		puppyName = name;
	}
	
	public String getName() {
		return puppyName;
	}
	
	public void setAge(int age) {
		puppyAge = age;
	}
	
	public int getAge() {
		return puppyAge;
	}
	
	public static void main(String []args) {
		Puppy puppy = new Puppy(
			args.length > 0 ? args[0] : "Ronny",
			args.length > 1 ? Integer.parseInt(args[1]) : 1,
			args.length > 2 ? Boolean.parseBoolean(args[2]) : false
		);
		
		puppy.setAge(puppy.getAge() + 1);
		puppy.setName("Big " + puppy.getName());
		
		System.out.println(puppy.getName() + " has grown. Now it is " + puppy.getAge() + ".");
	}
}