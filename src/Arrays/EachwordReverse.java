package Arrays;

public class EachwordReverse {

	public static void main(String[] args) {
		String s="i am rahul";
		String[]str=s.split(" ");
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
			
		}

	}

}
