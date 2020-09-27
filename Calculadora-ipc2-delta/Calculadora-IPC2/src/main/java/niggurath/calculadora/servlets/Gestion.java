package niggurath.calculadora.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import niggurath.calculadora.operaciones.Operacion;

public class Gestion extends HttpServlet {

    HttpSession session;
    private double primerNumero;
    private double segundoNumero;
    private double res;
    private String cadena;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        primerNumero = Double.parseDouble(request.getParameter("primerNumero"));
        System.out.println(primerNumero);
        segundoNumero = Double.parseDouble(request.getParameter("segundoNumero"));

        if (request.getParameter("sumar") != null) {
            Operacion operacion = new Operacion();
            session = request.getSession();
            res = operacion.sumar(primerNumero, segundoNumero);
            session.setAttribute("ACTUAL", res);
            request.getRequestDispatcher("/WEB-INF/vistas/resultado_suma.jsp").forward(request, response);

        }

        if (request.getParameter("multiplicar") != null) {
            Operacion operacion = new Operacion();
            operacion.multiplicar(primerNumero, segundoNumero);
            session = request.getSession();
            res = operacion.multiplicar(primerNumero, segundoNumero);
            session.setAttribute("ACTUAL", res);
            request.getRequestDispatcher("/WEB-INF/vistas/resultado_multiplicacion.jsp").forward(request, response);

        }
        if (request.getParameter("mayor") != null) {
            Operacion operacion = new Operacion();
            operacion.obtenerMayor(primerNumero, segundoNumero);
            session = request.getSession();
            res = operacion.obtenerMayor(primerNumero, segundoNumero);
            session.setAttribute("ACTUAL", res);
            request.getRequestDispatcher("/WEB-INF/vistas/resultado_mayor.jsp").forward(request, response);
        }
        if (request.getParameter("potencia") != null) {
            Operacion operacion = new Operacion();
            operacion.obtenerPotencia(primerNumero, segundoNumero);
            session = request.getSession();
            res = operacion.obtenerPotencia(primerNumero, segundoNumero);
            session.setAttribute("ACTUAL", res);
            request.getRequestDispatcher("/WEB-INF/vistas/resultado_potencia.jsp").forward(request, response);
        }
        if (request.getParameter("binario") != null) {
            Operacion operacion = new Operacion();
            operacion.convertirABinario(primerNumero, segundoNumero);
            session = request.getSession();
            cadena = operacion.convertirABinario(primerNumero, segundoNumero);
            session.setAttribute("ACTUAL", cadena);
            request.getRequestDispatcher("/WEB-INF/vistas/resultado_binario.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);

    }

}
