package co.sqasa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import co.sqasa.pageObjects.PaginaDeInicio; // Asegúrate de que esta importación sea correcta

public class AbrirPaginaDeInicio implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Aquí se abre la página de inicio
        actor.attemptsTo(Open.browserOn(new PaginaDeInicio()));
    }

    public static AbrirPaginaDeInicio abrir() {
        return new AbrirPaginaDeInicio();
    }
}
