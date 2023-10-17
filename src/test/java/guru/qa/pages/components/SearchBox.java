package guru.qa.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SearchBox {

    SelenideElement searchInput = $("#search");

    public void search(String value) {
        searchInput.setValue(value).pressEnter();
    }
}
