/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import classs.Gouvernorat;
import classs.Pays;
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
 * @author Admin
 */
public class ServiceGouvernorat {
     Connexion con = new Connexion();
    public boolean createG (Gouvernorat P) throws ParseException
    {  
         
        try{
             String s=P.getDateU();
             System.out.println(s);
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
             Date date =df.parse(s);
            
             //(NOMPAYS,ID_PAYS,DATE_UPDATE,TOTAL_CAS,NVL_CAS,TOTAL_DECES,NVL_DECES,TOTAL_RECUPERE,NVL_RECUPERE,TOTAL_TEST,NVL_TEST,NVL_CRITIQUE,NOM_GOUVERNORAT)
             String req ="insert into GOUVERNORAT"
                     +" values('"
                     +P.getNomG()+"',GOUVERNORAT_SEQ.nextval,'"
                     +P.getDateU()+"',"
                     +P.getTcas()+","
                     +P.getNvcas()+","
                     +P.getTdeces()+","
                     +P.getNvdeces()+","
                     +P.getTrecup()+","
                     +P.getNvrecup()+","
                     +P.getTtest()+","
                     +P.getNvtest()+","
                     +P.getNvcritique()+")"
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
    
    public boolean updateG (Gouvernorat p)
    {
     try{
             
             //(NOMPAYS,ID_PAYS,DATE_UPDATE,TOTAL_CAS,NVL_CAS,TOTAL_DECES,NVL_DECES,TOTAL_RECUPERE,NVL_RECUPERE,TOTAL_TEST,NVL_TEST,NVL_CRITIQUE,NOM_GOUVERNORAT)
             String req ="update GOUVERNORAT set TOTAL_CAS="+p.getTcas()
                     +",NVL_CAS="+p.getNvcas()
                     +",TOTAL_DECES="+p.getTdeces()
                     +",NVL_DECES="+p.getNvdeces()
                     +",TOTAL_RECUPERE="+p.getTrecup()
                     + ",NVL_RECUPERE="+p.getNvrecup()
                     +",TOTAL_TEST="+p.getTtest()
                     +",NVL_TEST="+p.getNvtest()
                     +",NVL_CRITIQUE="+p.getNvcritique()
                     +"where ID_G= "+p.getIdP()+" And NOMGV='"+p.getNomG()+"' And DATE_UPDATE='"+p.getDateU()+"'";
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
public boolean deleteG(int id, String nom, String date) {
        try {
            String req = "delete from GOUVERNORAT where ID_G=" +id +" And NOMGV= '"+nom +"' And DATE_UPDATE = '"+date+"'";
             System.err.println(req);
            Statement st = Connexion. getCn().createStatement();
            if (st.executeUpdate(req) == 1) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Erreur SQL  "+ex);
        }
        return false;
    }
      public Gouvernorat findByIdG(int id, String nom, String date) {
        try {
            String req = "select * from Pays where ID_G=" +id +" And NOMGV= "+nom +" And DATE_UPDATE = "+date;

            Statement st = Connexion. getCn().createStatement();
           DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            ResultSet rs = st.executeQuery(req);
            if (rs.next()) {
                return new Gouvernorat(
                		rs.getString("NOMGV"), 
                		rs.getInt("ID_G"), 
                		(String)df.format(rs.getDate("DATE_UPDATE")),
                		rs.getInt("TOTAL_CAS"),
                                rs.getInt("NVL_CAS"),
                		rs.getInt("TOTAL_DECES"),
                                rs.getInt("NVL_DECES"),
                                rs.getInt("TOTAL_RECUPERE"),
                                rs.getInt("NVL_RECUPERE"),
                                rs.getInt("TOTAL_TEST"),
                                rs.getInt("NVL_TEST"),
                                rs.getInt("NVL_CRITIQUE")
                               
                );
            }
            else 
            	return null;
        } catch (SQLException ex) {
            System.out.println("Erreur SQL"+ex);
        }
        return null;
    }
          public ArrayList<Gouvernorat> findAllG() {
            ArrayList<Gouvernorat> Gou = new ArrayList<>();
            Gou.clear();
       
        
        try {
            String req = "select * from GOUVERNORAT";
            Statement st = Connexion. getCn().createStatement();
            ResultSet rs = st.executeQuery(req);
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            while (rs.next()) {
                Gou.add(new Gouvernorat(
                		rs.getString("NOMGV"), 
                		rs.getInt("ID_G"), 
                		(String)df.format(rs.getDate("DATE_UPDATE")),
                		rs.getInt("TOTAL_CAS"),
                                rs.getInt("NVL_CAS"),
                		rs.getInt("TOTAL_DECES"),
                                rs.getInt("NVL_DECES"),
                                rs.getInt("TOTAL_RECUPERE"),
                                rs.getInt("NVL_RECUPERE"),
                                rs.getInt("TOTAL_TEST"),
                                rs.getInt("NVL_TEST"),
                                rs.getInt("NVL_CRITIQUE")
                                
                		));
            }
            //df.format(rs.getDate
 
        } catch (SQLException ex) {
            System.out.println("Erreur SQL"+ex);
        }
        return Gou;
    }
          public Gouvernorat findAllDay(String nom) {
            Gouvernorat Day=null ;
       
        
        try {
            String req = "select * from GOUVERNORAT where( (NOMGV,DATE_UPDATE)in( select NOMGV,max(DATE_UPDATE) from GOUVERNORAT group by nomGV))and NOMGV='"+nom+"'";
            Statement st = Connexion. getCn().createStatement();
            ResultSet rs = st.executeQuery(req);
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            if (rs.next()) {
                Day=(new Gouvernorat(
                		rs.getString("NOMGV"), 
                		rs.getInt("ID_G"), 
                		(String)df.format(rs.getDate("DATE_UPDATE")),
                		rs.getInt("TOTAL_CAS"),
                                rs.getInt("NVL_CAS"),
                		rs.getInt("TOTAL_DECES"),
                                rs.getInt("NVL_DECES"),
                                rs.getInt("TOTAL_RECUPERE"),
                                rs.getInt("NVL_RECUPERE"),
                                rs.getInt("TOTAL_TEST"),
                                rs.getInt("NVL_TEST"),
                                rs.getInt("NVL_CRITIQUE")
                                
                		));
            }
            else{
            Day=new Gouvernorat(nom,0,"",0,0,0,0,0,0,0,0,0);
            }
            //df.format(rs.getDate
 
        } catch (SQLException ex) {
            System.out.println("Erreur SQL"+ex);
        }
        return Day;
    }
          public ArrayList<Gouvernorat> find_G() {
            ArrayList<Gouvernorat> Hop = new ArrayList<>();
       
        
        try {
            String req = "select * from GOUVERNORAT a where ( a.DATE_UPDATE = (select max( DATE_UPDATE) from GOUVERNORAT b where a.NOMGV =b.NOMGV ))";
            System.out.println(req);
            Statement st = Connexion. getCn().createStatement();
            ResultSet rs = st.executeQuery(req);
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            while (rs.next()) {
                Hop.add(new Gouvernorat(
                		rs.getString("NOMGV"), 
                		rs.getInt("ID_G"), 
                		(String)df.format(rs.getDate("DATE_UPDATE")),
                		rs.getInt("TOTAL_CAS"),
                                rs.getInt("NVL_CAS"),
                		rs.getInt("TOTAL_DECES"),
                                rs.getInt("NVL_DECES"),
                                rs.getInt("TOTAL_RECUPERE"),
                                rs.getInt("NVL_RECUPERE"),
                                rs.getInt("TOTAL_TEST"),
                                rs.getInt("NVL_TEST"),
                                rs.getInt("NVL_CRITIQUE")
                                
                                
                		));
            }
            //df.format(rs.getDate
 
        } catch (SQLException ex) {
            System.out.println("Erreur SQL"+ex);
        }
        return Hop;
    }
           public Gouvernorat find_Go(String date , String gov) {
            Gouvernorat gove =null;
       
        
        try {
            String req = "select * from GOUVERNORAT where DATE_UPDATE ='"+date+"' And NOMGV='"+gov+"'";
            System.out.println(req);
            Statement st = Connexion. getCn().createStatement();
            ResultSet rs = st.executeQuery(req);
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            while (rs.next()) {
                gove =new Gouvernorat(
                		rs.getString("NOMGV"), 
                		rs.getInt("ID_G"), 
                		(String)df.format(rs.getDate("DATE_UPDATE")),
                		rs.getInt("TOTAL_CAS"),
                                rs.getInt("NVL_CAS"),
                		rs.getInt("TOTAL_DECES"),
                                rs.getInt("NVL_DECES"),
                                rs.getInt("TOTAL_RECUPERE"),
                                rs.getInt("NVL_RECUPERE"),
                                rs.getInt("TOTAL_TEST"),
                                rs.getInt("NVL_TEST"),
                                rs.getInt("NVL_CRITIQUE")
                                
                                
                		);
            }
            //df.format(rs.getDate
 
        } catch (SQLException ex) {
            System.out.println("Erreur SQL"+ex);
        }
        return gove;
    }
}
