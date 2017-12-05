/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.controls;

import connexion.Connexion;
import daos.FilmDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author allth
 */
@WebServlet(name = "BoxOffice", urlPatterns = {"/BoxOffice"})
public class BoxOffice extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print(FilmDAO.getBO());

//    response.setContentType("text/html;charset=UTF-8");
//            /*
//        méthode habituelle
//        */
//        Connection lcn = Connexion.getConnexionMySQL("172.26.10.166", "Cinescope2017", "3306", "p", "b");
//       
//    
//    
//    String [] boxOffice = {"Vous êtes dans le Box Office!!!","Numero2", "numerp3"}; 
//    
//    request.setAttribute("message",boxOffice );
//    String lsURL = "BoxOffice.jsp";
//    ServletContext sc = getServletContext();
//    RequestDispatcher rd = sc.getRequestDispatcher("/jsp/" + lsURL);
//    rd.forward(request, response);
    } /// doGet

}
