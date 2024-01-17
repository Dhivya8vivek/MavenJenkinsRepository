package com.wipro.topgear;

import org.apache.commons.lang3.*;

public class StringUtilsSample {
	
	public static void main(String[] args) 
	{
        String str = "Maven First Assignment";
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + StringUtils.reverse(str));
    }

}
