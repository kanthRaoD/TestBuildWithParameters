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
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	System.out.println(System.getProperty("browser"));
        System.out.println(System.getProperty("Env"));
        assertTrue( true );
    }
    
    public void info()
    {
    	System.out.println(System.getProperty("Browser"));
        System.out.println(System.getProperty("Env"));
    }
}
