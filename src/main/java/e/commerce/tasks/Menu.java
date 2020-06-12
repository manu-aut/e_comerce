package e.commerce.tasks;

import static e.commerce.userinterface.MenuPage.OPTION_MENU_;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Click.on;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

public class Menu implements Task {

	private String optionMenu;

	public Menu(String optionMenu) {
		this.optionMenu = optionMenu;
	}

	@Override
	@Step("{0} the user can select any option #option")
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(on(OPTION_MENU_.of(optionMenu)));
	}

	public static Menu menu(String optionMenu) {
		return instrumented(Menu.class, optionMenu);

	}

}
