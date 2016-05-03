package com.test1.tests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAgain implements IRetryAnalyzer  { 
private int count = 0; 
private int maxCount = 4; // set your count to re-run test
protected Logger log;
private static Logger testbaseLog;

static {
    PropertyConfigurator.configure("log4j.properties");
    testbaseLog = Logger.getLogger("LoginTest");
}

public RetryAgain()
{
    testbaseLog.trace( " ModeledRetryAnalyzer constructor " + this.getClass().getName() );
    log = Logger.getLogger("LoginTest");
}

@Override 
public boolean retry(ITestResult result) { 
    testbaseLog.trace("running retry logic for  '" 
            + result.getName() 
            + "' on class " + this.getClass().getName() );
        if(count < maxCount) {                     
                count++;                                    
                return true; 
        } 
        return false; 
}
}