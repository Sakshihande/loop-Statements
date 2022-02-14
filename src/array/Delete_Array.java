package array;
import java.util.Arrays;
public class Delete_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []= {25,16,14,56,36,77,29};
		System.out.println("Original Array:"+Arrays.toString (a));
		int removeIndex=2;
		for(int i =removeIndex;i<a.length-1;i++) {
			a[i]=a[i+1];
			
		}
		System.out.println("After removing the third element :"+Arrays.toString(a));

	}

}
