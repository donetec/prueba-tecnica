package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObject.Wikipedia_Page;

public class Wikipedia {

    @Given("Buscar {string} en {string}")
    public void buscar(String busqueda, String urlBuscador) {
        Wikipedia_Page.buscar(busqueda, urlBuscador);
    }

    @Then("Acceder al resultado que corresponde a la web {string}")
    public void navegarAlResultado(String web) {
        Wikipedia_Page.navegarAlResultado(web);
    }

    @And("Comprobar que el primer proceso automático se hizo sobre el año {string}")
    public void comprobar(String anio) throws Throwable {
        Wikipedia_Page.comprobar(anio);
    }
}
