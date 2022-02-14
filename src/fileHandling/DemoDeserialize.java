package fileHandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream; 
public class DemoDeserialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=null;
		try
		{
			FileInputStream fileIn=new FileInputStream("d:/MyEmployee.ser");
			ObjectInputStream in=new ObjectInputStream(fileIn);
			e=(Employee)in.readObject();
			in.close();
			fileIn.close();
		}catch(IoException i)
		{
			return;
		}catch(ClassNotFoundException c)
		{
		System.out.println("Employee class not found");
		return;
		}
		System.out.println("Deserialized Employee...");
		System.out.println("Name:"+ e.getName());
		System.out.println("id:"+ e.getId());
		{
					
		}

	}

}
