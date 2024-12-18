package com.nttdata.glue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @When("creo el pedido {string} con el id mascota {string} de la mascota")
    public void creoElPedidoConElIdMascotaDeLaMascota(String arg0, String arg1) {

    }

    @Then("la respuesta debe contener un codigo de estatus {}")
    public void laRespuestaDebeContenerUnCodigoDeEstatus(String arg0) {
    }

    @And("el tipo debe ser {string}")
    public void elTipoDebeSer(String arg0) {
    }

    @When("consulto el {string} de la order")
    public void consultoElDeLaOrder(String arg0) {
    }

    @Then("la respuesta debe ser {}")
    public void laRespuestaDebeSer(String arg0) {
    }

    @And("tipo debe ser {}")
    public void tipoDebeSer(String arg0) {
    }
}
