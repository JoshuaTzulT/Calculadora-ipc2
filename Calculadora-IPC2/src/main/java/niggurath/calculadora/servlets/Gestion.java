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

        String link = "";
        double primerNumero = Double.parseDouble(request.getParameter("primerNumero"));
        System.out.println(primerNumero);
        double segundoNumero = Double.parseDouble(request.getParameter("segundoNumero"));

        if (request.getParameter("sumar") != null) {
            Operacion operacion = new Operacion();
            operacion.sumar(primerNumero, segundoNumero);
            link = "";
        }
        
        if (request.getParameter("multiplicar") != null) {
            Operacion operacion = new Operacion();
            operacion.multiplicar(primerNumero, segundoNumero);
            link = "";
        }
        if (request.getParameter("mayor") != null) {
            Operacion operacion = new Operacion();
            operacion.obtenerMayor(primerNumero, segundoNumero);
            link = "";
        }
        if (request.getParameter("potencia") != null) {
            Operacion operacion = new Operacion();
            operacion.obtenerPotencia(primerNumero, segundoNumero);
            link = "";
        }
        if (request.getParameter("binario") != null) {
            Operacion operacion = new Operacion();
            operacion.convertirABinario(primerNumero, segundoNumero);
            link = "";
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);

    }
}
