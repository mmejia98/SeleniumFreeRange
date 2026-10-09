package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.PaginaCursos;
import pages.PaginaPrincipal;

public class FreeRangeSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos paginaCursos = new PaginaCursos();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT(){
        landingPage.navigateToFreeRangerTesters();
    }

    @When("I go to {word} using the navigation bar")
    public void navigateBarUse(String section){
        landingPage.clickOnSectionNavigationBar(section);
    }

    @When("I select conocer academia")
    public void selectConocerAcademia(){
        landingPage.clickOnConocerAcademia();
    }

    @And("select  Introducción al Testing")
    public void navigateToIntro(){
        paginaCursos.clickFundamentosTestingLink();
    }

}
