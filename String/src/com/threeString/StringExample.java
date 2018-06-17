package com.threeString;

public class StringExample {
	 public String Name="Dev";
	 public String firstName;
	 public String midName;
	 public String lastName;
	 int stringlen=Name.length();
	 int div;
	
	public void Example(){
		if(stringlen%3==0){
		div=stringlen/3;
		firstName=Name.substring(0,div);
		midName=Name.substring(div,div*2);
		lastName=Name.substring(div*2,div*3);
		
		System.out.println("firstName:"+firstName+"\nmidName:"+midName+"\nlastName:"+lastName);	
		}}
		public static void main(String s[]){
		StringExample str=new StringExample();
		str.Example();


}}