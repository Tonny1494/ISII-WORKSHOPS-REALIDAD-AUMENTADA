package ec.edu.espol.workshops.second;

//import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepsDefs {
	
	String marriage;
	String sex;
	String notMarried;
	String married;
	String state;
	String age;
	String notunderage;
	String underage;
	int prima;
	String genre;
	String female;
	String male;

	@Given("customer is not married")
	public void customer_is_not_married() {
		this.marriage = "not married";

	}

	@When("i ask you for you married")
	public void i_ask_you_for_you_married() {
		this.married = "married";
	}
	
	@Then("i should get married")
	public void i_should_get_married() {
		assertEquals("married", this.married);
	}
	
	@When("i ask you for you not married")
	public void i_ask_you_for_you_not_married() {
		this.notMarried = "not married";
	}
	
	@Then("i should get not married")
	public void i_should_get_not_married() {
		assertEquals("not married", this.notMarried);
	}
	
	
	@Given("customer is not underage")
	public void customer_is_not_underage() {
		this.underage = "not underage";

	}

	@When("i ask you for you underage")
	public void i_ask_you_for_you_underage() {
		this.age = "underage";
	}
	
	@Then("i should be underage")
	public void i_should_be_underage() {
		assertEquals("underage", this.age);
	}
	
	@When("i ask you for you not underage")
	public void i_ask_you_for_you_not_underage() {
		this.notunderage = "not underage";
	}
	
	@Then("i should be not underage")
	public void i_should_be_not_underage() {
		assertEquals("not underage", this.notunderage);
	}
	
	@Given("customer is a female")
	public void customer_is_a_female() {
		this.genre = "female";

	}

	@When("i ask you for you female")
	public void i_ask_you_for_you_female() {
		this.female = "female";
	}
	
	@Then("i should be female")
	public void i_should_be_female() {
		assertEquals("female", this.female);
	}
	
	@When("i ask you for you man")
	public void i_ask_you_for_you_man() {
		this.male = "man";
	}
	
	@Then("i should be man")
	public void i_should_be_man() {
		assertEquals("man", this.male);
	}
	
}