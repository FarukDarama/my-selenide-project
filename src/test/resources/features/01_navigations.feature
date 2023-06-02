 @google
Feature:  navigasyonlar


    Scenario: Tc01 navigation testi
      Given kullanici "https://www.google.com" adresine gider
      Given kullanici "https://www.amazon.com" adresine gider
      Then 5 saniye bekler
      And onceki sayfaya gider
      And sonraki sayfaya gider
      Then sayfayi yeniler
      Then sayfayi acik tuttar