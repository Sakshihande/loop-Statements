package PKG_collection;
import java.util.ArrayList;
import java.util.Collections;
public class StudentMainComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Bean_Class1> arr=new ArrayList<Bean_Class1>();
		arr.add(new Bean_Class1(202,"Sakshi",98504532));
		arr.add(new Bean_Class1(204,"Sayali",98504532));
		arr.add(new Bean_Class1(402,"Samiksha",98504532));
		arr.add(new Bean_Class1(212,"Krutika",98504532));
		
		Collections.sort(arr,new StudentComparator());
		for(Bean_Class1 b: arr) {
			System.out.println(b.getName()+" "+b.getContact(0)+" "+b.getId());
		}

		

	}

}
