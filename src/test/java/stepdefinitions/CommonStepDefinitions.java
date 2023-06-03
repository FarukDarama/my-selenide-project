package stepdefinitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.util.Date;

import static com.codeborne.selenide.Selenide.screenshot;

public class CommonStepDefinitions {
    @And("tum ekran goruntusunu alir")
    public void tumEkranGoruntusunuAlir() {
       screenshot("image");// ekran görüntüsüne isim verildi
    }

    @Given("kullanici browser tipini {string} olarak secer")
    public void kullaniciBrowserTipiniOlarakSecer(String browserTipi) {

        switch (browserTipi){
            case "headless":
                Configuration.headless= true;
                break;
            case "firefox":
                Configuration.browser="firefox";
                break;
            case "edge":
                Configuration.browser= "edge";
                break;
            default:
                Configuration.browser="chrome";
                break;
        }





    }
}
