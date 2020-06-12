package e.commerce.tasks;

import static e.commerce.userinterface.Init.BTN;
import static e.commerce.userinterface.Init.EMAIL;
import static e.commerce.userinterface.Init.PSSWD;
import static e.commerce.utils.Property.getPRO;
import static e.commerce.utils.Property.getPassword;
import static e.commerce.utils.Property.getUsername;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Click.on;
import static net.serenitybdd.screenplay.actions.Enter.theValue;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

public class StartSession implements Task {

	@Override
	@Step("{0} Enter credentials")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(theValue(getPRO().getProperty(getUsername())).into(EMAIL),
				theValue(getPRO().getProperty(getPassword())).into(PSSWD), on(BTN)

		);

	}

	public static StartSession initSession() {
		return instrumented(StartSession.class);
	}

}
