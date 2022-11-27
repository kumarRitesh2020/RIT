package Qspider;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=5,firstTerm=0,secondTerm=1;
		System.out.println("fibonacci series till"+n+" ");
		
		for(int i=1;i<n+1;i++) {
			
			System.out.println(firstTerm+" ");
			
		
		int nextTerm=firstTerm+secondTerm;
		firstTerm=secondTerm;
		secondTerm=nextTerm;

	}

}}
