package e.commerce.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.equalToIgnoringCase;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import e.commerce.questions.Located;
import e.commerce.questions.Message;
import e.commerce.tasks.crud.Add;
import e.commerce.utils.Constants;
import net.thucydides.core.annotations.Managed;

public class MyUnitStepDefinitions {

	@Managed
	WebDriver driver;

	@When("^add a categories (.*) to his list (.*)$")
	public void addCategories(String carriersName, String optionList) {
		theActorCalled(Constants.ACTOR).attemptsTo(Add.myCarriers(carriersName, optionList));

	}

	@And("^he should to visualize a confirmation message (.*)$")
	public void messageContent(String message) {
		theActorInTheSpotlight().should(seeThat(Message.content(message), equalTo(message)));

	}

	@Then("^he should display the name of the unit after the search (.*)$")
	public void nameUnitAfterSearch(String carriersName) {
		theActorInTheSpotlight().should(seeThat(Located.encontrado(carriersName), equalToIgnoringCase(carriersName)));

	}

}
