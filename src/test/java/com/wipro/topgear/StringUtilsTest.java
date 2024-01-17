package com.wipro.topgear;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.StringUtils;

import org.junit.Test;

public class StringUtilsTest {
	 @Test
	    public void StringUtils() 
	 {
	        String str = "Maven First Assignment";
	        assertEquals("Reversed String", "tnemngissA tsriF nevaM", StringUtils.reverse(str));
	    }
}


