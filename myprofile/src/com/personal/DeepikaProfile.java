package com.personal;


 class DeepikaProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		// TODO Auto-generated method stub
		System.out.println(ProfileConstants.FIRST_NAME+"Deepika");
		System.out.println(ProfileConstants.LAST_NAME+"Siddhan");
		//System.out.println("Age:20");	
	}

	@Override
	public void myHobbies() {
		// TODO Auto-generated method stub
		System.out.println("myHobby is Reading Books");	
	}
	

}
