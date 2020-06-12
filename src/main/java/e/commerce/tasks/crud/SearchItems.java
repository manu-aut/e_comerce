package e.commerce.tasks.crud;

import static e.commerce.userinterface.MenuPage.CATEGORIES_OPTION;
import static net.serenitybdd.screenplay.actions.Click.on;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

public class SearchItems implements Task {

	@Override
	@Step("{0} search categories")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(on(CATEGORIES_OPTION));

	}

}
