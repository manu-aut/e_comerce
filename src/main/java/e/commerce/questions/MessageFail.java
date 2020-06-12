package e.commerce.questions;

import static e.commerce.userinterface.Init.LABEL;
import static net.serenitybdd.screenplay.questions.Text.of;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

public class MessageFail implements Question<Boolean> {

	private String failMessage;

	public MessageFail(String mensajeError) {
		this.failMessage = mensajeError;

	}

	@Override
	@Subject("{0} message fail validation")
	public Boolean answeredBy(Actor actor) {
		return of(LABEL).viewedBy(actor).asString().contains(failMessage);

	}

	public static MessageFail errorMessage(String failMessage) {
		return new MessageFail(failMessage);

	}

}
