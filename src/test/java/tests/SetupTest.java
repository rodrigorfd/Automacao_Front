package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.Test;
import pageObjects.*;

import java.util.Random;

import static org.junit.Assert.assertTrue;
@Feature("Teste de um site de ecommerce")
public class SetupTest extends BaseTests{

    Random random = new Random();
    String e_mail = "goku_ssj_" +random.nextInt(17)+ "@capsulecorp.com";

    @Test
    @Story("Criar uma conta no site")
    public void testAccountCreation(){
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        AuthenticationPage creat = new AuthenticationPage();
        MyAccountPage conta = new MyAccountPage();

        //--------------------------------------------------------------------------

        home.clickBtnLogin();
        login.fillEmailCreateAnAccount(e_mail);
        login.clickBtnCreateAnAccount();
        creat.clickId_gender1();
        creat.fillCustomer_firstname("Goku");
        creat.fillCustomer_lastname("Son");
        creat.clickNoEmail();
        creat.fillPasswd("k4meh4meh4");
        creat.fillBirthDate(9,5,1985);
        creat.clickNewsletterAndOffers();
        creat.fillCompanyNameBox("Capsulecorp");
        creat.fillAddress1("Rua Namekusei");
        creat.fillAddress2("8000");
        creat.fillNameCity("Satan City");
        creat.selectState();
        creat.fillPostcode("12345");
        creat.selectCountry();
        creat.fillOther("Casa Laranja");
        creat.fillPhoneHome("12122121");
        creat.fillPhoneMobile("898989898");
        creat.fillAltAddress(" Rua Kuririn, 1818");
        creat.clickBtnSubmitAccount();
        assertTrue(conta.getMyAccountName().equals("My account"));
        System.out.println("Validou a criação da conta");
    }


    @Test
    @Story("Fazer uma compra no site")
    public void purchaseTest (){

        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        MyAccountPage conta = new MyAccountPage();
        SearchPage search = new SearchPage();
        ProductPage product = new ProductPage();
        CartPage cart = new CartPage();
        AddressPage address = new AddressPage();
        ShippingPage shipping = new ShippingPage();
        PaymentPage pay = new PaymentPage();

        //--------------------------------------------------------------------------

        home.clickBtnLogin();

        login.doLogin();

        conta.doSearch("dress");

        search.selectProductByColor();
        product.selectSize("M");
        product.clickBtnAddToCart();
        product.clickBtnCheckout();
        cart.clickBtnProceedToCheckout();
        address.fillTextBox("Embalado para presente");
        address.clickBtnProceedAddress();
        shipping.clickBtnCheckbox();
        shipping.clickBtnSubmitShipping();
        pay.clickbtnPaymentMethod();
        pay.clickBtnConfirmOrder();
        assertTrue(pay.getOrderConfirmationPageName().equals("Order confirmation"));
        System.out.println("Validou a Compra");
    }

    @Test
    @Story("Adicionar um produto ao carrinho")
    public void productOnCartTest(){

        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        MyAccountPage conta = new MyAccountPage();
        SearchPage search = new SearchPage();
        ProductPage product = new ProductPage();
        CartPage cart = new CartPage();

        //--------------------------------------------------------------------------

        home.clickBtnLogin();
        login.doLogin();
        conta.doSearch("dress");
        search.selectProductByColor();
        product.clickBtnAddToCart();
        product.clickBtnCheckout();
        assertTrue(cart.getNameProductCar().equals("Printed Summer Dress"));
        System.out.println("Validou produto no carrinho");
    }
}