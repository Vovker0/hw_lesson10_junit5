package guru.qa.pages;

import com.codeborne.selenide.SelenideElement;
import guru.qa.pages.components.SearchBox;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    SearchBox searchBox = new SearchBox();

    SelenideElement featuredCategories = $("[data-test=pictureNavigation]");

    public MainPage openPage() {
        open("/");
        featuredCategories.shouldHave(text("Featured categories"));
        return this;
    }

    public MainPage searchFor(String value) {
        searchBox.search(value);
        sleep(1000);
        return this;
    }
}
