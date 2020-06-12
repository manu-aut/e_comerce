package e.commerce.userinterface;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.partialLinkText;

import net.serenitybdd.screenplay.targets.Target;

public class MyTeamsPage {
	public static final Target ADD_NEW_GROUP = the("Add new category").located(partialLinkText("Add new categories"));
	public static final Target NAME = the("Add new group").locatedBy("//input[@placeholder='Name']");
	public static final Target DESCRIPTION = the("Add new group")
			.locatedBy("//div[@class='mat-form-field-infix']//textarea");
	public static final Target BTN_SAVE = the("Add new group")
			.locatedBy("//div[@class='mat-dialog-actions']//button[2]");
	public static final Target TEMPORAL_TABLE = the("Add new group").locatedBy("//mat-card[@class='mat-card']");

}
