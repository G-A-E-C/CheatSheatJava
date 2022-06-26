/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui;

import model.Categoria;
import model.Cheat;
import model.CheatSheet;
import model.Seccion;

/**
 *
 * @author Smart
 */
public class Ejemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Categoria c= new Categoria("Programing");
        CheatSheet cs=new CheatSheet("HTML", c);
        c.getCheatSheetList().add(cs);
        Seccion s1=new Seccion("Seccion1", cs);
        Seccion s2=new Seccion("Seccion2", cs);
        Seccion s3=new Seccion("Seccion3", cs);
        cs.getSeccionList().add(s1);
        cs.getSeccionList().add(s2);
        cs.getSeccionList().add(s3);
        Cheat ch=new Cheat("a", s3);
        s3.getCheatList().add(ch);
        System.out.println(c);
    }
    
}
