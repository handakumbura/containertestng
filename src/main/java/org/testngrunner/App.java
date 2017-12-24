package org.testngrunner;
import com.beust.jcommander.internal.Lists;
import org.testng.TestNG;

import java.util.List;


public class App 
{
    public static void main( String[] args )
    {
    	String trigger = System.getenv("EXEC_TYPE");
    	
    	if(trigger != null) {
    		if(trigger.equals("TEST")) {
    		TestNG testng = new TestNG();
            List<String> suites = Lists.newArrayList();
            suites.add("testng.xml");
            testng.setTestSuites(suites);
            testng.run();
    		}
    	}
    	else {
    		System.out.println("--- default execution flow of the component ---");
    	}
    	    	
    	
    	
    }
}
