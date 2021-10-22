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
public class Gouvernorat {
    public Gouvernorat()
    {
    }
     private String NomG ;

   
   
    private int idP;
    private String dateU;
    private int Tcas;
    private int Nvcas;
    private int Tdeces;
    private int Nvdeces;
    private int Trecup;
    private int Nvrecup;
    private int Ttest;
    private int Nvtest;
    private int Nvcritique;
     public Gouvernorat(String NomG, int idP, String dateU, int Tcas, int Nvcas, int Tdeces, int Nvdeces, int Trecup, int Nvrecup, int Ttest, int Nvtest, int Nvcritique) {
        this.NomG = NomG;
        this.idP = idP;
        this.dateU = dateU;
        this.Tcas = Tcas;
        this.Nvcas = Nvcas;
        this.Tdeces = Tdeces;
        this.Nvdeces = Nvdeces;
        this.Trecup = Trecup;
        this.Nvrecup = Nvrecup;
        this.Ttest = Ttest;
        this.Nvtest = Nvtest;
        this.Nvcritique = Nvcritique;
    }

    public String getNomG() {
        return NomG;
    }

    public int getIdP() {
        return idP;
    }

    public String getDateU() {
        return dateU;
    }

    public int getTcas() {
        return Tcas;
    }

    public int getNvcas() {
        return Nvcas;
    }

    public int getTdeces() {
        return Tdeces;
    }

    public int getNvdeces() {
        return Nvdeces;
    }

    public int getTrecup() {
        return Trecup;
    }

    public int getNvrecup() {
        return Nvrecup;
    }

    public int getTtest() {
        return Ttest;
    }

    public int getNvtest() {
        return Nvtest;
    }

    public int getNvcritique() {
        return Nvcritique;
    }

    public void setNomG(String NomG) {
        this.NomG = NomG;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public void setDateU(String dateU) {
        this.dateU = dateU;
    }

    public void setTcas(int Tcas) {
        this.Tcas = Tcas;
    }

    public void setNvcas(int Nvcas) {
        this.Nvcas = Nvcas;
    }

    public void setTdeces(int Tdeces) {
        this.Tdeces = Tdeces;
    }

    public void setNvdeces(int Nvdeces) {
        this.Nvdeces = Nvdeces;
    }

    public void setTrecup(int Trecup) {
        this.Trecup = Trecup;
    }

    public void setNvrecup(int Nvrecup) {
        this.Nvrecup = Nvrecup;
    }

    public void setTtest(int Ttest) {
        this.Ttest = Ttest;
    }

    public void setNvtest(int Nvtest) {
        this.Nvtest = Nvtest;
    }

    public void setNvcritique(int Nvcritique) {
        this.Nvcritique = Nvcritique;
    }

    @Override
    public String toString() {
        return "Gouvernorat{" + "NomG=" + NomG + ", idP=" + idP + ", dateU=" + dateU + ", Tcas=" + Tcas + ", Nvcas=" + Nvcas + ", Tdeces=" + Tdeces + ", Nvdeces=" + Nvdeces + ", Trecup=" + Trecup + ", Nvrecup=" + Nvrecup + ", Ttest=" + Ttest + ", Nvtest=" + Nvtest + ", Nvcritique=" + Nvcritique + '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Gouvernorat other = (Gouvernorat) obj;
        if (!Objects.equals(this.NomG, other.NomG)) {
            return false;
        }
        if (this.idP != other.idP) {
            return false;
        }
        if (!Objects.equals(this.dateU, other.dateU)) {
            return false;
        }
        if (this.Tcas != other.Tcas) {
            return false;
        }
        if (this.Nvcas != other.Nvcas) {
            return false;
        }
        if (this.Tdeces != other.Tdeces) {
            return false;
        }
        if (this.Nvdeces != other.Nvdeces) {
            return false;
        }
        if (this.Trecup != other.Trecup) {
            return false;
        }
        if (this.Nvrecup != other.Nvrecup) {
            return false;
        }
        if (this.Ttest != other.Ttest) {
            return false;
        }
        if (this.Nvtest != other.Nvtest) {
            return false;
        }
        if (this.Nvcritique != other.Nvcritique) {
            return false;
        }
        return true;
    }

}
