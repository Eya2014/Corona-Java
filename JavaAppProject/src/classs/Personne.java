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
public class Personne {
    private String cin;
    private String cov;
    private int idP;
    private String date;
    private String sexe ;
    private int age;
    private int cas_imp;
    public Personne()
    {
    }
    public Personne(String cin, String cov, int idP, String date, String sexe, int age, int cas_imp) {
        this.cin = cin;
        this.cov = cov;
        this.idP = idP;
        this.date = date;
        this.sexe = sexe;
        this.age = age;
        this.cas_imp = cas_imp;
    }

    public String getCin() {
        return cin;
    }

    public String getCov() {
        return cov;
    }

    public int getIdP() {
        return idP;
    }

    public String getDate() {
        return date;
    }

    public String getSexe() {
        return sexe;
    }

    public int getAge() {
        return age;
    }

    public int getCas_imp() {
        return cas_imp;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setCov(String cov) {
        this.cov = cov;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCas_imp(int cas_imp) {
        this.cas_imp = cas_imp;
    }

    @Override
    public String toString() {
        return "Personne{" + "cin=" + cin + ", cov=" + cov + ", idP=" + idP + ", date=" + date + ", sexe=" + sexe + ", age=" + age + ", cas_imp=" + cas_imp + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Personne other = (Personne) obj;
        if (!Objects.equals(this.cin, other.cin)) {
            return false;
        }
        return true;
    }
    
}
