public class LoopsAndConditions {
	public static void main(String args[]) {
		printMenu();
		
		int op = inputOperationNumber();
		
		sep();
		
		switch (op) {
			case 1: whileLoop();
					break;
			case 2: doWhileLoop();
					break;
			case 3: forLoop();
					break;
			default:
					pstr("We have no case for this value: " + op + ". Bye!");
		}
	}
	
	public static int inputOperationNumber() {
		String inputNumber = System.console().readLine();
		
		try {
			return Integer.parseInt(inputNumber);
		} catch (Exception e) {
			pstr("Problems with parsing your input. We will use \"0\" as value.");
			return 0;
		}
	}
	
	public static void printMenu() {
		pstr("Hi! Please, choose statement: ");
		pstr("1 - use 'while (a < b ) { ... }'");
		pstr("2 - use 'do { ... } while (a < b )'");
		pstr("3 - use 'for(int a = 10; a < b; a++) { ... }'");
	}
	
	public static void whileLoop() {
		int a = 10;
		int b = 20;
		
		pstr("while (a < b) { ... }\n");
		
		while (a < b) {
			pstr("[a = " + a + ", b = " + b + "]");
			a++;
		}
	}

	public static void doWhileLoop() {
		int a = 20;
		int b = 20;

		pstr("do { ... } while (a < b)\n");
		
		do {
			pstr("[a = " + a + ", b = " + b + "]");
			a++;
		} while (a < b);
	}
	
	public static void forLoop() {
		int b = 20; 
		
		pstr("for(int a = 10; a < b; a++) { ... }");
		
		for(int a = 10; a < b; a++) {
			pstr("[a = " + a + ", b = " + b + "]");
		}
	}
	
	public static void pstr(String str) {
		System.out.println(str);
	}
	
	public static void sep() {
		pstr("-----------------------\n");
	}
}