package com.elite.FileCreate;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class FileOptionsTest
{
	
	public static void main(String[] args)
	{
		File f = new File("D:/usr/newfile.txt");
		if(f.exists())
		{
			System.out.println("File exists with a name of :" +f.getName());
		System.out.println("Path of the File :" +f.getAbsolutePath());
		System.out.println("checking the file readable or not : " +f.canRead());
		System.out.println("checking the file Writable or not : " +f.canWrite());
		System.out.println("File Size : " + f.length());
		try {
			System.out.println("CanonicalPath : " + f.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Getting parent : " +f.getParent() );
		System.out.println("Getting Total Space  : " + f.getTotalSpace());
		System.out.println("Getting Remaining Space  or usable space : " + f.getUsableSpace() );
		System.out.println("File hash code : " + f.hashCode() );
		System.out.println("Last modified time is : " +f.lastModified() );
		System.out.println("file can be executed or not : " + f.canExecute());
		System.out.println("it is a Absolute or not  : " + f.isAbsolute());
		System.out.println("it is a Directory or not : " + f.isDirectory());
		System.out.println(" it is a file or not : " + f.isFile());
		System.out.println("it is a hidden or not : " + f.isHidden());
		System.out.println("Getting the class : " + f.getClass());
		try {
			System.out.println("" + f.toURL() );
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		}
		else
		{
			System.out.println("FIle Doesnot exist or give the file name correctly");
		}
	}

}
