package com.aadhaar.DTO;

public class Address 
{
private int doorNo ;
private String streetname;
private int pincode;
public Address(int doorNo, String streetname, int pincode) {
	super();
	this.doorNo = doorNo;
	this.streetname = streetname;
	this.pincode = pincode;
}
public int getdoorNo() {
	return doorNo;
}
public void setdoorNo(String doorNo) {
	doorNo = doorNo;
}
public String getstreetname() {
	return streetname;
}
public void setstreetname(String streeName) {
	streetname = streetname;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "address [doorNo=" + doorNo + ", streetname=" + streetname + ", pincode=" + pincode + ", getdoorNo()="
			+ getdoorNo() + ", getstreetname()=" + getstreetname() + ", getPincode()=" + getPincode() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
