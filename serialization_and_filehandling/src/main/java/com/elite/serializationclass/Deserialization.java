package com.elite.serializationclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws Exception 
	
	{
		Data d = new Data();
		File f = new File("D:/usr/Serializable.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Data d1 =(Data) ois.readObject();
		fis.close();
		ois.close();
		
		System.out.println("int 'i' value is : " +d.i);
		System.out.println("char 'c' value is : " +d.c);
		System.out.println("String 's' value is : " +d.s);
		System.out.println("d1 value is : " +d1);
	}

}
