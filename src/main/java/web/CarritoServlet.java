package web;

import java.io.*;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        //Se crea objeto HttpSession..
        HttpSession sesion = request.getSession();
        //Se recupera lista de articulos nuevos(Si es que exiten)
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");
        //Se verifica si la lista de articulos existe.
        if (articulos == null) {

            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }

        //Se procesa el nuevo articulo.
        String articuloNuevo = request.getParameter("articulo");
        if (articuloNuevo != null && !articuloNuevo.trim().equals("")) {
            articulos.add(articuloNuevo);
        }

        try (PrintWriter out = response.getWriter()) {
            out.print("<h1> Lista de articulos</h1>");
            out.print("<br>");
            //iteramos todos los articulos
            for (String articulo : articulos) {
                out.print("<li>" + articulo + "</li>");
            }
            out.print("<br>");
            out.print("<a href='/EjemploCarritoCompras'>Regresar al Inicio</a>");
        }

    }
}
