package stepdefinitions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCenterPage;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.selected;

public class TestCenterStepDefinitions {
 TestCenterPage testCenterPage = new TestCenterPage();

    @Given("kullanici adini gir")
    public void kullanici_adini_gir() {
     testCenterPage.kullaniciAdi.setValue("techpro");
    }
    @Given("kullanici sifresini gir")
    public void kullanici_sifresini_gir() {
testCenterPage.kullaniciSifresi.setValue("SuperSecretPassword");
    }
    @When("submit buttonuna tikla")
    public void submit_buttonuna_tikla() {
    testCenterPage.submit.click();
    }
    @Then("giris yapildigini test et")
    public void giris_yapildigini_test_et() {
     testCenterPage.logout.should(Condition.visible);
    }


    @And("{string} secili degilse sec")
    public void seciliDegilseSec(String text) {

        // eger text= Checkbox 1 ve check box 1 secili degilse ceheckbox 1 tıkla
       if(text.equals("Checkbox 1") && !testCenterPage.checkbox1.isSelected()){
           testCenterPage.checkbox1.click();
           testCenterPage.checkbox1.shouldBe(checked);
       }
       if (text.equals("Checkbox 2") && !testCenterPage.checkbox2.isSelected()) {
           testCenterPage.checkbox2.click();
           testCenterPage.checkbox2.shouldBe(checked);
       }

       if(text.equals("Red") && !testCenterPage.red.isSelected()){
           testCenterPage.red.shouldNotBe(selected);
           testCenterPage.red.click();
           testCenterPage.red.shouldBe(selected);
       }

        if(text.equals("Football") && !testCenterPage.football.isSelected()){
            testCenterPage.football.shouldNotBe(selected);
            testCenterPage.football.click();
            testCenterPage.football.shouldBe(selected);
        }

    }
}
