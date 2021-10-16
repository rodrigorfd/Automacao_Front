package pageObjects;

import elementMapper.AuthenticationPageElementMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class AuthenticationPage extends AuthenticationPageElementMapper {

    public AuthenticationPage (){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }
    public void clickId_gender1(){
        id_gender1.click();
    }

    public void fillCustomer_firstname(String fname){
        customer_firstname.sendKeys(fname);
    }

    public void fillCustomer_lastname(String lname){
        customer_lastname.sendKeys(lname);
    }

    public void clickNoEmail(){
        email.click();
    }

    public void fillPasswd(String pswd){
        passwd.sendKeys(pswd);
    }

    public void fillBirthDate(){
        days.findElement(By.xpath("//*[@id=\"days\"]/option[10]")).click();
        months.findElement(By.xpath("//*[@id=\"months\"]/option[6]")).click();
        years.findElement(By.xpath("//*[@id=\"years\"]/option[39]")).click();
    }

    public void clickNewsletterAndOffers(){
        newsletter.click();
        optin.click();
    }

    public void fillCompanyNameBox(String cname){
        company.sendKeys(cname);
    }
    public void fillAddress1(String address){
        address1.sendKeys(address);
    }
    public void fillAddress2(String address){
        address2.sendKeys(address);
    }
    public void fillNameCity (String name){
        city.sendKeys(name);
    }

    public void selectState(){
        state.findElement(By.xpath("//*[@id=\"id_state\"]/option[11]")).click();
    }

    public void fillPostcode(String num){
        postcode.sendKeys(num);
    }

    public void selectCountry(){
        country.findElement(By.xpath("//*[@id=\"id_country\"]/option[2]")).click();
    }

    public void fillOther(String arg){
        other.sendKeys(arg);
    }

    public void fillPhoneHome(String num){
        phone.sendKeys(num);
    }
    public void fillPhoneMobile(String numb){
        phoneMobile.sendKeys(numb);
    }
    public void fillAltAddress(String text){
        AltAddress.sendKeys(text);
    }

    public void clickBtnSubmitAccount(){
        submitAccount.click();
    }
}
