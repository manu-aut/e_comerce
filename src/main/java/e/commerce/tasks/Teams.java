package e.commerce.tasks;

import static e.commerce.userinterface.MyTeamsPage.ADD_NEW_GROUP;
import static e.commerce.userinterface.MyTeamsPage.BTN_SAVE;
import static e.commerce.userinterface.MyTeamsPage.DESCRIPTION;
import static e.commerce.userinterface.MyTeamsPage.NAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Click.on;
import static net.serenitybdd.screenplay.actions.Enter.theValue;

import java.util.List;

import e.commerce.models.GroupsData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Teams implements Task {

	private GroupsData groupsData;

	public Teams(List<GroupsData> groupsData) {
		this.groupsData = groupsData.get(0);

	}

	@Override
	@Step("{0} add groups ")
	public <T extends Actor> void performAs(T actor) {

		if (ADD_NEW_GROUP.resolveFor(actor).isVisible()) {

			actor.attemptsTo(on(ADD_NEW_GROUP));
			actor.attemptsTo(theValue(groupsData.getName()).into(NAME),
					Enter.theValue(groupsData.getDescription()).into(DESCRIPTION), on(BTN_SAVE)

			);

		}

	}

	public static Teams myGroups(List<GroupsData> groupsData) {
		return instrumented(Teams.class, groupsData);

	}

}
