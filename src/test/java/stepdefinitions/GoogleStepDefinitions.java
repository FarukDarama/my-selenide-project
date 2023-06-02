package stepdefinitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class GoogleStepDefinitions {

    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String string) {
     open(string);
    }
    @Then("{int} saniye bekler")
    public void saniye_bekler(Integer int1) {
     //selenide defauld olarak 4 sanıye bekler
     // 4 saniyeden fazla beklemek icin sleep methodu kullanılır
     sleep(int1*1000);
    }
    @Then("onceki sayfaya gider")
    public void onceki_sayfaya_gider() {
    back();
    }
    @Then("sonraki sayfaya gider")
    public void sonraki_sayfaya_gider() {
    forward();
    }
    @Then("sayfayi yeniler")
    public void sayfayi_yeniler() {
    refresh();
    }
    @Then("sayfayi acik tuttar")
    public void sayfayi_acik_tuttar() {
    // Varsayılan selenide ayarlarında browser otomatik kapatılır
        Configuration.holdBrowserOpen=true;
    }
}
