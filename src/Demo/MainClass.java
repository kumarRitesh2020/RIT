package Demo;

public class MainClass {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		int result=c.add(20, 30);
		System.out.println(result);
		int result2=c.add(10, 20, 30);
		System.out.println(result2);

	}

}
