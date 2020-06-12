package e.commerce.tasks.transversal;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

public class Options implements Task {

	private String menuOption;

	public Options(String menuOption) {
		this.menuOption = menuOption;
	}

	@Override
	@Step("{0} the user can select any option #option")
	public <T extends Actor> void performAs(T theCoronaActor) {
		theCoronaActor.entersTheScene();

	}

	public static Options menu(String menuOption) {
		return instrumented(Options.class, menuOption);

	}

}
