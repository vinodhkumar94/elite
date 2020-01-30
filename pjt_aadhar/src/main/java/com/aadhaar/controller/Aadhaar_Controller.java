package com.aadhaar.controller;
import java.sql.Date;
import java.util.*;
import com.aadhaar.DTO.Aadhaar;
import com.aadhaar.DTO.Address;
import com.aadhaar.comparator.*;
import com.aadhaar.service.AadhaarService_Impl;

public class Aadhaar_Controller 
{
	public static void main(String[] args) {
		AadhaarService_Impl serviceImpl = new AadhaarService_Impl();
		List<Aadhaar> AadhaarList = new ArrayList<Aadhaar>();
		Aadhaar aadhaar = new Aadhaar();
		Scanner sc = new Scanner(System.in);
		int selectchoice;
		do {
			System.out.println("******MENU*******");
			System.out.println("1.Insert an Aadhaar");
			System.out.println("2.select all Aadhaar's");
			System.out.println("3.select all by Aadhaar number order ");
			System.out.println("4.select all by age order");
			System.out.println("5.select all by name order");
			System.out.println("6.select all by gender order");
			System.out.println("7.select all by mobile_num order");
			System.out.println("8.select all by state order");
			System.out.println("9.select all by m_status order");
			System.out.println("10.select all by dob order");
			System.out.println("11.exit");
			System.out.println("select your choice by number, given above");
			selectchoice = sc.nextInt();
			
			switch (selectchoice) {
			case 1:
				System.out.println("enter Aadhaar number");
				aadhaar.setName(sc.next());
				System.out.println("enter Name");
				aadhaar.setName(sc.next());
				System.out.println("enter age");
				aadhaar.setAge(sc.nextInt());
				System.out.println("enter Gender");
				aadhaar.setGender(sc.next());
				System.out.println("enter Phone_Num");
				aadhaar.setPhone_num(sc.nextLong());
				System.out.println("enter Email_id");
				aadhaar.setEmail_id(sc.next());
				System.out.println("enter M_Status");
				aadhaar.setM_status(sc.next());
				System.out.println("enter State");
				aadhaar.setState(sc.next());
				System.out.println("Aadhaar Data Inserted successfully");
				break;

			case 2:
				System.out.println("select all Aadhaar's from db");
				AadhaarList = serviceImpl.selectAllAadhaar();
				for (Aadhaar aid : AadhaarList)
					System.out.println(aid);
				break;
			
			case 3:
				System.out.println("select all by Aadhaar number order from db");
				AadhaarList = serviceImpl.selectAllAadhaar();
				Collections.sort(AadhaarList, new com.aadhaar.comparator.NameComparator());
				for (Aadhaar aadhaar1 : AadhaarList)
					System.out.println(aadhaar1);
				break;
				
			case 4:
				System.out.println("select all by age order from db");
				AadhaarList = serviceImpl.selectAllAadhaar();
				Collections.sort(AadhaarList, new AgeComparator());
				for (Aadhaar aadhaar1 : AadhaarList)
					System.out.println(aadhaar1);
				break;
				
			case 5:
				System.out.println("select all by name order from db");
				AadhaarList = serviceImpl.selectAllAadhaar();
				Collections.sort(AadhaarList, new NameComparator());
				for (Aadhaar aadhaar1 : AadhaarList)
					System.out.println(aadhaar1);
				break;
				
			case 6:
				System.out.println("select all by gender order from db");
				AadhaarList = serviceImpl.selectAllAadhaar();
				Collections.sort(AadhaarList, new GenderComparator());
				for (Aadhaar aadhaar1 : AadhaarList)
					System.out.println(aadhaar1);
				break;
				
			case 7:
				System.out.println("7.select all by mobile_num order from db");
				AadhaarList = serviceImpl.selectAllAadhaar();
				Collections.sort(AadhaarList, new Mob_numComparator());
				for (Aadhaar aadhaar1 : AadhaarList)
					System.out.println(aadhaar1);
				break;
				
			case 8:
				System.out.println("select all by state order from db");
				AadhaarList = serviceImpl.selectAllAadhaar();
				Collections.sort(AadhaarList, new StateComparator());
				for (Aadhaar aadhaar1 : AadhaarList)
					System.out.println(aadhaar1);
				break;
				
			case 9:
				System.out.println("select all by m_status order from db");
				AadhaarList = serviceImpl.selectAllAadhaar();
				Collections.sort(AadhaarList, new M_statusComparator());
				for (Aadhaar aadhaar1 : AadhaarList)
					System.out.println(aadhaar1);
				break;
				
			case 10:
				System.out.println("select all by dob order from db");
				AadhaarList = serviceImpl.selectAllAadhaar();
				Collections.sort(AadhaarList, new DobComparator());
				for (Aadhaar aadhaar1 : AadhaarList)
					System.out.println(aadhaar1);
				break;

			case 11:
				System.out.println("exit");
				break;
			}

		} while (selectchoice != 11);
		sc.close();


}
}
