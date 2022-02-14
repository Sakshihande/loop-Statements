package array;

public class ShortestElement_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=  {12,26,11,75,98};
		int min=arr[0];
		for (int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Shortest element present in the given array."+min);
			
		}
}

	
