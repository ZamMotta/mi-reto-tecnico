import net.serenitybdd.core.pages.PageObject;

public class Usuario extends PageObject {

    public void visitarPaginaDeInicio() {
        // Aquí agregas la lógica para visitar la página de inicio
        open();
    }

    public void agregarProductoAlCarrito(int productoId, int cantidad) {
        // Aquí agregas la lógica para agregar un producto al carrito
        // Por ejemplo, encontrar el producto por ID y hacer clic en "Agregar al carrito"
    }

    public void verificarProductosEnElCarrito() {
        // Aquí agregas la lógica para verificar que los productos están en el carrito
        // Esto puede incluir verificar los elementos en la página del carrito
    }
}
