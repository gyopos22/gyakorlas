/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Gyöpös Marcell
 */
public class Konyv {
    private String szerzo,cim,kiado;

    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getKiado() {
        return kiado;
    }

    public void setKiado(String kiado) {
        this.kiado = kiado;
    }

    @Override
    public String toString() {
        return "Szerzo:" + szerzo + ", cim:" + cim + ", kiado:" + kiado;
    }

   
    
    
    
    
}
