package e.commerce.stepdefinitions;

import static e.commerce.drivers.MyChromiumDriver.closeDriver;
import static e.commerce.drivers.MyChromiumDriver.initMyChromium;
import static e.commerce.tasks.StartSession.initSession;
import static e.commerce.tasks.transversal.Options.menu;
import static e.commerce.utils.Constants.ACTOR;
import static net.serenitybdd.screenplay.abilities.BrowseTheWeb.with;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GeneralStepDefinitions {

	@Before
	public void initBrowser() {
		setTheStage(new OnlineCast());
		theActorCalled(ACTOR).can(with(initMyChromium()));
		theActorInTheSpotlight().attemptsTo(initSession());

	}

	@After
	public void closeDrive() {
		theActorInTheSpotlight().can(with(closeDriver()));
	}

	@When("^select the option (.*)$")
	public void seSeleccionaLaOpcion(String menuOption) {
		theActorInTheSpotlight().attemptsTo(menu(menuOption));

	}

}
