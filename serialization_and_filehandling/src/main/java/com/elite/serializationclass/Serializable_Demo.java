package com.elite.serializationclass;
import java.io.*;
public class Serializable_Demo {
public static void main(String[] args) throws Exception {
	
		Data d = new Data();
		d.i = 10;
		d.c = "k";
		
		
		
		
		File f = new File("D:/usr/newSerializable1234.txt");
		
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.close();
		fos.close();
		if(f.createNewFile())
		{
			System.out.println("Serializable.txt file is created succesfully");
		}
		else
		{
			System.out.println("File Already created");
		}
		

			
		
		
}	
	

}
	
class Data implements Serializable
{
	
	private static final long serialVersionUID = 5L;
	
	int i;
	String c;
	String s = "Ram";
	
}




