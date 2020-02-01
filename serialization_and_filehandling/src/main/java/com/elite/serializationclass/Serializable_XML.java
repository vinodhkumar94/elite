package com.elite.serializationclass;

import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serializable_XML {

	public static void main(String[] args)
	{

		Student s1 = new Student();
		s1.setRollno(10);
		s1.setName("A");
		s1.setMobnum(2356);
		
		Student s2 = new Student();
		s2.setRollno(11);
		s2.setName("B");
		s2.setMobnum(6985);
		
		Student s3 = new Student();
		s3.setRollno(12);
		s3.setName("C");
		s3.setMobnum(1254);
		
		Student s4 = new Student();
		s4.setRollno(13);
		s4.setName("D");
		s4.setMobnum(2589);
		
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s4);
		list.add(s3);
		list.add(s2);
		
		College col = new College();
		col.setStudents(list);
		
		System.out.println(list);
		
		try {
			XMLEncoder x = new XMLEncoder(new FileOutputStream("D:/usr/mycollege.xml"));
			x.writeObject(col);
			x.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
