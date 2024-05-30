/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Persona;

/**
 *
 * @author angel
 */
public class AddPersona extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8"); //Esto lo primero

        //Validacion de datos con try catch 
        try {
            ArrayList<Persona> personas = (ArrayList<Persona>) request.getSession().getAttribute("personas"); //Devuelve object hay que hacer cast
            if (personas == null) {
                personas = new ArrayList<>(); //Revisar si existe variable sesion, si es null no esta creada
            }
            String nombre = request.getParameter("nombre");
            String apellidos = request.getParameter("apellidos");
            int edad = Integer.parseInt(request.getParameter("edad")); //Casting 
            personas.add(new Persona(Persona.siguienteCodigo(personas), nombre, apellidos, edad));
            request.getSession().setAttribute("personas", personas);
            response.sendRedirect("index.jsp");

        } catch (Exception ex) {
            response.sendRedirect("error.jsp");
        }
    }
}
