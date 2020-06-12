package e.commerce.stepdefinitions;

import static e.commerce.questions.Label.label;
import static e.commerce.questions.MessageFail.errorMessage;
import static e.commerce.tasks.SessionTest.credentialsTestCases;
import static e.commerce.userinterface.Init.LABEL;
import static e.commerce.utils.Constants.ACTOR;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

import java.util.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import e.commerce.models.LoginData;

public class InitStepDefinitions {

	@When("^(he|she|they:?) enters the credentials$")
	public void credencialesPrueba(List<LoginData> datosLogin) {
		theActor(ACTOR).attemptsTo(credentialsTestCases(datosLogin));

	}

	@Then("^the message could be validated  (.*)")
	public void validarLabel(String mensaje) {
		theActorInTheSpotlight().should(eventually(seeThat(label(LABEL), containsString(mensaje))));

	}

	@Then("^the message could be validated (.*)")
	public void validarErrorMensaje(String errorMessage) {
		theActorInTheSpotlight().should(seeThat(errorMessage(errorMessage)));

	}

}
