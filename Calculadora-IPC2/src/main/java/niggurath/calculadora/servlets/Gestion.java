package niggurath.calculadora.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import niggurath.calculadora.operaciones.Operacion;

public class Gestion extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");
        String link = "";
        double primerNumero = Double.parseDouble(request.getParameter("primerNumero"));
        System.out.println(primerNumero);
        double segundoNumero = Double.parseDouble(request.getParameter("segundoNumero"));

        if (accion.equals("suma")) {
            System.out.println("FUNCIONO");
            Operacion operacion = new Operacion();
            System.out.println("FUNCIONO");
            operacion.sumar(primerNumero, segundoNumero);
            System.out.println("FUNCIONO");
            link = "";

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);

    }
}
