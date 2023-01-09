package com.velocity;

public class ReturnString {

	public String getString(String string) {
		System.out.println(string);
		return string;
		
	}
	public static void main(String[] args) {
		
		ReturnString returnString = new ReturnString();
		returnString.getString("Rahul");
		//System.out.println("Returned Succesfully");
	}

}
