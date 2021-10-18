package pageObjects;

import elementMapper.AuthenticationPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class AuthenticationPage extends AuthenticationPageElementMapper {

    public AuthenticationPage (){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }
    @Step("Escolheu o genero")
    public void clickId_gender1(){
        id_gender1.click();
    }

    @Step("Preencheu primeiro nome")
    public void fillCustomer_firstname(String fname){
        customer_firstname.sendKeys(fname);
    }

    @Step("Preencheu Ultimo nome")
    public void fillCustomer_lastname(String lname){
        customer_lastname.sendKeys(lname);
    }

    public void clickNoEmail(){
        email.click();
    }

    @Step("Preencheu a senha")
    public void fillPasswd(String pswd){
        passwd.sendKeys(pswd);
    }

    @Step("Preencheu a data de nascimento")
    public void fillBirthDate(int d, int m, int y){
        days.findElement(By.cssSelector("option[value='"+d+"']")).click();
        months.findElement(By.cssSelector("option[value='"+m+"']")).click();
        years.findElement(By.cssSelector("option[value='"+y+"']")).click();
    }

    @Step("Selecionou as caixas para receber boletim de noticias e ofertas")
    public void clickNewsletterAndOffers(){
        newsletter.click();
        optin.click();
    }

    @Step("Preencheu nome da empresa")
    public void fillCompanyNameBox(String cname){
        company.sendKeys(cname);
    }

    @Step("Preencheu endereço")
    public void fillAddress1(String address){
        address1.sendKeys(address);
    }

    @Step("Preencheu numero da casa")
    public void fillAddress2(String nro){
        address2.sendKeys(nro);
    }

    @Step("Preencheu nome da cidade")
    public void fillNameCity (String name){
        city.sendKeys(name);
    }

    @Step("Selecionou o estado")
    public void selectState(){
        state.click();
    }

    @Step("Preencheu codigo postal")
    public void fillPostcode(String pcode){
        postcode.sendKeys(pcode);
    }

    @Step("Selecionou o país")
    public void selectCountry(){
        country.click();
    }

    @Step("Iformou detalhes adicionais para localizar o endereço")
    public void fillOther(String add){
        other.sendKeys(add);
    }

    @Step("Preencheu numeros para contato")
    public void fillPhoneHome(String num){
        phone.sendKeys(num);
    }
    public void fillPhoneMobile(String numb){
        phoneMobile.sendKeys(numb);
    }
    @Step("Preencheu endereço alternativo")
    public void fillAltAddress(String text){
        AltAddress.sendKeys(text);
    }

    @Step("Clicou em criar conta")
    public void clickBtnSubmitAccount(){
        submitAccount.click();
    }
}
