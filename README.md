# Botiga---UML3

![](https://github.com/Xavi678/Botiga---UML3/blob/master/Botiga.png)

### Client - Compte
  - Un compte pot tenir molts clients, en canvi un client només pot tenir un compte

### Compte - Pagament
  - Un compte pot tenir un pagamament i viceversa
### Compte - Comanda
  - Un compte pot tenir moltes comandes, i una comanda pot tenir un compte
### Comanda - Pagament
  - Una comanda pot tenir zero o molts pagaments
### Pagamament - (Tarjeta Credit, Paypal, Efectiu)
  - Aquests tres objectes hereden de Pagament
### Comanda - Línia
  - Una comanda té una o moltés línies, i la línia té una comanda
### Comanda - Client
  - Una comanda té o o molts clients, un client té una comanda
### Compte - ShoppingCart
  - Un compte pot tenir un o zero carts, un shopping cart té un compte
### Client - Usuari Web
  - Un client pot tenir un o zero usuariswebs, un usuari web té un client
### UsuariWeb - shoppingCart
  - Un usuariweb té un o zero carts, un cart té un usuari web
### Línia - ShoppingCart
  - Un shoppingcart té una línia, una línia té un shoppingcart
### Producte - Línia
  - un producte té una línia, una línia té un producte
  
## Generar Codi Java
- <a href="https://github.com/Xavi678/Botiga---UML3/tree/master/VP%20JAVA">Directori amb el codi Java</a>
