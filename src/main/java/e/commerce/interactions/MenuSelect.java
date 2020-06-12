package e.commerce.interactions;

import static e.commerce.userinterface.MenuPage.OPTION_MENU_;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Click.on;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

public class MenuSelect implements Interaction {

	private String[] route;

	public MenuSelect(String route) {
		this.route = route.split("/");
	}

	@Override
	@Step("{0} go to menu")
	public <T extends Actor> void performAs(T actor) {

		for (int i = 0; i < route.length; i++) {
			actor.attemptsTo(on(OPTION_MENU_.of(route[i])));
		}

	}

	public static MenuSelect menuSelect(String route) {
		return instrumented(MenuSelect.class, route);

	}

}
