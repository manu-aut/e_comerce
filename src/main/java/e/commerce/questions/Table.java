package e.commerce.questions;

import static e.commerce.userinterface.MyTeamsPage.TEMPORAL_TABLE;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

public class Table implements Question<Boolean> {

	@Override
	@Subject("table validation")
	public Boolean answeredBy(Actor actor) {

		if (TEMPORAL_TABLE.resolveFor(actor).isVisible()) {
			return true;
		} else {
			return false;
		}

	}

	public static Table table() {
		return new Table();

	}

}
