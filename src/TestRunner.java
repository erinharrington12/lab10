import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

@RunWith(Suite.class)
@Suite.SuiteClasses({ 
    
    
    
    CircleTest.class, // replace with all your test classes
        
    DiamondTestOfficial.class, // replace with all your test classes
    OvalTestOfficial.class,
    DiamondTestOfficial.class,
    PolyLineTest.class,
    RectangleTest.class,
    SquareTest.class,
    TriangleTest.class,
    CircleTest.class,
})
public class TestRunner
{
    public static void main(String[] args)
    {
        Result result = JUnitCore.runClasses(TestRunner.class);
        for (Failure failure : result.getFailures())
        {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
