package com.elite.FileCreate;

import java.io.*;

public class File_Create {

	public static void main(String[] args) 
	{
			File f = new File("D:/usr/newfile.txt");
			
		boolean Filecreatedornot = f.exists();
		
		System.out.println(Filecreatedornot);
		try {
			if(f.createNewFile())
			{
				System.out.println(" File Created Succesfully with a name"+ f.getName());
			}
			else
			{
				System.out.println("File Already Created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
