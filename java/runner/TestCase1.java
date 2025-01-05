package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/test/java/feature/", glue={"stepDef","hooks"}, publish = true, monochrome = true)
public class TestCase1 extends AbstractTestNGCucumberTests {

}
