package imprtantQuestions;

public class OverLoadingMainClass {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		int result=c.add(10, 20);
		System.out.println(result);
		
		int result2=c.add(20, 20);
		System.out.println(result2);

	}

}
