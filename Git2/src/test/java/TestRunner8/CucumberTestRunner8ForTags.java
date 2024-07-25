package TestRunner8;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(tags="@smoke and @regression and not @perf", 
			features= {"src/test/resources/FeatureWithTags"}, 
			glue = {"StepDefinition3"},
			plugin= {"pretty", "html:target/htmlrepo.html"})
	
	public class CucumberTestRunner8ForTags extends AbstractTestNGCucumberTests{
	
	
}
