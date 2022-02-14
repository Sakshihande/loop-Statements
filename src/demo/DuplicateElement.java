package demo;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= new int[]{4,3,3,4,2,3,2};
		
		for( int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]==a[j])
					
				System.out.println("The Duplicate element is:"+a[j]);
				
					
			}
		}

	}

}
