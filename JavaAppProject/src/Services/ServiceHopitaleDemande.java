package Services;

import classs.Demande;
import classs.Hospitale;
import connection.Connexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ServiceHopitaleDemande {

    private static DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new String[]{"Id", "Hopitale", "Adresse", "Gouvernorat", "Cas hospitalisé", "lits disponibles", "Dernier mise a jour"});
    public static DefaultTableModel model1 = new DefaultTableModel(new Object[][]{}, new String[]{"Id", "Type", "Titre", "Destinataire", "Demande", "Prix estimé"});
  

    
    public int[] lits(String gv) {
 int hospi=0;
 int dispo=0;
 int[] cp = new  int[2];
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select sum(nbr_cas_hospitalise),sum(lits_dispo_rea) from hopitale where gov = '"+gv+"' ");
            while (rs.next()) {
                        hospi = rs.getInt(1);
                        dispo = rs.getInt(2);
                }
            cp[0] = hospi;
            cp[1] = dispo;
            return cp ;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
                    return cp ;

    }
    
    
    public DefaultTableModel mon_model_triée(String colone, String asc) {
        model.getDataVector().clear();

        String[] data = new String[7];
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select n.nom,adresse,gov,nbr_cas_hospitalise,lits_dispo_rea,date_update,n.id from hopitale n where date_update ="
                    + "(select max(date_update)from hopitale e where e.nom = n.nom) order by " + colone + " " + asc);
            while (rs.next()) {
                data[0] = String.valueOf(rs.getInt(7));
                data[1] = rs.getString(1);
                data[2] = rs.getString(2);
                data[3] = rs.getString(3);
                data[4] = String.valueOf(rs.getInt(4));
                data[5] = String.valueOf(rs.getInt(5));
                data[6] = String.valueOf(rs.getDate(6));

                model.addRow(data);
            }
            return model;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;

    }
    
    public DefaultTableModel demande(String nom) {
        model1.getDataVector().clear();

        String[] data = new String[6];
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select id,type,titre,distinataire,text_d,prix_estime from demande where responsable = '" + nom + "' order by id");
            while (rs.next()) {
                data[0] = String.valueOf(rs.getInt(1));
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                data[4] = rs.getString(5);
                data[5] = String.valueOf(rs.getInt(6));
                model1.addRow(data);
            }
            return model1;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model1;

    }
      Connexion con = new Connexion();
        public boolean create (Hospitale H) throws ParseException
    {  
         
        try{
             
             //(NOMPAYS,ID_PAYS,DATE_UPDATE,TOTAL_CAS,NVL_CAS,TOTAL_DECES,NVL_DECES,TOTAL_RECUPERE,NVL_RECUPERE,TOTAL_TEST,NVL_TEST,NVL_CRITIQUE,NOM_GOUVERNORAT)
             String req ="insert into HOPITALE "
                     + "values(HOPITALE_SEQ.nextval,'"
                     +H.getNomH()+"','"
                     +H.getAdr()+"','"
                     +H.getCov()+"',"
                     +H.getNbC_H()+","
                     +H.getNbLitR()+",'"
                     +H.getDateU()+
                     "')"
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
     public boolean delete( String nom) {
        try {
            String req = "delete from HOPITALE where NOM='" +nom+"'";
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
      public boolean updateP (Hospitale h)
    {
     try{
             
             //(NOMPAYS,ID_PAYS,DATE_UPDATE,TOTAL_CAS,NVL_CAS,TOTAL_DECES,NVL_DECES,TOTAL_RECUPERE,NVL_RECUPERE,TOTAL_TEST,NVL_TEST,NVL_CRITIQUE,NOM_GOUVERNORAT)
             String req ="update HOPITALE set NBR_CAS_HOSPITALISE="+h.getNbC_H()
                     + ",LITS_DISPO_REA="+h.getNbLitR()
                     +",DATE_UPDATE='"+h.getDateU()      
                     +"' where NOM='"+h.getNomH()+"'";
              System.out.println(req);
             Statement st= con.getCn().createStatement();
           if (st.executeUpdate(req) == 1) {
                return true;
                
            }
        } catch (SQLException ex) {
           
            System.out.println("Erreur SQL  "+ex);
        }
        return false ;
    }
          public ArrayList<Hospitale> findAllHopi() {
            ArrayList<Hospitale> Hop = new ArrayList<>();
       
        
        try {
            String req = "select * from HOPITALE";
            Statement st = Connexion. getCn().createStatement();
            ResultSet rs = st.executeQuery(req);
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            while (rs.next()) {
                Hop.add(new Hospitale(
                		rs.getInt("ID"),
                                rs.getString("NOM"),
                                rs.getString("ADRESSE"),
                                rs.getString("GOV"),
                                rs.getInt("NBR_CAS_HOSPITALISE"),
                                rs.getInt("LITS_DISPO_REA"),
                                (String)df.format(rs.getDate("DATE_UPDATE"))
                                
                		));
            }
            //df.format(rs.getDate
 
        } catch (SQLException ex) {
            System.out.println("Erreur SQL"+ex);
        }
        return Hop;
    }
           public ArrayList<Hospitale> findAllGOv(String Gov) {
            ArrayList<Hospitale> Hop = new ArrayList<>();
       
        
        try {
            String req = "select * from HOPITALE where GOV='"+Gov+"'";
            System.out.println(req);
            Statement st = Connexion. getCn().createStatement();
            ResultSet rs = st.executeQuery(req);
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            while (rs.next()) {
                Hop.add(new Hospitale(
                		rs.getInt("ID"),
                                rs.getString("NOM"),
                                rs.getString("ADRESSE"),
                                rs.getString("GOV"),
                                rs.getInt("NBR_CAS_HOSPITALISE"),
                                rs.getInt("LITS_DISPO_REA"),
                                (String)df.format(rs.getDate("DATE_UPDATE"))
                                
                		));
            }
            //df.format(rs.getDate
 
        } catch (SQLException ex) {
            System.out.println("Erreur SQL"+ex);
        }
        return Hop;
    }
            public ArrayList<Hospitale> find_H() {
            ArrayList<Hospitale> Hop = new ArrayList<>();
       
        
        try {
            String req = "select * from hopitale a where ( a.DATE_UPDATE = (select max( DATE_UPDATE) from hopitale b where a.NOM =b.NOM ))";
            System.out.println(req);
            Statement st = Connexion. getCn().createStatement();
            ResultSet rs = st.executeQuery(req);
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            while (rs.next()) {
                Hop.add(new Hospitale(
                		rs.getInt("ID"),
                                rs.getString("NOM"),
                                rs.getString("ADRESSE"),
                                rs.getString("GOV"),
                                rs.getInt("NBR_CAS_HOSPITALISE"),
                                rs.getInt("LITS_DISPO_REA"),
                                (String)df.format(rs.getDate("DATE_UPDATE"))
                                
                		));
            }
            //df.format(rs.getDate
 
        } catch (SQLException ex) {
            System.out.println("Erreur SQL"+ex);
        }
        return Hop;
    }
            
        public boolean create (Demande d) throws ParseException
    {  
         
        try{
             
             //(NOMPAYS,ID_PAYS,DATE_UPDATE,TOTAL_CAS,NVL_CAS,TOTAL_DECES,NVL_DECES,TOTAL_RECUPERE,NVL_RECUPERE,TOTAL_TEST,NVL_TEST,NVL_CRITIQUE,NOM_GOUVERNORAT)
             String req ="insert into DEMANDE "
                     + "values(DEMANDE_SEQ.nextval,"    
                     +d.getIdH()+",'"
                     +d.getType()+"','"
                     +d.getTitre()+"','"
                     +d.getDistinateur()+"','"
                     +d.getTextD()+"',"
                     +d.getPrix()+",'"
                     +d.getResposable()+
                     
                     "')"
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
     public boolean delete( String titre , int id) {
        try {
            String req = "delete from DEMANDE where TITRE='" +titre+"' AND ID_HOSPITAL="+id;
               System.err.println(req);
            Statement st = Connexion. getCn().createStatement();
            if (st.executeUpdate(req) == 1) {
                return true;
            }
            System.err.println(req);
        } catch (SQLException ex) {
            System.out.println("Erreur SQL  "+ex);
        }
        return false;
    }
    public boolean updateP (Demande d)
    {
     try{
             
             //(NOMPAYS,ID_PAYS,DATE_UPDATE,TOTAL_CAS,NVL_CAS,TOTAL_DECES,NVL_DECES,TOTAL_RECUPERE,NVL_RECUPERE,TOTAL_TEST,NVL_TEST,NVL_CRITIQUE,NOM_GOUVERNORAT)
             String req ="update DEMANDE set TEXT_D='"+d.getTextD()
                 +"',PRIX_ESTIME="+d.getPrix()
                 +" where TITRE='" +d.getTitre()+"' AND ID_HOSPITAL="+d.getIdH();
             System.err.println(req); 
             Statement st= Connexion. getCn().createStatement();
           if (st.executeUpdate(req) == 1) {
                return true;
                
            }
        } catch (SQLException ex) {
           
            System.out.println("Erreur SQL  "+ex);
        }
        return false ;
    }
          public ArrayList<Demande> findAll() {
            ArrayList<Demande> Hop = new ArrayList<>();
       
        
        try {
            String req = "select * from DEMANDE";
            Statement st = Connexion. getCn().createStatement();
            ResultSet rs = st.executeQuery(req);
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            while (rs.next()) {
                Hop.add(new Demande(
                		rs.getInt("ID"),
                                rs.getInt("ID_HOSPITAL"),
                                rs.getString("TYPE"),
                                rs.getString("TITRE"),
                                rs.getString("DISTINATAIRE"),
                                rs.getString("TEXT_D"),
                                rs.getFloat("PRIX_ESTIME"),
                                rs.getString("RESPONSABLE")
                                
                		));
            }
            //df.format(rs.getDate
 
        } catch (SQLException ex) {
            System.out.println("Erreur SQL"+ex);
        }
        return Hop;
    }
           public ArrayList<Demande> findAllH(String H) {
            ArrayList<Demande> Hop = new ArrayList<>();
       
        
        try {
            String req = "select * from DEMANDE where RESPONSABLE='"+H+"'";
                         System.err.println(req); 

            Statement st = Connexion. getCn().createStatement();
            ResultSet rs = st.executeQuery(req);
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            while (rs.next()) {
                Hop.add(new Demande(
                		rs.getInt("ID"),
                                rs.getInt("ID_HOSPITAL"),
                                rs.getString("TYPE"),
                                rs.getString("TITRE"),
                                rs.getString("DISTINATAIRE"),
                                rs.getString("TEXT_D"),
                                rs.getFloat("PRIX_ESTIME"),
                                rs.getString("RESPONSABLE")
                                
                		));
            }
            //df.format(rs.getDate
 
        } catch (SQLException ex) {
            System.out.println("Erreur SQL"+ex);
        }
        return Hop;
    }
}
