/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.entities;

/**
 *
 * @author formation
 */
public class Metro {

    private String nom_cinema;
    private String adresse_cinema;
    private String nom_arrondissement;
    private String reseau_cinema;
    private String code_arrondissement;
    private String nom_station_metro;

    public Metro() {
    }

    public Metro(String nom_cinema, String adresse_cinema, String nom_arrondissement, String reseau_cinema, String code_arrondissement, String nom_station_metro) {
        this.nom_cinema = nom_cinema;
        this.adresse_cinema = adresse_cinema;
        this.nom_arrondissement = nom_arrondissement;
        this.reseau_cinema = reseau_cinema;
        this.code_arrondissement = code_arrondissement;
        this.nom_station_metro = nom_station_metro;
    }

    public Metro(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNom_cinema() {
        return nom_cinema;
    }

    public void setNom_cinema(String nom_cinema) {
        this.nom_cinema = nom_cinema;
    }

    public String getAdresse_cinema() {
        return adresse_cinema;
    }

    public void setAdresse_cinema(String adresse_cinema) {
        this.adresse_cinema = adresse_cinema;
    }

    public String getNom_arrondissement() {
        return nom_arrondissement;
    }

    public void setNom_arrondissement(String nom_arrondissement) {
        this.nom_arrondissement = nom_arrondissement;
    }

    public String getReseau_cinema() {
        return reseau_cinema;
    }

    public void setReseau_cinema(String reseau_cinema) {
        this.reseau_cinema = reseau_cinema;
    }

    public String getCode_arrondissement() {
        return code_arrondissement;
    }

    public void setCode_arrondissement(String code_arrondissement) {
        this.code_arrondissement = code_arrondissement;
    }

    public String getNom_station_metro() {
        return nom_station_metro;
    }

    public void setNom_station_metro(String nom_station_metro) {
        this.nom_station_metro = nom_station_metro;
    }

    @Override
    public String toString() {
        return "SallesDeParis{" + "nom_cinema=" + nom_cinema + ", adresse_cinema=" + adresse_cinema + ", nom_arrondissement=" + nom_arrondissement + ", reseau_cinema=" + reseau_cinema + ", code_arrondissement=" + code_arrondissement + ", nom_station_metro=" + nom_station_metro + '}';
    }
    
}
