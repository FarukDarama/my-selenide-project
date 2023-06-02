package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestCenterPage {
    public SelenideElement kullaniciAdi=$(By.id("exampleInputEmail1"));
    public SelenideElement kullaniciSifresi=$(By.id("exampleInputPassword1"));
    public SelenideElement submit=$(By.xpath("//*[text()='Submit']"));
     public SelenideElement logout =$(By.xpath("//*[text()=' Logout']"));

     // CHECKBOX ELEMENTS
    public SelenideElement checkbox1 = $(By.id("box1"));
    public SelenideElement checkbox2 = $(By.id("box2"));

    //Radio Eelements
    public SelenideElement red =$(By.id("red"));
    public SelenideElement football =$(By.id("football"));









}
