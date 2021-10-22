package Services;

import connection.Connexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServiceTunisie {

    public static ArrayList total() {
        ArrayList cp = new ArrayList();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();

            ResultSet rs = st.executeQuery("select sum(total_cas),sum(total_recupere),sum(total_deces) from gouvernorat");
             Connexion con1 = new Connexion();
            Statement st1 = con1.getCn().createStatement();

            ResultSet rs1 = st1.executeQuery("SELECT sum(nbr_cas_hospitalise) FROM hopitale");
            rs1.next();
            while (rs.next()) {
                cp.add(rs.getInt(1));
                cp.add(rs.getInt(2));
                cp.add(rs.getInt(3));
                cp.add(rs1.getInt(1));
            }
            return cp;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cp;
    }

    public static int[] pargov() {
        int[] cp = new int[24];
        for (int i = 0; i <= 23; i++) {
            cp[i] = 0;
        }
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();

            ResultSet rs = st.executeQuery("select sum(total_cas),nomgv from gouvernorat GROUP BY nomgv");
            while (rs.next()) {
                switch (rs.getString(2)) {
                    case "Bizerte":
                        cp[0] = rs.getInt(1);
                        break;
                    case "Béja":
                        cp[1] = rs.getInt(1);
                        break;
                    case "Jendouba":
                        cp[2] = rs.getInt(1);
                        break;
                    case "Kef":
                        cp[3] = rs.getInt(1);
                        break;
                    case "Siliana":
                        cp[4] = rs.getInt(1);
                        break;
                    case "Kairouan":
                        cp[5] = rs.getInt(1);
                        break;
                    case "Sidi Bouzid":
                        cp[6] = rs.getInt(1);
                        break;
                    case "Kasserine":
                        cp[7] = rs.getInt(1);
                        break;
                    case "Gafsa":
                        cp[8] = rs.getInt(1);
                        break;
                    case "Tozeur":
                        cp[9] = rs.getInt(1);
                        break;
                    case "Kébili":
                        cp[10] = rs.getInt(1);
                        break;
                    case "Tataouine":
                        cp[11] = rs.getInt(1);
                        break;
                    case "Médenine":
                        cp[12] = rs.getInt(1);
                        break;
                    case "Ariana":
                        cp[13] = rs.getInt(1);
                        break;
                    case "Tunis":
                        cp[14] = rs.getInt(1);
                        break;
                    case "Manouba":
                        cp[15] = rs.getInt(1);
                        break;
                    case "Ben Arous":
                        cp[16] = rs.getInt(1);
                        break;
                    case "Nabeul":
                        cp[17] = rs.getInt(1);
                        break;
                    case "Zaghouan":
                        cp[18] = rs.getInt(1);
                        break;
                    case "Sousse":
                        cp[19] = rs.getInt(1);
                        break;
                    case "Monastir":
                        cp[20] = rs.getInt(1);
                        break;
                    case "Mahdia":
                        cp[21] = rs.getInt(1);
                        break;
                    case "Sfax":
                        cp[22] = rs.getInt(1);
                        break;
                    case "Gabès":
                        cp[23] = rs.getInt(1);
                        break;

                }

            }
            return cp;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cp;
    }

    public static int[] Sexe() {
        int[] cp = new int[2];
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();

            ResultSet rs = st.executeQuery("select count(sexe),sexe from personne GROUP BY sexe");
            while (rs.next()) {
                switch (rs.getString(2)) {
                    case "f":
                        cp[0] = rs.getInt(1);
                        break;

                    case "m":
                        cp[1] = rs.getInt(1);
                        break;
                }
            }
            return cp;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cp;
    }
    
    public static int[] Age() {
        int[] cp = new int[5];
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            for (int i = 0 ; i<5 ; i++){
              cp[i]=0;
            }
            ResultSet rs = st.executeQuery("SELECT age, count(*) from personne group by age");
            while (rs.next()) {
                if (rs.getInt(1)<=19) {
                        cp[0] += rs.getInt(2);
                }
                if (rs.getInt(1)>=20&&rs.getInt(1)<=29) {
                        cp[1] += rs.getInt(2);
                }
                if (rs.getInt(1)>=30&&rs.getInt(1)<=49) {
                        cp[2] += rs.getInt(2);
                }
                if (rs.getInt(1)>=50&&rs.getInt(1)<=69) {
                        cp[3] += rs.getInt(2);
                }
                if (rs.getInt(1)>=70) {
                        cp[4] += rs.getInt(2);
                }
            }
            return cp;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cp;
    }
    
    public static int[] Import() {
        int[] cp = new int[5];
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            for (int i = 0 ; i<5 ; i++){
              cp[i]=0;
            }
            ResultSet rs = st.executeQuery("SELECT cas_importes, count(*) from personne group by cas_importes");
            while (rs.next()) {
                if (rs.getInt(1)==0) {
                        cp[0] += rs.getInt(2);
                }
                if (rs.getInt(1)==1) {
                        cp[1] += rs.getInt(2);
                }
            }
            return cp;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cp;
    }
}
