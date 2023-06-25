package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebTest extends TestBase {

    @Test
    public void remedyTest() {
        open("/");
        $(".style_secRegistrationSubtitle__FbBQD").shouldHave(text("Surgeon Log in"));
    }


}
