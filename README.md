# Carrito de Compras Example

## Description
This is a simple web application that demonstrates a shopping cart using HTML and Servlets. Users can add items to the shopping cart, and the items are stored in the user's session.

## Usage
1. Open the HTML file, `index.html`, in a web browser.
2. Enter the name of the item you want to add to the shopping cart in the input field.
3. Click the "enviar" (send) button.
4. The item will be added to the shopping cart.

## Installation
1. Ensure you have a Java web server, such as Apache Tomcat, installed and configured.
2. Deploy the application by placing the `EjemploCarritoCompras` directory in the server's webapps folder.
3. Start the server.

## Dependencies
This application has the following dependencies:
- Java Servlet API
- A Java web server (e.g., Apache Tomcat)

## How It Works
1. When you submit an item through the HTML form, it sends a POST request to the `CarritoServlet`.
2. The servlet retrieves the user's session and checks if a list of items (`articulos`) exists in the session.
3. If the list doesn't exist, it creates one.
4. The servlet then processes the new item and adds it to the list.
5. The list of items is displayed on the page, and users can continue to add more items to the shopping cart.

## Contributions
Contributions to this project are welcome. If you'd like to contribute, please follow these guidelines:
- Report issues or feature requests through the Issues tab.
- Submit pull requests with clear descriptions and explanations of the changes you've made.

## License
This project is licensed under the [MIT License](LICENSE).

## Acknowledgments
This project was created as an educational example and is inspired by various online tutorials and resources.

## Contact
For questions or further information, you can contact the project maintainer at [malgarinifacundo5@gmail.com](mailto:malgarinifacundo5@email.com).

Enjoy using the Carrito de Compras example! 

---
[Back to Home](http://localhost:8080/EjemploCarritoCompras/CarritoServlet)
