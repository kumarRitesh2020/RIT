package Demo;

public class reverseaString {

	public static void main(String[] args) {
		String s="xof nworb kciuq ehT";
//		StringBuffer st=new StringBuffer(s);
//		st.reverse();
//		System.out.println(st);
		
		
		char[]st=s.toCharArray();
		for(int i=st.length-1;i>=0;i--) {
			System.out.print(st[i]);
		}

	}

}
