package Week2;

public class MethodsPracticeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sayHello ("John");
		sayGoodbye();
		
//		String greeting = sayHelloX ("Herbert");
		sayHello(sayHelloX ("Herbert"));
		
	}
	private static void sayHello(String line){ //this method doesn't return anything so use "void"
		System.out.println("Hello " + line);
	}
	
	private static void sayGoodbye() {
		System.out.println("Goodbye");
	}
	
	private static String sayHelloX(String line){
		return line;
}
}