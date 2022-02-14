package collections;
import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(2, "ABC");
		map.put(1, "XYZ");
		map.put(3," Sakshi");
		
		System.out.println(map.get(2));
		System.out.println("Implementation of entry class");
		for(Map.Entry<Integer,String>entry:map.entrySet())
		{
			System.out.println(entry.getKey()+": :"+entry.getValue());
		}

	}

}
