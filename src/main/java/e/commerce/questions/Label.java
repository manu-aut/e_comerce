package e.commerce.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class Label implements Question<String> {
	private Target label;

	public Label(Target Label) {
		this.label = Label;
	}

	public String answeredBy(Actor actor) {
		return label.resolveFor(actor).getTextValue();
	}

	public static Label label(Target Label) {
		return new Label(Label);
	}

}
