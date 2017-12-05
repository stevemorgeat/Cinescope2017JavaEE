/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.controls;

import connexion.Connexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;

/**
 *
 * @author allth
 */
@WebServlet(name = "UtilisateurAuthentification", urlPatterns = {"/UtilisateurAuthentification"})
public class UtilisateurAuthentification extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        //Connection lcn = getConnexionMySQL(String asServeur, String asBD, String asPort, String asUT, String asMDP);
        Connection lcn = Connexion.getConnexionMySQL("172.26.55.55", "cinescope2014", "3306", "p", "b");

        JSONObject userJSON;
        try {
            PreparedStatement lpst = lcn.prepareStatement("SELECT * FROM utilisateur WHERE nom=? and mdp=?");
            lpst.setString(1, request.getParameter("nom"));
            lpst.setString(2, request.getParameter("mdp"));
            ResultSet lrs = lpst.executeQuery();
            if (lrs.next()) {
                userJSON = new JSONObject();
                userJSON.put("id", lrs.getString(1));
                userJSON.put("nom", lrs.getString(2));
                userJSON.put("mdp", lrs.getString(3));
                userJSON.put("email", lrs.getString(4));
                out.println(userJSON.toString());
            } else {
                out.println("KO");
            }

        } catch (SQLException e) {
            out.println(e.getMessage());
        }

        Connexion.seDeconnecter(lcn);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        //Connection lcn = getConnexionMySQL(String asServeur, String asBD, String asPort, String asUT, String asMDP);
        Connection lcn = Connexion.getConnexionMySQL("172.26.55.55", "cinescope2014", "3306", "p", "b");

        JSONObject userJSON;
        try {
            PreparedStatement lpst = lcn.prepareStatement("SELECT * FROM utilisateur WHERE nom=? and mdp=?");
            lpst.setString(1, request.getParameter("nom"));
            lpst.setString(2, request.getParameter("mdp"));
            ResultSet lrs = lpst.executeQuery();
            userJSON = new JSONObject();
            if (lrs.next()) {
                userJSON.put("id", lrs.getString(1));
                userJSON.put("nom", lrs.getString(2));
                userJSON.put("mdp", lrs.getString(3));
                userJSON.put("email", lrs.getString(4));
            } else {
                userJSON.put("id", "0");
                userJSON.put("nom", "inconnu");
                userJSON.put("mdp", "");
                userJSON.put("email", "");
            }
            out.println(userJSON.toString());
        } catch (SQLException e) {
            out.println(e.getMessage());
        }

        Connexion.seDeconnecter(lcn);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
