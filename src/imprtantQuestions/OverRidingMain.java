package imprtantQuestions;

public class OverRidingMain {

	public static void main(String[] args) {
		
		Sbi s=new Sbi();
		s.intrest();
		Rbi r=new Rbi();
		r.intrest();
		Sbi sr=new Rbi();
		sr.intrest();

	}

}
