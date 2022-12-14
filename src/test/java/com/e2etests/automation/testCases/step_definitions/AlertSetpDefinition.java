package com.e2etests.automation.testCases.step_definitions;

import com.e2etests.automation.testCases.page_objects.AlertPage;
import com.e2etests.automation.utils.BasePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertSetpDefinition extends BasePage {

	public AlertPage alertPage;

	public AlertSetpDefinition() {
		alertPage = new AlertPage();
	}

	@Given("Je me connecte sur l application {string}")
	public void jeMeConnecteSurLApplication(String url) {
		alertPage.openUrl(url);
		log.info("Open url");
	}

	@When("Je agrandis le navigateur")
	public void jeAgrandisLeNavigateur() {
		alertPage.maximizeBrowser();
		log.error("Maximize navigator");
	}

	@When("Je clique sur le bouton alert boutton")
	public void jeCliqueSurLeBoutonAletBoutton() {
		alertPage.clickOnAlertButton();
	}

	@When("Je accepte l alerte")
	public void jeAccepteLAlerte() {
		alertPage.switchAlert();
	}

	@Then("Je verifie le titre de la page")
	public void jeVerifieLeTitreDeLaPage() {
		alertPage.checkTitle();
	}
}
