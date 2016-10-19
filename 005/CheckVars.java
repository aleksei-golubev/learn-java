public class CheckVars {
	public static void main(String args[]) {
		pstr("Check vars v0.0.1");
		pstr("");
		TestClass test1 = new TestClass();
		TestClass test2 = new TestClass();
		test1.var1 = 34;
		test2.var2 = 334;
		
		pstr("test1.var1=" + test1.var1);
		pstr("test1.var2=" + test1.var2);
		pstr("test1.var3=" + test1.getVar3());
		pstr("test2.var1=" + test1.var1);
		pstr("test2.var2=" + test2.var2);
		pstr("test2.var3=" + test2.getVar3());
		pstr("---------------");
		
		test1.var2 = 22;
		test2.var1 = 44;
		
		test1.setVar3(3);
		
		pstr("test1.var1=" + test1.var1);
		pstr("test1.var2=" + test1.var2);
		pstr("test1.var3=" + test1.getVar3());
		pstr("test2.var1=" + test1.var1);
		pstr("test2.var2=" + test2.var2);
		pstr("test2.var3=" + test2.getVar3());
		pstr("\nBye!");
		
	}
	
	public static void pstr(String str) {
		System.out.println(str);
	}
}