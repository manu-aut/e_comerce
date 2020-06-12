package e.commerce.questions;

import static e.commerce.userinterface.MyHome.LABEL_MESSG;
import static net.serenitybdd.screenplay.questions.Text.of;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("confirmation message ")
public class Message implements Question<String> {

	private String message = "assertions message ";

	public Message(String message) {
		this.message = message;
	}

	@Override
	public String answeredBy(Actor actor) {
		return of(LABEL_MESSG.of(message)).viewedBy(actor).asString();

	}

	public static Message content(String message) {
		return new Message(message);

	}

}
