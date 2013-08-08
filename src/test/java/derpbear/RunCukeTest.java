package derpbear;

import cucumber.api.junit.*;
import org.junit.runner.RunWith;

/**
 * Created with IntelliJ IDEA.
 * User: orieken
 * Date: 8/7/13
 * Time: 10:24 PM
 */

@RunWith(Cucumber.class)
@Cucumber.Options(
        format = {"html:target/cucumber"}
)
public class RunCukeTest {
}
