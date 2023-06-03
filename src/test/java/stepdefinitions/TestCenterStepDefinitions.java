package stepdefinitions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TestCenterPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

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
        if (text.equals("Checkbox 1") && !testCenterPage.checkbox1.isSelected()) {
            testCenterPage.checkbox1.click();
            testCenterPage.checkbox1.shouldBe(checked);
        }
        if (text.equals("Checkbox 2") && !testCenterPage.checkbox2.isSelected()) {
            testCenterPage.checkbox2.click();
            testCenterPage.checkbox2.shouldBe(checked);
        }

        if (text.equals("Red") && !testCenterPage.red.isSelected()) {
            testCenterPage.red.shouldNotBe(selected);
            testCenterPage.red.click();
            testCenterPage.red.shouldBe(selected);
        }

        if (text.equals("Football") && !testCenterPage.football.isSelected()) {
            testCenterPage.football.shouldNotBe(selected);
            testCenterPage.football.click();
            testCenterPage.football.shouldBe(selected);
        }

    }

    @And("kullanici yil olarak {int}, ay olarak {string}, gun olarak {int}")
    public void kullaniciYilOlarakAyOlarakGunOlarak(int yil, String ay, int gun) {
        testCenterPage.yil.selectOption(23);
        sleep(3000);
        testCenterPage.ay.selectOption(ay);
        sleep(3000);
        testCenterPage.gun.selectOptionByValue(String.valueOf(gun));
    }

    //ALERT STEP DEFS
    @And("alert promt butonuna tiklar")
    public void alertPromtButonunaTiklar() {
        testCenterPage.promptButton.click();
    }

    @And("kullanici alerte {string} teni yazar ve OK e tiklar")
    public void kullaniciAlerteTeniYazarVeOKETiklar(String arg0) {
        switchTo().alert().sendKeys(arg0);
        sleep(3000);
        switchTo().alert().accept();
        sleep(3000);
    }

    @Then("kullanici sonucun {string} icerdigini dogrular")
    public void kullaniciSonucunIcerdiginiDogrular(String arg0) {
        testCenterPage.sonuc.shouldHave(text(arg0));
    }

    //iframe test steps
    @And("switch to frame {int}")
    public void switchToFrame(int frame) {
        switchTo().frame(frame - 1);
    }

    @And("kullanic backl to techproeducation.com linkine tiklar")
    public void kullanicBacklToTechproeducationComLinkineTiklar() {
        testCenterPage.backButton.click();
        System.out.println("sayfa url: " + url());
    }

    @And("switch to window {int}")
    public void switchToWindow(int targetWindow) {
        switchTo().window(targetWindow - 1, Duration.ofSeconds(5));
        System.out.println("Yeni sayfa url: " + url());

    }

    @And("kullanici source elementi target elementine surukler")
    public void kullaniciSourceElementiTargetElementineSurukler() {
//       actions().
//       dragAndDrop(testCenterPage.kaynak, testCenterPage.hedef).
//       build().
//       perform();
        actions().dragAndDropBy(testCenterPage.kaynak, 463, -19).build().perform();
        //elementin gidip gitmediğini getAttribte() ile alıp assert edebiliriz


    }

    @And("start butonuna tiklar")
    public void startButonunaTiklar() {
        testCenterPage.startButton.click();
    }

    @Then("kullanici {string} metnini dogrular")
    public void kullaniciMetniniDogrular(String arg0) {
        // Assert.assertEquals(arg0,testCenterPage.helloWorld.getText()); wait probleminden dolayı fail ediyor
        // WebDriverWait
        // WebDriverWait wait = new WebDriverWait(WebDriverRunner.getWebDriver(),Duration.ofSeconds(10));
        // wait.until(ExpectedConditions.visibilityOf(testCenterPage.helloWorld));
        // Assert.assertEquals(arg0,testCenterPage.helloWorld.getText());//Pass explicit wait ile problem cozulduı

        //SelenideWait
        testCenterPage.helloWorld.should(visible, Duration.ofSeconds(10));
        //  Assert.assertEquals(arg0,testCenterPage.helloWorld.getText());

        testCenterPage.helloWorld.shouldHave(text("Hello World!"));


    }


    @And("footer elementi gorunur sekilde goster")
    public void footerElementiGorunurSekildeGoster() {
      //  testCenterPage.amazonFooter
        executeJavaScript("arguments[0].scrollIntoView(true);",testCenterPage.amazonFooter);
    }
}
