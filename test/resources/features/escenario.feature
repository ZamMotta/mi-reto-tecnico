Feature: Carrito de compras
Scenario: Agregar 2 productos al carrito de compras
Given el usuario está en la página de inicio
When el usuario agrega el primer producto con 2 cantidades al carrito
And el usuario agrega el segundo producto con 5 cantidades al carrito
Then el usuario debería ver ambos productos en el carrito con las cantidades correctas