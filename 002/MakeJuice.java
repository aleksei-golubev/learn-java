/* This program is about juice.
 * Created as an example.
 */
 
// Juice class has two properties: size and fruit
class Juice {
	// Enum for size
	enum JuiceSize {
		SMALL,
		MEDIUM,
		LARGE
	}
	
	// Enum for fruit
	enum JuiceFruit {
		APPLE,
		ORANGE,
		MANGO
	}
	
	// Define properties
	JuiceSize size;
	JuiceFruit fruit;
}

// Program generates a large orange juice
public class MakeJuice {
	public static void main(String args[]) {
		// Construct new juice
		Juice juice = new Juice();
		
		// Set size and fruit
		juice.size = Juice.JuiceSize.LARGE;
		juice.fruit = Juice.JuiceFruit.ORANGE;
		
		// Help yourself
		System.out.println("Size: " + juice.size);		
		System.out.println("Fruit: " + juice.fruit);
	}
}