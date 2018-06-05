package com.personal;



public class DeviProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		// TODO Auto-generated method stub
		System.out.println(ProfileConstants.FIRST_NAME+"Devi");
		System.out.println(ProfileConstants.LAST_NAME+"Uthirabalan");
		//System.out.println("Age:20");
	}

	@Override
	public void myHobbies() {
		// TODO Auto-generated method stub
		System.out.println("myHobby is listening songs");
	}
}
