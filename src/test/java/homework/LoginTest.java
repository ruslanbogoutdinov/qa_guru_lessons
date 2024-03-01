package homework;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest {
    @Test
    void successfulLoginTest() {
        // To not close the browser after test
        //Configuration.holdBrowserOpen = true;
        // Use firefox browser (chrome is by default)
        //Configuration.browser = "firefox";
        // Set browser size
        Configuration.browserSize = "1920x1080";

        // To open needed URL
        open("https://school.qa.guru/cms/system/login");

        // Send keys to input field by its name
        $("[name=email]").setValue("rusyabogoutdinov97@gmail.com");
        $("[name=password]").setValue("5785251Rr");

        // Click on needed button by class
        $(".btn-success").click();
        $(".menu-item-icon").click();
        // Click on needed item which contains needed text
        $(".subitem-link").shouldHave(text("Профиль")).click();

        // Check for needed element is presented
        $(".page-header").shouldHave(text("Мой профиль"));
    }
}
