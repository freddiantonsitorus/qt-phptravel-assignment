package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
	features = "src/test/resources/features", //folder path
	glue = {"stepdefs"}, 
	tags = {"@SCENARIO"}) //package name
	
	public class TestRunner extends AbstractTestNGCucumberTests {
		
}

	
	// , tags = {"@end-to-end, @regression"} //run tagged as @end-to-end OR @regression
			// , tags = {"@end-to-end", "@regression"} //run tagged as @end-to-end AND @regression 
	
	