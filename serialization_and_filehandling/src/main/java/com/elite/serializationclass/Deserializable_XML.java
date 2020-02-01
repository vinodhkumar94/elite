package com.elite.serializationclass;
import java.beans.*;
import java.io.*;
import java.util.List;

public class Deserializable_XML {

	public static void main(String[] args) throws FileNotFoundException {
		XMLDecoder x = new XMLDecoder(new BufferedInputStream(new FileInputStream("D:/usr/mycollege.xml")));
		College col = (College) x.readObject();
		List<Student> s = col.getStudents();
		for (Student student : s) 
		{
		System.out.println(student);	
		}
	}

}
