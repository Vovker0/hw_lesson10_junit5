package guru.qa.pages.components;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class PopupBanner {

    public void removeBanner() {
        executeJavaScript("document.querySelector(\"[data-test='@web/baseboardAd']\").remove()");
    }

}
