package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>arrL=new ArrayList<Integer>();
		
		ArrayList<Integer>aarL1 =new ArrayList<Integer>();
		
		
		arrL.add(1);
		arrL.add(45);
		arrL.add(100);
		
		arrL.add(123);
		arrL.add(23);
		arrL.add(123);
		
		arrL.addAll(arrL);
		for(int x:arrL) {
			System.out.println(x);
		}
		System.out.println(arrL);
		}
		

	}


