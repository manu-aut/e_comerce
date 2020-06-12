package e.commerce.tasks;

import static e.commerce.userinterface.Init.BTN;
import static e.commerce.userinterface.Init.EMAIL;
import static e.commerce.userinterface.Init.LABEL;
import static e.commerce.userinterface.Init.PSSWD;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Click.on;
import static net.serenitybdd.screenplay.actions.Enter.theValue;

import java.util.List;

import e.commerce.models.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

public class SessionTest implements Task {

	private LoginData dataInit;

	private Actor actor;

	public SessionTest(List<LoginData> dataInit) {
		this.dataInit = dataInit.get(0);

	}

	@Override
	@Step("{0} se ingresan las credenciales de prueba")
	public <T extends Actor> void performAs(T actor) {
		this.actor = actor;
		actor.attemptsTo(theValue(dataInit.getUser()).into(EMAIL), theValue(dataInit.getPassword()).into(PSSWD),
				on(BTN));

		while (messageEneable()) {
			actor.attemptsTo(theValue(dataInit.getUser()).into(EMAIL), theValue(dataInit.getPassword()).into(PSSWD),
					on(BTN));

		}

	}

	private Boolean messageEneable() {
		if (LABEL.resolveFor(actor).isEnabled()) {
			return true;
		} else {
			return false;
		}

	}

	public static SessionTest credentialsTestCases(List<LoginData> dataInit) {
		return instrumented(SessionTest.class, dataInit);
	}

}
