 @iframe
  Feature: ifareme _ window
    Scenario: TC01 ifarem ve window
      Given kullanici "https://testcenter.techproeducation.com/index.php?page=iframe" adresine gider
      And switch to frame 1
      And kullanic backl to techproeducation.com linkine tiklar
      And  switch to window 2
      And sayfayi acik tuttar