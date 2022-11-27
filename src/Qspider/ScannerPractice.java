25package Qspider;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a first number:");
		int a=sc.nextInt();
		
		System.out.println("Enter a second number:");
		int b=sc.nextInt();
		
		
			System.out.println("before swapping a is"+a+"and b is "+b);
			int temp;
			temp=a;
			a=b;
			b=temp;
			System.out.println("after swapping a is"+a+"and b is "+b);
		}

	}


