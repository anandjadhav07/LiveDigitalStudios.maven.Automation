package ld.test.animation.automation.bdd.steps;
import org.jbehave.core.annotations.*;

import ld.test.animation.automation.bdd.pages.HomePage;
public class HomeSteps{
	protected HomePage homepage;
	
	@When("step represents the occurrence of the event")
	public void whenStepRepresentsTheOccurrenceOfTheEvent(){
		 //TODO 
	
	}
	@Given("step represents a precondition to an event")
	public void givenStepRepresentsAPreconditionToAnEvent(){
		 //TODO 
		homepage.getDriver().get("https://livedigitalstudios.com/");
	}
	@Then("step represents the outcome of the event					 ")
	@Pending
	public void thenStepRepresentsTheOutcomeOfTheEvent(){
		 //TODO 
	}
}