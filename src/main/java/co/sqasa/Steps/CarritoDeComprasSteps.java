package co.sqasa.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import co.sqasa.tasks.AgregarProducto;
import co.sqasa.tasks.AbrirPaginaDeInicio; // Importa el Task correcto

public class CarritoDeComprasSteps {

    // Inicializa el actor
    private Actor usuario = OnStage.theActorCalled("Usuario");

    @Given("^el usuario está en la página de inicio$")
    public void usuario_esta_en_pagina_inicio() {
        usuario.attemptsTo(AbrirPaginaDeInicio.abrir()); // Usando el Task para abrir la página
    }

    @When("^el usuario agrega el primer producto con (\\d+) cantidades al carrito$")
    public void agregar_primer_producto_al_carrito(int cantidad) {
        usuario.attemptsTo(AgregarProducto.conCantidad(1, cantidad));
    }

    @When("^el usuario agrega el segundo producto con (\\d+) cantidades al carrito$")
    public void agregar_segundo_producto_al_carrito(int cantidad) {
        usuario.attemptsTo(AgregarProducto.conCantidad(2, cantidad));
    }

    @Then("^el usuario debería ver ambos productos en el carrito con las cantidades correctas$")
    public void verificar_productos_en_carrito() {
        // Implementa el comportamiento aquí para verificar los productos en el carrito
    }
}
