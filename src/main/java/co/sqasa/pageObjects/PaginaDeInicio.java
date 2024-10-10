<<<<<<< HEAD
package co.sqasa.pageObjects;
=======
package co.sqasa.pageObjects; 
>>>>>>> 3c488b1e7d9c12a4939a300f0ebbe63019263be6

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaDeInicio extends PageObject {
    
    public void agregarProductoAlCarrito(int productoId, int cantidad) {
        find(By.id("producto-" + productoId)).click();
        find(By.id("cantidad")).clear();
        find(By.id("cantidad")).type(Integer.toString(cantidad));
        find(By.id("agregar-carrito")).click();
    }

    public void verificarProductosEnElCarrito() {
<<<<<<< HEAD
=======
        
        
>>>>>>> 3c488b1e7d9c12a4939a300f0ebbe63019263be6
    }
}
