package tests;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.*;
import utils.Browser;
import utils.Utils;

import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SetupTest extends BaseTests{

    Random random = new Random();
    String e_mail = "goku_ssj_" +random.nextInt(20)+ "@capsulecorp.com";

    @Test
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos o navegador e carregamos a url!");
    }

    @Test
    public void testLogin(){

    //  iniciar as páginas
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();

        home.clickBtnLogin();
        System.out.println("CLicou em 'Sign in' e direcionou para a pagina de login");

        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));
        System.out.println("Validou pagina de login");

        login.fillEmail();
        System.out.println("Preencheu o email");

        login.filllPasswd();
        System.out.println("Preencheu a senha");

        login.clickBtnSubmitLogin();
        System.out.println("Clicou em 'Sign in'");

        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
        System.out.println("Validou a url de minha conta");

        assertTrue(Browser.getCurrentDriver().findElement(By
                .className("page-heading")).getText().contains("MY ACCOUNT"));
        System.out.println("Validou minha conta no site");
    }

    @Test
    public void testSearch(){
        String quest = "DRESS";
        String questResultQtd = "7";

        //Iniciar as páginas
        HomePage home = new HomePage();
        SearchPage search = new SearchPage();

        // Fazer a pesquisa
        home.doSearch(quest);

        //Validar a pesquisa
        assertTrue(search.isSearchPage());
        assertEquals(search.getTextLighter().replace("\"",""),quest);
        assertThat(search.getTextHeading_counter(), CoreMatchers.containsString(questResultQtd));
    }

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
        creat.fillBirthDate();
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
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));
        System.out.println("Validou pagina de login");

        login.doLogin();
        System.out.println("Fez Login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
        System.out.println("Validou a url de minha conta");
        conta.doSearch("dress");
        System.out.println("Fez uma pesquisa");
        assertTrue(search.isSearchPage());
        System.out.println("Validou pagina de busca");
        search.selectProductByColor();
        System.out.println("Selecionou o produto da cor preta");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getBaseUrl().concat("index.php?id_product=5&controller=product#/size-s/color-black")));
        System.out.println("Validou pagina do produto");
        product.clickBtnAddToCart();
        System.out.println("Adicionou produto ao carrinho");
        product.clickBtnCheckout();
        System.out.println("Direcionou para a pagina de Checkout");
        assertTrue(cart.getNameProductCar().equals("Printed Summer Dress"));
        System.out.println("Validou produto no carrinho");
        cart.clickBtnProceedToCheckout();
        System.out.println("Avançou para a proxima etapa");
        //----------------------------------------------------
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
        System.out.println("Confirmou o pedido");
        assertTrue(pay.getOrderConfirmation().equals("ORDER CONFIRMATION"));
    }
}
