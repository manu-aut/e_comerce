package e.commerce.userinterface;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.partialLinkText;

import net.serenitybdd.screenplay.targets.Target;

public class MyHome {

	public static final Target ADD_UNIT = the("Option  add a unit").located(partialLinkText("Add a unit"));
	public static final Target SEARCH_UNIT_ADD = the("Option  add a unit")
			.locatedBy("//input[@placeholder='Search unit by Name, MC #, DOT #']");
	public static final Target ITEMS_PAGE = Target.the("Itmes per page").locatedBy("//p[text()='Items per page:']");
	public static final Target SELECT_ITEMS = Target.the("Itmes per page").locatedBy("//*[@id=\"mat-select-7\"]/div");
	public static final Target SEARCH_PRIVATE = Target.the("Itmes per page").locatedBy("//*[@id=\"mat-input-1\"]");
	public static final Target ITEM_TABLE = Target.the("Itmes per page")
			.locatedBy("//tbody[@class='text']//tr[td//text()[contains(., '{0}')]]");
	public static final Target MATH_ICON = Target.the("Itmes per page")
			.locatedBy("//*[@id=\"add-carrier-container\"]/mat-card/table/tbody/tr[1]/td[7]/mat-icon");
	public static final Target OPTION_TEXT = Target.the("Button option").locatedBy("//button[contains(text(), '{0}')]");
	public static final Target MODALSITO1 = Target.the("confirmation Message ").locatedBy(
			"//div[@class='toast-message ng-star-inserted' and contains(text(),' Added carrier to your carrier list ')]");
	public static final Target LABEL_MESSG = Target.the("confirmation Message ").locatedBy("//div[@class='toast-title ng-star-inserted' and contains(text(),'{0}')]");
	
	
	
	public static final Target FILTER = Target.the("confirmation Message ").locatedBy("//button[@class='wrap-filter']");
	public static final Target OPTION_FILTER = Target.the("Option filter").locatedBy("//label[.//span[text()='{0}']]");
	public static final Target BUTTON_ICON = Target.the("Button icon").locatedBy("//button[@class='wrap-filter']");
	public static final Target MODAL_MY_CATEGORIES = Target.the("Modal for scape").locatedBy("//*[@class='title-wrap-filter-group search text' and contains(text(),'My Carriers')]");
	public static final Target SEARCH_UNIT_GENERAL = Target.the("Modal for scape").locatedBy("//div[@class='wrap-search-input']//div[2]//input");
	public static final Target LISTA_FILTER = Target.the("Modal for scape").locatedBy("//tr[@class='mat-row ng-star-inserted']//div[.//span[text()='{0}']]");

}
