package TestBuildWithParameters.TestBuildWithParameters;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testApp()
    {
    	System.out.println("Browser"+System.getProperty("browser"));
        System.out.println("Environment"+System.getProperty("Env"));
        assertTrue( true );
    }
}
