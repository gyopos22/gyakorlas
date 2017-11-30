/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gyöpös Marcell
 */
public class Katalogus {
    private List<Konyv> kata=new ArrayList<>();
    
    public List<String> getContactNames() {
        List<String> result = new ArrayList<>();
        for(Konyv contact : kata){
            result.add(contact.toString());
        }
        
        return result;
    }

    public Konyv getContactByName(String name) {
        for(Konyv contact : kata){
            if(contact.getSzerzo().equals(name)){
                return contact;
            }
        }
        return null;
    }
    
   
    
   /* Konyv getContactByName(kata name) {
        for(Konyv contact : contacts){
            if(contact.getName().equals(name)){
                return contact;
            }
        }
        return null;
    }*/

    public void deleteKonyv(Konyv konyv) {
        kata.remove(konyv);
    }

    public void addKonyv(Konyv newKonyv) {
        kata.add(newKonyv);
    }
}
