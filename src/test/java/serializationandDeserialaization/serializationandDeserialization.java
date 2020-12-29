package serializationandDeserialaization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test implements Serializable
{
	int i=0,j=20;
}


public class serializationandDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Test t1=new Test();
		
		Test t3=new Test();
		
		// TODO Auto-generated method stub
		//Serialization
		FileOutputStream fos= new FileOutputStream("text.txt");
		ObjectOutputStream oos= new ObjectOutputStream("fos");
		oos.writeObject(t1);
		
		// DeSerialization
		FileIuputStream fis= new FileIuputStream("text.txt");
		ObjectIuputStream ois= new ObjectIuputStream("fis");
		
		Test t2=(Test) ois.readObject();
		System.out.println(t2.i+" "+t2.j);
	
	}

}
