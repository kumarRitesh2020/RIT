package Demo;

public class swap2Variable {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("before swapping a & b are "+a+" "+b);
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("after swapping a & b are "+a+" "+b);

	}

}
