/**
 * 
 */
package cucumberTest;

/**
 * @author 04108E744
 *
 */
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
   // tags = "@activity1_1",
    //  tags = "@activity1_2",
   // tags = "@activity1_3",
    // tags = "@activity2_4",
    tags = "@activity2_5",
    plugin = { "pretty", "html:target/cucumber-reports/reports" },
    monochrome = true
)


public class ActivitiesRunner {
    //empty
}
