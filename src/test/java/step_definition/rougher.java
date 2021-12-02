package step_definition;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class rougher {
	public static Logger log_info=LogManager.getLogger(rougher.class.getName());
	@Given("Click on any")
	public void click_on_any() {
		System.out.println("i give nothing");
		log_info.info("i give nothing");
	   
	}

	@When("Open any")
	public void open_any() {
		System.out.println(" nothing open");
		log_info.info("nothing open");
	    
	}

	@Then("Display anything")
	public void display_anything() {
		System.out.println("display nothing");
		log_info.info("display nothing");
	}

}
