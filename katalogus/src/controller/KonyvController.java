/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.Katalogus;
import model.Konyv;
import view.AddEditWindow;
import view.konyvtarGUI;

/**
 *
 * @author Gyöpös Marcell
 */
public class KonyvController {
    private konyvtarGUI gui;
    private Katalogus konyvkata;

    public KonyvController(konyvtarGUI gui, Katalogus konyvkata) {
        this.gui = gui;
        this.konyvkata = konyvkata;
    }
    
    public void addKonyv(){
    Konyv newKonyv = new Konyv();
        konyvkata.addKonyv(newKonyv);
        new AddEditWindow(gui,"Add Contact",newKonyv).setVisible(true);
       gui.updateList(konyvkata.getContactNames());
    }
    public void deleteKonyv(String name){
    Konyv konyv = konyvkata.getContactByName(name);
        int confirm = JOptionPane.showConfirmDialog(gui, "Do you wish to delete "+name+"?", "Delte Contact", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            konyvkata.deleteKonyv(konyv);
        }
        gui.updateList(konyvkata.getContactNames());
    }
    public void editKonyv(String name){
    Konyv konyv = konyvkata.getContactByName(name);
    new AddEditWindow(gui,"Add Contact",konyv).setVisible(true);
        gui.updateList(konyvkata.getContactNames());}
    public void searchKonyv(String nev){}
}
