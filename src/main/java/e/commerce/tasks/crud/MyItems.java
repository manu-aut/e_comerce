
package e.commerce.tasks.crud;

import static e.commerce.userinterface.MenuPage.MENU_OPTION;
import static e.commerce.userinterface.MyHome.ADD_UNIT;
import static e.commerce.userinterface.MyHome.BUTTON_ICON;
import static e.commerce.userinterface.MyHome.ITEM_TABLE;
import static e.commerce.userinterface.MyHome.LABEL_MESSG;
import static e.commerce.userinterface.MyHome.MATH_ICON;
import static e.commerce.userinterface.MyHome.MODAL_MY_CATEGORIES;
import static e.commerce.userinterface.MyHome.OPTION_FILTER;
import static e.commerce.userinterface.MyHome.OPTION_TEXT;
import static e.commerce.userinterface.MyHome.SEARCH_UNIT_ADD;
import static e.commerce.userinterface.MyHome.SEARCH_UNIT_GENERAL;
import static e.commerce.utils.Constants.MY_TEAMS_OPTION;
import static e.commerce.utils.General.ucFirst;
import static e.commerce.utils.MyWait.inMilliseconds;
import static net.serenitybdd.screenplay.actions.Click.on;
import static net.serenitybdd.screenplay.actions.Enter.theValue;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.waits.WaitUntil.the;
import static org.openqa.selenium.Keys.ENTER;

import e.commerce.utils.General;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class MyItems implements Task {

	@Steps
	private General general;
	private String unitName = "bebe name";
	private String optionList = "add to list";
	private Actor theActor;

	public MyItems(String carriersName, String optionList) {
		this.optionList = optionList;
	}

	public MyItems(General general) {
		this.general = general;
	}

	@Override
	@Step("{0} se selecciona la opcion quemada #option")
	public <T extends Actor> void performAs(T theActor) {
		this.theActor = theActor;
		theActor.attemptsTo(on(MENU_OPTION.of(MY_TEAMS_OPTION)));
		theActor.attemptsTo(on(ADD_UNIT), theValue(unitName).into(SEARCH_UNIT_ADD).thenHit(ENTER));

		if (onTheList()) {
			theActor.attemptsTo(on(MATH_ICON));
			theActor.attemptsTo(on(OPTION_TEXT.of("Add to" + " " + optionList)),
					the(LABEL_MESSG, isPresent()).forNoMoreThan(5).seconds());
			inMilliseconds(2000);
			;

			theActor.attemptsTo(on(MENU_OPTION.of(MY_TEAMS_OPTION)), on(BUTTON_ICON));

			// Filter
			if (optionList.contains("category list")) {
				theActor.attemptsTo(Click.on(OPTION_FILTER.of("My" + " " + ucFirst(optionList).replace("l", "L"))));

			} else {
				theActor.attemptsTo(Click.on(OPTION_FILTER.of("My" + " " + ucFirst(optionList).substring(0, 8))));
			}

			theActor.attemptsTo(on(MODAL_MY_CATEGORIES));
			theActor.remember("category", unitName);
			theActor.attemptsTo(
					theValue(theActor.recall("category").toString()).into(SEARCH_UNIT_GENERAL).thenHit(ENTER));

		}

	}

	public boolean onTheList() {

		if (ITEM_TABLE.of(unitName).resolveFor(theActor).containsText(unitName)) {
			return true;
		} else {
			return false;
		}

	}

}
