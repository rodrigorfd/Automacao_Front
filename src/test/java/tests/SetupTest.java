package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.*;
import utils.Browser;
import utils.Utils;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class SetupTest extends BaseTests{

    @Test
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos o navegador e carregamos a url!");
    }

    //--------------------------------------------------------------------------

    Random random = new Random();
    String e_mail = "goku_ssj_" +random.nextInt(30)+ "@capsulecorp.com";

    @Test
    public void testAccountCreation(){
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        AuthenticationPage creat = new AuthenticationPage();

        home.clickBtnLogin();
        System.out.println("Clicou no Sign in");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));
        System.out.println("Validou pagina de login");
        login.fillEmailCreateAnAccount(e_mail);
        System.out.println("Preencheu email da area de criação de conta");
        login.clickBtnCreateAnAccount();
        System.out.println("Clicou no botão criar conta");
        assertTrue(Browser.getCurrentDriver().findElement(By
                .className("navigation_page")).getText().contains("Authentication"));
        System.out.println("Validou pagina de Autenticação");
        creat.clickId_gender1();
        System.out.println("Marcou o Titulo Mr.");
        creat.fillCustomer_firstname("Goku");
        System.out.println("Preencheu o primeiro nome");
        creat.fillCustomer_lastname("Son");
        System.out.println("Preencheu o ultimo nome");
        creat.clickNoEmail();
        System.out.println("Clicou no email");
        creat.fillPasswd("k4meh4meh4");
        System.out.println("Preencheu a senha");
        creat.fillBirthDate(9,5,1985);
        System.out.println("Preencheu data de nascimento");
        creat.clickNewsletterAndOffers();
        System.out.println("selecionou recebimento de newsletter e ofertas");
        creat.fillCompanyNameBox("Capsulecorp");
        System.out.println("Preencheu nome da empresa");
        creat.fillAddress1("Rua Namekusei");
        creat.fillAddress2("8000");
        creat.fillNameCity("Satan City");
        creat.selectState();
        creat.fillPostcode("12345");
        creat.selectCountry();
        creat.fillOther("Casa Laranja");
        System.out.println("Preencheu endereço");
        creat.fillPhoneHome("12122121");
        creat.fillPhoneMobile("898989898");
        System.out.println("Preencheu numeros telefonicos");
        creat.fillAltAddress(" Rua Kuririn, 1818");
        System.out.println("Preencheu endereço alternativo");
        creat.clickBtnSubmitAccount();
        System.out.println("Clicou no botão Register");
    }

    //--------------------------------------------------------------------------

    @Test
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


        home.clickBtnLogin();
        System.out.println("CLicou em 'Sign in' e direcionou para a pagina de login");

        login.doLogin();
        System.out.println("Fez Login");

        conta.doSearch("dress");
        System.out.println("Fez uma pesquisa");

        search.selectProductByColor();
        System.out.println("Selecionou o produto pela cor preta");

        product.clickBtnAddToCart();
        System.out.println("Adicionou produto ao carrinho");
        product.clickBtnCheckout();
        System.out.println("Direcionou para a pagina de Checkout");
        cart.clickBtnProceedToCheckout();
        System.out.println("Avançou para a proxima etapa");
        address.fillTextBox("Embalado para presente");
        System.out.println("Adicionou comentário ao pedido");
        address.clickBtnProceedAddress();
        System.out.println("Avançou para a pagina de envio");
        shipping.clickBtnCheckbox();
        System.out.println("Aceitou termos de serviço");
        shipping.clickBtnSubmitShipping();
        System.out.println("Avançou para a pagina de pagamento");
        pay.clickbtnPaymentMethod();
        System.out.println("Selecionou a forma de pagamento por transferencia bancaria");
        pay.clickBtnConfirmOrder();
        System.out.println("clicou em confirmar o pedido");
    }

    @Test
    public void productOnCartTest(){

        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        MyAccountPage conta = new MyAccountPage();
        SearchPage search = new SearchPage();
        ProductPage product = new ProductPage();
        CartPage cart = new CartPage();

        //--------------------------------------------------------------------------

        home.clickBtnLogin();
        System.out.println("CLicou em 'Sign in' e direcionou para a pagina de login");
        login.doLogin();
        System.out.println("Fez Login");
        conta.doSearch("dress");
        System.out.println("Fez uma pesquisa");
        search.selectProductByColor();
        System.out.println("Selecionou o produto pela cor preta");
        product.clickBtnAddToCart();
        System.out.println("Adicionou produto ao carrinho");
        product.clickBtnCheckout();
        System.out.println("Direcionou para a pagina de Checkout");
        assertTrue(cart.getNameProductCar().equals("Printed Summer Dress"));
        System.out.println("Validou produto no carrinho");
    }

}
