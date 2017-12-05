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
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author allth
 */
@WebServlet(name = "CinemaSelectAll", urlPatterns = {"/CinemaSelectAll"})
public class CinemaSelectAll extends HttpServlet {

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
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //Connection lcn = getConnexionMySQL(String asServeur, String asBD, String asPort, String asUT, String asMDP);
       Connection lcn = Connexion.getConnexionMySQL("172.26.55.55", "cinescope2014", "3306", "p", "b");
       //Connection lcn = Connexion.getConnexionMySQL("localhost", "cinescope2017", "3306", "root", "");

        JSONArray tableauJSON = new JSONArray();
        JSONObject CinemaJSON;
        try {
            PreparedStatement lpst = lcn.prepareStatement("CALL cinemaSelectAll");
            ResultSet lrs = lpst.executeQuery();
            while (lrs.next()) {
                CinemaJSON = new JSONObject();
                CinemaJSON.put("ID_CINEMA", lrs.getString(1));
                CinemaJSON.put("ID_VILLE", lrs.getString(2));
                CinemaJSON.put("ID_ARRONDISSMENT", lrs.getString(3));
                CinemaJSON.put("CODE_CINEMA", lrs.getString(4));
                CinemaJSON.put("NOM_CINEMA", lrs.getString(5));
                tableauJSON.put(CinemaJSON);
            }
        } catch (SQLException e) {
            CinemaJSON = new JSONObject();
            CinemaJSON.put("ID_CINEMA", "");
            CinemaJSON.put("ID_VILLE", "");
            CinemaJSON.put("ID_ARRONDISSMENT", "");
            CinemaJSON.put("CODE_CINEMA", "");
            CinemaJSON.put("NOM_CINEMA", e.getMessage());
            tableauJSON.put(CinemaJSON);
        }
        out.println(tableauJSON.toString());
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
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //Connection lcn = getConnexionMySQL(String asServeur, String asBD, String asPort, String asUT, String asMDP);
        Connection lcn = Connexion.getConnexionMySQL("172.26.55.55", "cinescope2014", "3306", "p", "b");
        //Connection lcn = Connexion.getConnexionMySQL("localhost", "cinescope2017", "3306", "root", "");

        JSONArray tableauJSON = new JSONArray();
        JSONObject CinemaJSON;
        try {
            PreparedStatement lpst = lcn.prepareStatement("CALL cinemaSelectAll");
            ResultSet lrs = lpst.executeQuery();
            while (lrs.next()) {
                CinemaJSON = new JSONObject();
                CinemaJSON.put("ID_CINEMA", lrs.getString(1));
                CinemaJSON.put("ID_VILLE", lrs.getString(2));
                CinemaJSON.put("ID_ARRONDISSMENT", lrs.getString(3));
                CinemaJSON.put("CODE_CINEMA", lrs.getString(4));
                CinemaJSON.put("NOM_CINEMA", lrs.getString(5));
                CinemaJSON.put("ADRESSE_CINEMA", lrs.getString(6));
                tableauJSON.put(CinemaJSON);
            }
        } catch (SQLException e) {
            CinemaJSON = new JSONObject();
            CinemaJSON.put("ID_CINEMA", "");
            CinemaJSON.put("ID_VILLE", "");
            CinemaJSON.put("ID_ARRONDISSMENT", "");
            CinemaJSON.put("CODE_CINEMA", "");
            CinemaJSON.put("NOM_CINEMA", e.getMessage());
            CinemaJSON.put("ADRESSE_CINEMA", "");
            tableauJSON.put(CinemaJSON);
        }
        out.println(tableauJSON.toString());
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
