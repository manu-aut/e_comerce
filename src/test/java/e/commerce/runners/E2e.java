package e.commerce.runners;

import static cucumber.api.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/e2e.feature", snippets = CAMELCASE, glue = "src/test/java/e/commerce/stepdefinitions")
public class E2e {

}
