/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import javax.swing.DefaultListModel;
import model.Categoria;

/**
 *
 * @author Smart
 */
public class ModelListCategoria extends DefaultListModel<Categoria>{

    public ModelListCategoria() {
        addElement(new Categoria("Programing"));
        addElement(new Categoria("Software"));
        addElement(new Categoria("Gaming"));
        addElement(new Categoria("Varios"));
        addElement(new Categoria("..."));
    }
    
}
