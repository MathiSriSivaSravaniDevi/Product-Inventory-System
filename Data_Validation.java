package com.validation_layer;

import java.util.Random;

public class Data_Validation {

	public static boolean validateMobileNumber(long mobileNumber)
	{
		String st = mobileNumber + "";
		char ch=st.charAt(0);
		if((ch=='6'||ch=='7'||ch=='8'||ch=='9') && (st.length()==10))
			return true;
		return false;
	}
	

}