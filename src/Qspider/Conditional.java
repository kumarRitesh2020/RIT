package Qspider;

import java.util.Scanner;

public class Conditional {
	
	

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4};
		int[] b= {5,6,3,1};
		int length=a.length;
		if(a.length<b.length) {
			length=b.length;
		}
		for(int i=0;i<length;i++) {
			try {
				System.out.println(a[i]+b[i]);
		
			
				
			} catch (Exception e) {
			
			
			
		if(a.length<b.length) {
			System.out.println(b[i]);
		}
		else {
			System.out.println(a[i]);
		}
		
		}}}}

