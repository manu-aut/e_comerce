package e.commerce.questions;

import static e.commerce.userinterface.MyHome.LISTA_FILTER;
import static net.serenitybdd.screenplay.questions.Text.of;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("{0} found in the list")
public class Located implements Question<String> {

	private String carriersName = "carrier name";

	public Located(String carriersName) {
		this.carriersName = carriersName;

	}

	@Override
	public String answeredBy(Actor actor) {
		return of(LISTA_FILTER.of(carriersName)).viewedBy(actor).asString();
	}

	public static Located encontrado(String carriersName) {
		return new Located(carriersName);

	}

}
