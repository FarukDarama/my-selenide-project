  @draganddrop
  Feature: actions
    Scenario: TC01 drag and drop
      Given kullanici "https://jqueryui.com/droppable/" adresine gider
      And switch to frame 1
      And kullanici source elementi target elementine surukler
      And sayfayi acik tuttar