package co.sqasa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;

public class AgregarProducto implements Task {

    private final int productoId;
    private final int cantidad;

    public AgregarProducto(int productoId, int cantidad) {
        this.productoId = productoId;
        this.cantidad = cantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(By.id("producto-" + productoId)),
            Clear.field(By.id("cantidad")),
            Enter.theValue(Integer.toString(cantidad)).into(By.id("cantidad")),
            Click.on(By.id("agregar-carrito"))
        );
    }

    public static AgregarProducto conCantidad(int productoId, int cantidad) {
        return new AgregarProducto(productoId, cantidad);
    }
}
