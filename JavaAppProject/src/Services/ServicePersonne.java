/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import classs.Pays;
import classs.Personne;
import connection.Connexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author HP
 */
public class ServicePersonne {
   Connexion con = new Connexion();
    public boolean create (Personne P) throws ParseException
    {  
         
        try{
             
             //(NOMPAYS,ID_PAYS,DATE_UPDATE,TOTAL_CAS,NVL_CAS,TOTAL_DECES,NVL_DECES,TOTAL_RECUPERE,NVL_RECUPERE,TOTAL_TEST,NVL_TEST,NVL_CRITIQUE,NOM_GOUVERNORAT)
             String req ="insert into PERSONNE "
                     + "values('"
                     +P.getCin()+"','"
                     +P.getCov()+"','"
                     +P.getDate()+"','"
                     +P.getSexe()+"',"
                     +P.getAge()+","
                     +P.getCas_imp()+","
                     +P.getIdP()+ ")"
                     ;
              System.err.println(req);
             Statement st= con.getCn().createStatement();
           if (st.executeUpdate(req) == 1) {
                return true;
                
            }
        } catch (SQLException ex) {
           
            System.out.println("Erreur SQL  "+ex);
        }
        return false ;
    } 
    
     public boolean delete( String cin) {
        try {
            String req = "delete from PERSONNE where CIN='" +cin+"'";
               System.err.println(req);
            Statement st = con.getCn().createStatement();
            if (st.executeUpdate(req) == 1) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Erreur SQL  "+ex);
        }
        return false;
    }
     public ArrayList<Personne> findByIdS(String S) {
         ArrayList<Personne> Sexe = new ArrayList<>();
        try {
            String req = "select * from Personne where SEXE='"+S+"'";
                System.err.println(req);
            Statement st = Connexion. getCn().createStatement();
           DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                Sexe.add( new Personne(
                		rs.getString("CIN"), 
                		rs.getString("GOV"),
                                rs.getInt("ID_GOV"),
                		(String)df.format(rs.getDate("DATE_UPDATE")),
                		rs.getString("SEXE"),
                                rs.getInt("AGE"),
                                rs.getInt("CAS_IMPORTES")
                               
                ));
                System.out.println(rs);
            }
           
        } catch (SQLException ex) {
            System.out.println("Erreur SQL"+ex);
        }
        return Sexe;
    }
      public Personne findByCIN(String cin) {
         Personne p = new Personne ();
        try {
            String req = "select * from Personne where CIN='" +cin+"'";
            System.err.println(req);
            Statement st = Connexion. getCn().createStatement();
           DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
               p= new Personne(
                		rs.getString("CIN"), 
                		rs.getString("GOV"),
                                rs.getInt("ID_GOV"),
                		(String)df.format(rs.getDate("DATE_UPDATE")),
                		rs.getString("SEXE"),
                                rs.getInt("AGE"),
                                rs.getInt("CAS_IMPORTES")
                               
                );
                System.out.println(rs);
            }
           
        } catch (SQLException ex) {
            System.out.println("Erreur SQL"+ex);
        }
        return p;
    }
      public ArrayList<Personne> findByIdAge(int age) {
         ArrayList<Personne> Sexe = new ArrayList<>();
        try {
            String req = "select * from Personne where AGE="+age+"";
              System.err.println(req);
            Statement st = Connexion. getCn().createStatement();
           DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                Sexe.add( new Personne(
                		rs.getString("CIN"), 
                		rs.getString("GOV"),
                                rs.getInt("ID_GOV"),
                		(String)df.format(rs.getDate("DATE_UPDATE")),
                		rs.getString("SEXE"),
                                rs.getInt("AGE"),
                                rs.getInt("CAS_IMPORTES")
                               
                ));
                  System.out.println(rs);
            }
           
        } catch (SQLException ex) {
            System.out.println("Erreur SQL"+ex);
        }
        return Sexe;
    }
      public ArrayList<Personne> findAll() {
         ArrayList<Personne> all = new ArrayList<>();
        try {
            String req = "select * from Personne";
            Statement st = Connexion. getCn().createStatement();
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                all.add( new Personne(
                		rs.getString("CIN"), 
                		rs.getString("GOV"),
                                rs.getInt("ID_GOV"),
                		(String)df.format(rs.getDate("DATE_UPDATE")),
                		rs.getString("SEXE"),
                                rs.getInt("AGE"),
                                rs.getInt("CAS_IMPORTES")
                               
                ));
                  System.out.println(rs);
            }
           
        } catch (SQLException ex) {
            System.out.println("Erreur SQL"+ex);
        }
        return all;
    }
}
