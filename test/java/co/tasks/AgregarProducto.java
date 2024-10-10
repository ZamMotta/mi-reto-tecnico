6.	package co.sqasa.tasks;
7.	
8.	import net.serenitybdd.screenplay.Actor;
9.	import net.serenitybdd.screenplay.Task;
10.	import net.serenitybdd.screenplay.actions.Click;
11.	import net.serenitybdd.screenplay.actions.Clear;
12.	import net.serenitybdd.screenplay.actions.Enter;
13.	import org.openqa.selenium.By;
14.	
15.	public class AgregarProducto implements Task {
16.	
17.	    private final int productoId;
18.	    private final int cantidad;
19.	
20.	    public AgregarProducto(int productoId, int cantidad) {
21.	        this.productoId = productoId;
22.	        this.cantidad = cantidad;
23.	    }
24.	
25.	    @Override
26.	    public <T extends Actor> void performAs(T actor) {
27.	        actor.attemptsTo(
28.	            Click.on(By.id("producto-" + productoId)),
29.	            Clear.field(By.id("cantidad")),
30.	            Enter.theValue(Integer.toString(cantidad)).into(By.id("cantidad")),
31.	            Click.on(By.id("agregar-carrito"))
32.	        );
33.	    }
34.	
35.	    public static AgregarProducto conCantidad(int productoId, int cantidad) {
36.	        return new AgregarProducto(productoId, cantidad);
37.	    }
38.	}
