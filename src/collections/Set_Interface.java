package collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Set_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Double>set = new HashSet<Double>();
		set.add(2.4);
		set.add(3.4);
		set.add(4.4);
		set.add(1.1);
		Iterator itr =set.iterator();
		while(itr.hasNext());{
		System.out.println(itr.next());
	}
	for(double d:set) {
		System.out.println(d);
	}
		

	}

}
