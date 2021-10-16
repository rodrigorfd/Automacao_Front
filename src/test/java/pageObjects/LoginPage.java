package pageObjects;

import elementMapper.LoginPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

import java.util.Random;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public void fillEmailCreateAnAccount(String email){
        email_create.sendKeys(email);
    }

    public void clickBtnCreateAnAccount () {
        SubmitCreate.click();
    }

    public void fillEmail(){
        email.sendKeys("goku_ssj_1@capsulecorp.com");
    }
    public void filllPasswd(){
        passwd.sendKeys("k4meh4meh4");
    }

    public void clickBtnSubmitLogin(){
        SubmitLogin.click();
    }

    public void doLogin(){
        fillEmail();
        filllPasswd();
        clickBtnSubmitLogin();
    }
}
