/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Konyvtar;

import controller.KonyvController;
import model.Katalogus;
import view.konyvtarGUI;

/**
 *
 * @author Gyöpös Marcell
 */
public class KonyvMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Katalogus model = new Katalogus();
        konyvtarGUI gui = new konyvtarGUI();
        KonyvController controller = new KonyvController(gui, model);
        gui.setController(controller);
        gui.setVisible(true);
    }
    
}
