package fileHandling;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class BufferWriterDemo {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		 FileWriter writer = new FileWriter("D:\\testout.text");
		 BufferedWriter buffer=new BufferedWriter(writer);
		buffer.write("I live in Maharashtra");
		buffer.close();
		System.out.println("Success");

	}

	
	}


