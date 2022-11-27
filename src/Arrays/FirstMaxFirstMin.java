package Arrays;

public class FirstMaxFirstMin {

	public static void main(String[] args) {
		int[] arr= {8,3,4,32,86,4,5};
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("First max="+arr[arr.length-1]);
		System.out.println("First min="+arr[0]);
			}
			
			
		

	}


