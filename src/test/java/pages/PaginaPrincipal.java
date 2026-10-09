package pages;

public class PaginaPrincipal extends BasePage {

    private String sectionLink = "//nav[@aria-label='Main']/ul/li/a[normalize-space()='%s' and @href]";
    private String conocerAcademiaLink = "//a[normalize-space()='Conocer Academia' and @href]";

    public PaginaPrincipal() {
        super(driver);
    }

    public void navigateToFreeRangerTesters(){
        navigateTo("https://www.freerangetesters.com/");
    }

    public void clickOnSectionNavigationBar(String section){
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }

    public  void clickOnConocerAcademia(){
        clickElement(conocerAcademiaLink);
    }
}
