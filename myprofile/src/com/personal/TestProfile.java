package com.personal;

public class TestProfile {
 
public static void printProfile(IProfile profile){ //normal method
    profile.myBasicInfo();
    profile.myHobbies();
	}
public static void main(String arg[]){
	IProfile myProfile=new DeviProfile();
	IProfile myProfileone=new DeepikaProfile();
	
	 printProfile(myProfile);
	 printProfile(myProfileone);

}

}