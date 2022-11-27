package Qspider;

public class PragrammingLanguage implements Language {

	public static void main(String[] args) {
		
		PragrammingLanguage language=new PragrammingLanguage();
		language.getName("java");
		
		

	}

	@Override
	public void getName(String name) {
		System.out.println("Programmin language is"+name);
	}

}
