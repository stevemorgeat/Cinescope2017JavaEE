/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import daos.HitParadeDAO;
import connexion.Connexion;
import fr.c2017.entities.HitParade;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author formation
 */
public class HitParadeDAOTes {
   
    
    public static void main(String[] args) {
         Connection icn = Connexion.getConnexionMySQL("localhost", "cinescope2017", "3306", "root", "");
        HitParadeDAO dao = new HitParadeDAO(icn);
        
        List<HitParade> LHP;
        
        LHP =dao.selectAll();
        
        for (int i = 0; i < LHP.size(); i++) {
            System.out.println(LHP.get(i).toString());
        }
        
        
    }
}
