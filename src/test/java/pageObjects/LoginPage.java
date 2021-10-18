package pageObjects;

import elementMapper.LoginPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;


public class LoginPage extends LoginPageElementMapper {

    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    @Step("Preencheu o email")
    public void fillEmailCreateAnAccount(String email){
        email_create.sendKeys(email);
    }

    @Step("Clicou no botão de criar conta")
    public void clickBtnCreateAnAccount () {
        SubmitCreate.click();
    }

    @Step("Preencheu o email")
    public void fillEmail(){
        email.sendKeys("goku_ssj_1@capsulecorp.com");
    }

    @Step("Preencheu a Senha")
    public void filllPasswd(){
        passwd.sendKeys("k4meh4meh4");
    }

    @Step("Clicou em fazer login")
    public void clickBtnSubmitLogin(){
        SubmitLogin.click();
    }

    @Step("Fez o login")
    public void doLogin(){
        fillEmail();
        filllPasswd();
        clickBtnSubmitLogin();
    }
}
