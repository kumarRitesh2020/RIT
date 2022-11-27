package Arrays;

public class BubbleShort {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		
		for(int i=0;i<arr.length;i++) {
		
		for(int j=i;j<arr.length;j++) {
			
			if(arr[i]>arr[j]) {
				
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			
			}}}
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			
			
			
			
		}

	}

}
