package com.jenkins.config;

import org.testng.Reporter; 
import org.testng.annotations.Test;

public class Test1 
{
    @Test
    public void firsttest()
    {
		Reporter.log("hi",true);
	} 
}
