package cucumber.Options;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue={"stepDefination","helper"},tags="@reg",
plugin="json:target/jsonReports/test.json")
//"html:target/test/report.html"
public class testRunner extends AbstractTestNGCucumberTests {

}
