package e.commerce.userinterface;

import static net.serenitybdd.screenplay.targets.Target.the;

import net.serenitybdd.screenplay.targets.Target;

public class MenuPage {

	public static final Target MENU_OPTION = the("Option menu").locatedBy("//a[.//span[text()='{0}']]");
//	public static final Target OPTION_MENU_ = the("Option menu").locatedBy("//div[@class='ng-tns-c12-6 ng-star-inserted']//*[text()[contains(.,'{0}')]]");
	public static final Target OPTION_MENU_ = the("Option menu").locatedBy("//*[text()[contains(.,'{0}')]]");
	public static final Target OPTION_ABS = the("Option menu")
			.locatedBy("//div[@class='ng-tns-c12-6 ng-star-inserted']//div[4]");
	// Abs
	public static final Target CATEGORIES_OPTION = the("Option menu").locatedBy("//div[@class='ng-tns-c12-6 ng-star-inserted']//div[3]");

}
