package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import org.slf4j.impl.StaticLoggerBinder;



public class Login extends TestBase{

    @BeforeMethod
    public void preconditions(){
        if(app.getUserHelper().isLogged()){
            app.getUserHelper().logout();
        }
    }

    @Test
    public void loginSuccess(){

        app.getUserHelper().initLogin();
        app.getUserHelper().fillLoginForm("keysy9696@gmail.com","keysy1234*");
        app.getUserHelper().submitLogin();
        app.getUserHelper().isLoggedSuccess();

        //assert [data-test-id='data-test-id']
    }
    //public void loginWithEmptyPassword(){
        //app.getUserHelper().initLogin();
        //app.getUserHelper().fillLoginForm("keysy9696@gmail.com"; " ");

    //}




}
