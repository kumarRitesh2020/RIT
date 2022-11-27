package Arrays;

public class Ascending {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Ascending order"+arr[i]+" ");
		}

	}

}
