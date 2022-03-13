package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends TestBase{

    @Test
    public void loginSuccess(){
        //  1.click the "[href='/login']"
        click(By.cssSelector("[href='/login']"));
        //  2.enter email [#user]
        type(By.cssSelector("#user"), "keysy9696@gmail.com");
        //  3.click the [#login]
        click(By.cssSelector("#login"));
        //  4.enter password [#password]
        type(By.cssSelector("#password"), "keysy1234*");

        //assert [data-test-id='data-test-id']

    }



}
