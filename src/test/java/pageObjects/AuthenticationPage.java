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

    public void fillBirthDate(int d, int m, int y){
        days.findElement(By.cssSelector("option[value='"+d+"']")).click();
        months.findElement(By.cssSelector("option[value='"+m+"']")).click();
        years.findElement(By.cssSelector("option[value='"+y+"']")).click();
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
    public void fillAddress2(String nro){
        address2.sendKeys(nro);
    }
    public void fillNameCity (String name){
        city.sendKeys(name);
    }

    public void selectState(){
        state.click();
    }

    public void fillPostcode(String pcode){
        postcode.sendKeys(pcode);
    }

    public void selectCountry(){
        country.click();
    }

    public void fillOther(String add){
        other.sendKeys(add);
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
