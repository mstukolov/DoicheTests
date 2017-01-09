import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 * Created by Maxim on 28.11.2016.
 */
public class JUnitAllTest {
    public static void main(String[] args) {
        JUnitCore runner = new JUnitCore();
        Result result = runner.run(JUnitTest.class);
        System.out.println("run tests: " + result.getRunCount());
        System.out.println("failed tests: " + result.getFailureCount());
        System.out.println("success tests: " + (result.getRunCount() - result.getFailureCount()));
        System.out.println("ignored tests: " + result.getIgnoreCount());
        System.out.println("success: " + result.wasSuccessful());
    }
}
