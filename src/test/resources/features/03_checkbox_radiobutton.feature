  @checkbox
  Feature: checkbox ve radio button
    Scenario: TC01  checkbox
      Given kullanici "https://testcenter.techproeducation.com/index.php?page=checkboxes" adresine gider
      And "Checkbox 1" secili degilse sec
      And "Checkbox 2" secili degilse sec
      And sayfayi acik tuttar


      @radio
      Scenario: TC02 Radio Button
        Given kullanici "https://testcenter.techproeducation.com/index.php?page=radio-buttons" adresine gider
        And "Red" secili degilse sec