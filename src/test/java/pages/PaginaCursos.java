package pages;

import org.openqa.selenium.WebDriver;

public class PaginaCursos extends BasePage{

    private String fundamentosTestingLink = "//a[@href and h3[normalize-space()='Introducción al Testing de Software']]";

    public PaginaCursos() {
        super(driver);
    }

    public void clickFundamentosTestingLink(){
        clickElement(fundamentosTestingLink);
    }
}
