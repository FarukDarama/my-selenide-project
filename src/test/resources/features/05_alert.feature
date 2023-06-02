 @alert
  Feature: alert
    Scenario: TC01 Alert
      Given kullanici "https://testcenter.techproeducation.com/index.php?page=javascript-alerts" adresine gider
      And alert promt butonuna tiklar
      And kullanici alerte "hello" teni yazar ve OK e tiklar
      Then kullanici sonucun "hello" icerdigini dogrular
