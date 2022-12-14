package com.e2etests.automation.testCases.step_definitions;

import com.e2etests.automation.testCases.page_objects.AlertPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertSetpDefinition {

	public AlertPage alertPage;

	public AlertSetpDefinition() {
		alertPage = new AlertPage();
	}

	@Given("Je me connecte sur l application {string}")
	public void jeMeConnecteSurLApplication(String url) {
		alertPage.openUrl(url);
	}

	@When("Je agrandis le navigateur")
	public void jeAgrandisLeNavigateur() {
		alertPage.maximizeBrowser();
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
