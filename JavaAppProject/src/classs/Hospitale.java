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
public class Hospitale {
   private int idH;
   private String nomH;
   private String adr;
   private String Cov;
  
   private int nbC_H;
   private int NbLitR;
   private String dateU;
public Hospitale()
{
}
    public Hospitale(int idH, String nomH, String adr, String Cov, int nbC_H, int NbLitR, String dateU) {
        this.idH = idH;
        this.nomH = nomH;
        this.adr = adr;
        this.Cov = Cov;
        
        this.nbC_H = nbC_H;
        this.NbLitR = NbLitR;
        this.dateU = dateU;
    }

    public int getIdH() {
        return idH;
    }

    public String getNomH() {
        return nomH;
    }

    public String getAdr() {
        return adr;
    }

    public String getCov() {
        return Cov;
    }

 

    public int getNbC_H() {
        return nbC_H;
    }

    public int getNbLitR() {
        return NbLitR;
    }

    public String getDateU() {
        return dateU;
    }

    public void setIdH(int idH) {
        this.idH = idH;
    }

    public void setNomH(String nomH) {
        this.nomH = nomH;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public void setCov(String Cov) {
        this.Cov = Cov;
    }

   

    public void setNbC_H(int nbC_H) {
        this.nbC_H = nbC_H;
    }

    public void setNbLitR(int NbLitR) {
        this.NbLitR = NbLitR;
    }

    public void setDateU(String dateU) {
        this.dateU = dateU;
    }

    @Override
    public String toString() {
        return "Hospitale{" + "idH=" + idH + ", nomH=" + nomH + ", adr=" + adr + ", Cov=" + Cov + ", nbC_H=" + nbC_H + ", NbLitR=" + NbLitR + ", dateU=" + dateU + '}';
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hospitale other = (Hospitale) obj;
        if (this.idH != other.idH) {
            return false;
        }
        if (!Objects.equals(this.nomH, other.nomH)) {
            return false;
        }
        if (!Objects.equals(this.adr, other.adr)) {
            return false;
        }
        if (!Objects.equals(this.Cov, other.Cov)) {
            return false;
        }
        
        if (this.nbC_H != other.nbC_H) {
            return false;
        }
        if (this.NbLitR != other.NbLitR) {
            return false;
        }
        if (!Objects.equals(this.dateU, other.dateU)) {
            return false;
        }
        return true;
    }
   
   
   
}
