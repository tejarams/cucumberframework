package testrunnerTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature/rough.feature",
glue="step_definition",plugin = {
		"pretty","html:cucumber_report/cucumber_html_reports.html",
		"junit:cucumber_report/cucumber_xml_reports.xml",
		"json:cucumber_report/cucmber_json_reports.json"},
		monochrome = true )
public class testrunnertestngTest extends AbstractTestNGCucumberTests {


}
