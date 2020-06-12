package e.commerce.stepdefinitions;

import static e.commerce.questions.Table.table;
import static e.commerce.tasks.Teams.myGroups;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import e.commerce.models.GroupsData;

public class MyCategoriesStepDefinitions {

	@When("^he add new group$")
	public void addNewGroup(List<GroupsData> groupsData) {
		theActorInTheSpotlight().attemptsTo(myGroups(groupsData));
	}

	@Then("^should be displayed in the list of categories$")
	public void viewInList() {
		theActorInTheSpotlight().should(seeThat(table()));
	}

}
