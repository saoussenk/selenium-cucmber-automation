@connexion
Feature: Je souhaite tester la connexion 

  @connexion
  Scenario: Je souhaite tester la connexion
    Given je me connecte sur l application "https://demoqa.com/login"
    And  Je agrandis le navigateur
    When Je saisie une adress mail
    And Je saisie le mot de passe
    Then je clique sur le bouton connexion
