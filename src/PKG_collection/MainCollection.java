package PKG_collection;
import java.util.ArrayList;
import java.util.Collections;
public class MainCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Bean_Class bean=new Bean_Class("Red","ZARA",12000.89);
		Bean_Class bean1= new Bean_Class("Black","Arrow",1234.23);
		Bean_Class bean2=new Bean_Class("Blue","Guess",7959.23);
		
		ArrayList<Bean_Class>a1=new ArrayList<Bean_Class>();
		a1.add(bean);
		a1.add(bean1);
		a1.add(bean2);
		
	    Collections.sort(a1);
		for(Bean_Class obj:a1) {
			System.out.println("Brand::"+obj.getBrand());
			System.out.println("Price::"+obj.getPrice());
			System.out.println("color::"+obj.getColor());
			System.out.println(" "+obj);
		}
		
				
				
				
				
				
		


	}

}
