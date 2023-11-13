/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package svUsuarios;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Usuarios;
/**
 *
 * @author Alfre
 */
@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {
Controladora control=new Controladora();
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Usuarios> listUsuarios=new ArrayList<>();
        listUsuarios=control.traUsuarios();//obtiene los usu de la bd
        
        HttpSession miSession=request.getSession();
        miSession.setAttribute("listaUsuarios", listUsuarios);//asignamos la lista pasandola
        
        response.sendRedirect("mostrarUsuarios.jsp");//direccionamos
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String dni= request.getParameter("dni");
        String nombre= request.getParameter("nombre");
        String apellido= request.getParameter("apellido");
        String telefono= request.getParameter("telefono");
        
        Usuarios usu=new Usuarios();
        usu.setApellido(apellido);
        usu.setNombre(nombre);
        usu.setTelefono(telefono);
        usu.setDni(dni);
        
        control.crearUsuario(usu);
               
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
