package Services;

import connection.Connexion;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServiceContinent implements Serializable {
    
   
    public static int[] Total_cas_infecte() {
        int[] cp = new int[24];
        for (int i = 0; i <= 23; i++) {
            cp[i] = 0;
        }
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
                cp[5] = 0 ;
            ResultSet rs = st.executeQuery("Select sum(nvl_cas),continent from pays GROUP BY continent order by continent");
            while (rs.next()) {
                switch (rs.getString(2)) {
                    case "Afrique":
                        cp[0] = rs.getInt(1);
                        break;
                    case "Amerique nord":
                        cp[1] = rs.getInt(1);
                        break;
                    case "Amerique sud":
                        cp[2] = rs.getInt(1);
                        break;
                    case "Antarctique":
                        cp[3] = rs.getInt(1);
                        break;
                    case "Asie":
                        cp[4] = rs.getInt(1);
                        break;
                    case "Europe":
                        cp[5] = rs.getInt(1);
                        break;
                    case "Océanie":
                        cp[6] = rs.getInt(1);
                        break;
                }
               cp[7] += rs.getInt(1);
            }
            return cp;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cp;
    }
    
    public static int[] Total_cas_recup() {
        int[] cp = new int[24];
        for (int i = 0; i <= 23; i++) {
            cp[i] = 0;
        }
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
                cp[5] = 0 ;
            ResultSet rs = st.executeQuery("Select sum(nvl_recupere),continent from pays GROUP BY continent order by continent");
            while (rs.next()) {
                   switch (rs.getString(2)) {
                    case "Afrique":
                        cp[0] = rs.getInt(1);
                        break;
                    case "Amerique nord":
                        cp[1] = rs.getInt(1);
                        break;
                    case "Amerique sud":
                        cp[2] = rs.getInt(1);
                        break;
                    case "Antarctique":
                        cp[3] = rs.getInt(1);
                        break;
                    case "Asie":
                        cp[4] = rs.getInt(1);
                        break;
                    case "Europe":
                        cp[5] = rs.getInt(1);
                        break;
                    case "Océanie":
                        cp[6] = rs.getInt(1);
                        break;
                }
               cp[7] += rs.getInt(1);
            }
            return cp;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cp;
    }  
      
    public static int[] Total_cas_decedes() {
        int[] cp = new int[24];
        for (int i = 0; i <= 23; i++) {
            cp[i] = 0;
        }
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
                cp[5] = 0 ;
            ResultSet rs = st.executeQuery("Select sum(nvl_deces),continent from pays GROUP BY continent order by continent");
            while (rs.next()) {
                     switch (rs.getString(2)) {
                    case "Afrique":
                        cp[0] = rs.getInt(1);
                        break;
                    case "Amerique nord":
                        cp[1] = rs.getInt(1);
                        break;
                    case "Amerique sud":
                        cp[2] = rs.getInt(1);
                        break;
                    case "Antarctique":
                        cp[3] = rs.getInt(1);
                        break;
                    case "Asie":
                        cp[4] = rs.getInt(1);
                        break;
                    case "Europe":
                        cp[5] = rs.getInt(1);
                        break;
                    case "Océanie":
                        cp[6] = rs.getInt(1);
                        break;
                }
               cp[7] += rs.getInt(1);
            }
            return cp;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cp;
    } 
    
    public static int[] Total_cas_critiques() {
        int[] cp = new int[24];
        for (int i = 0; i <= 23; i++) {
            cp[i] = 0;
        }
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
                cp[5] = 0 ;
            ResultSet rs = st.executeQuery("Select sum(nvl_critique),continent from pays GROUP BY continent order by continent");
            while (rs.next()) {
                switch (rs.getString(2)) {
                    case "Afrique":
                        cp[0] = rs.getInt(1);
                        break;
                    case "Amerique nord":
                        cp[1] = rs.getInt(1);
                        break;
                    case "Amerique sud":
                        cp[2] = rs.getInt(1);
                        break;
                    case "Antarctique":
                        cp[3] = rs.getInt(1);
                        break;
                    case "Asie":
                        cp[4] = rs.getInt(1);
                        break;
                    case "Europe":
                        cp[5] = rs.getInt(1);
                        break;
                    case "Océanie":
                        cp[6] = rs.getInt(1);
                        break;
                }
               cp[7] += rs.getInt(1);
            }
            return cp;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cp;
    }  
    
    public static int[] Total_cas_actives() {
        int[] cp = new int[24];
        for (int i = 0; i <= 23; i++) {
            cp[i] = 0;
        }
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
                cp[5] = 0 ;
            ResultSet rs = st.executeQuery("Select sum(nvl_cas)-sum(nvl_deces)-sum(nvl_recupere),continent from pays GROUP BY continent order by continent");
            while (rs.next()) {
                    switch (rs.getString(2)) {
                    case "Afrique":
                        cp[0] = rs.getInt(1);
                        break;
                    case "Amerique nord":
                        cp[1] = rs.getInt(1);
                        break;
                    case "Amerique sud":
                        cp[2] = rs.getInt(1);
                        break;
                    case "Antarctique":
                        cp[3] = rs.getInt(1);
                        break;
                    case "Asie":
                        cp[4] = rs.getInt(1);
                        break;
                    case "Europe":
                        cp[5] = rs.getInt(1);
                        break;
                    case "Océanie":
                        cp[6] = rs.getInt(1);
                        break;
                }
               cp[7] += rs.getInt(1);
            }
            return cp;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cp;
    }  
    
    public static int[] Total_cas_doux() {
        int[] cp = new int[24];
        for (int i = 0; i <= 23; i++) {
            cp[i] = 0;
        }
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
                cp[5] = 0 ;
            ResultSet rs = st.executeQuery("Select sum(nvl_cas)-sum(nvl_deces)-sum(nvl_recupere)-sum(nvl_critique),continent from pays GROUP BY continent order by continent");
            while (rs.next()) {
                     switch (rs.getString(2)) {
                    case "Afrique":
                        cp[0] = rs.getInt(1);
                        break;
                    case "Amerique nord":
                        cp[1] = rs.getInt(1);
                        break;
                    case "Amerique sud":
                        cp[2] = rs.getInt(1);
                        break;
                    case "Antarctique":
                        cp[3] = rs.getInt(1);
                        break;
                    case "Asie":
                        cp[4] = rs.getInt(1);
                        break;
                    case "Europe":
                        cp[5] = rs.getInt(1);
                        break;
                    case "Océanie":
                        cp[6] = rs.getInt(1);
                        break;
                }
               cp[7] += rs.getInt(1);
            }
            return cp;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cp;
    }

}
