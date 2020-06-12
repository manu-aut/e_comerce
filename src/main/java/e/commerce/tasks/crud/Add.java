package e.commerce.tasks.crud;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Add {

	public static MyItems myCarriers(String carriersName, String optionList) {
		return instrumented(MyItems.class, carriersName, optionList);

	}

}
