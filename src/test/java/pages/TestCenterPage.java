package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.eo.Se;
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

    //DROPDOWN ELEMENTS

    public SelenideElement yil =$(By.xpath("//*[@id='year']"));
    public SelenideElement ay =$(By.id("month"));
    public SelenideElement gun =$(By.id("day"));

    //ALERT ELEMENTS
    public  SelenideElement promptButton =$(By.xpath("//button[@onclick='jsPrompt()']"));
    public  SelenideElement sonuc =$(By.xpath("//*[@id='result']"));
   //frame elements
    public SelenideElement backButton =$(By.xpath("//a[@type='button']"));





}
