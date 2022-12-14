package com.e2etests.automation.testCases.step_definitions;

import com.e2etests.automation.testCases.page_objects.ConnexionPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConnexionStepDefinition {

	ConnexionPage connexionpage;

	public ConnexionStepDefinition() {
		this.connexionpage = new ConnexionPage();
	}

	@Given("je me connecte sur l application {string}")
	public void jeMeConnecteSurLApplication(String url){
		connexionpage.openUrl(url);

	}

	@When("Je saisie une adress mail")
	public void jeSaisieUneAdressMail(String name) {
		connexionpage.fillUserName(name);
	}

	@When("Je saisie le mot de passe")
	public void jeSaisieLeMotDePasse(String pswd) {
		connexionpage.fillPassword(pswd);
	}

	@Then("je clique sur le bouton connexion")
	public void jeCliqueSurLeBoutonConnexion() {
		connexionpage.BtnConnexion();
	}

}
