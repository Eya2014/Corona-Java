/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs;

import java.util.Objects;

/**
 *
 * @author HP
 */
public class Demande {
    private int idD;
    private int idH;
    private String Type;
    private String titre;
    private String distinateur;
    private String textD;
    private float prix;
    private String resposable;
        public Demande ()
        {

        }
            public Demande(int idD, int idH, String Type, String titre, String distinateur, String textD, float prix, String resposable) {
        this.idD = idD;
        this.idH = idH;
        this.Type = Type;
        this.titre = titre;
        this.distinateur = distinateur;
        this.textD = textD;
        this.prix = prix;
        this.resposable = resposable;
        
    }

    public void setIdD(int idD) {
        this.idD = idD;
    }

    public void setIdH(int idH) {
        this.idH = idH;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDistinateur(String distinateur) {
        this.distinateur = distinateur;
    }

    public void setTextD(String textD) {
        this.textD = textD;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setResposable(String resposable) {
        this.resposable = resposable;
    }

    public int getIdD() {
        return idD;
    }

    public int getIdH() {
        return idH;
    }

    public String getType() {
        return Type;
    }

    public String getTitre() {
        return titre;
    }

    public String getDistinateur() {
        return distinateur;
    }

    public String getTextD() {
        return textD;
    }

    public float getPrix() {
        return prix;
    }

    public String getResposable() {
        return resposable;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Demande other = (Demande) obj;
        if (this.idD != other.idD) {
            return false;
        }
        if (this.idH != other.idH) {
            return false;
        }
        if (!Objects.equals(this.Type, other.Type)) {
            return false;
        }
        if (!Objects.equals(this.titre, other.titre)) {
            return false;
        }
        if (!Objects.equals(this.distinateur, other.distinateur)) {
            return false;
        }
        if (!Objects.equals(this.textD, other.textD)) {
            return false;
        }
        if (Float.floatToIntBits(this.prix) != Float.floatToIntBits(other.prix)) {
            return false;
        }
        if (!Objects.equals(this.resposable, other.resposable)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Demande{" + "idD=" + idD + ", idH=" + idH + ", Type=" + Type + ", titre=" + titre + ", distinateur=" + distinateur + ", textD=" + textD + ", prix=" + prix + ", resposable=" + resposable + '}';
    }
    
}
