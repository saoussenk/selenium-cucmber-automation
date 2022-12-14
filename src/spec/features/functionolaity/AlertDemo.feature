@smoke-test
Feature: Je souhaite accepter une alerte

  @alert
  Scenario: Je souhaite accepter une alerte
    Given Je me connecte sur l application "https://demoqa.com/alerts"
    When Je agrandis le navigateur
    And Je clique sur le bouton alert boutton
    And Je accepte l alerte
    Then Je verifie le titre de la page
