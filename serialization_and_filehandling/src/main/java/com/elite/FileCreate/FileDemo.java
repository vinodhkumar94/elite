package com.elite.FileCreate;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args)
	
	{
           File f = new File("D:/usr/Filedemo.txt");
           try {
			FileOutputStream fos = new FileOutputStream(f);
			System.out.println("fos" +fos);
			DataOutputStream dos  = new DataOutputStream(fos);
			System.out.println("dos" +dos);
			
			
			try {
				dos.writeUTF(" File demo text");
				dos.write(2569);
				dos.writeByte('v');
			System.out.println(dos.size());	
				FileInputStream fis = new FileInputStream(f);
				System.out.println("fis" +fis);
				
				
				DataInputStream dis = new DataInputStream(fis);
				System.out.println("dis" +dis);
				
				String str = dis.readUTF();
				System.out.println(str);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           
           } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           
	}

}
