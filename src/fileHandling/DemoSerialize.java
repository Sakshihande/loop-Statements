package fileHandling;
import java.io.*;
public class DemoSerialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee(23, "Sakshi");
		try
		{
			 FileOutputStream fileOut=new FileOutputStream("D:/MyEmployee.ser");
			 ObjectOutputStream out=new ObjectOutputStream(fileOut);
			 out.writeObject(e);
			 out.close();
			 fileOut. close();
			 System.out.println("Serialized data is saved in /temp/employee.ser");
		}catch(IoException i) 
		{
			i.printStackTrace();
		}
		{
			 
			 
		}
		

	}

}
