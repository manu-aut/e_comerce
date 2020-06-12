package e.commerce.userinterface;

import static net.serenitybdd.screenplay.targets.Target.the;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Init {

	public static final Target EMAIL = the("User").located(By.id("mat-input-0"));
	public static final Target PSSWD = the("User").located(By.id("mat-input-1"));
	public static final Target BTN = the("User").locatedBy("//span[@class='mat-button-wrapper']");
//	public static final Target LABEL = Target.the("Label").located(By.id("mat-error-2"));
	public static final Target LABEL = the("Label").locatedBy("//*[@class='login-invalid mat-error ng-star-inserted']");

}
