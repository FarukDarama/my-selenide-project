package stepdefinitions;

import io.cucumber.java.en.And;

import java.util.Date;

import static com.codeborne.selenide.Selenide.screenshot;

public class CommonStepDefinitions {
    @And("tum ekran goruntusunu alir")
    public void tumEkranGoruntusunuAlir() {
       screenshot(new Date().toString());// ekran görüntüsüne isim verildi
    }
}
