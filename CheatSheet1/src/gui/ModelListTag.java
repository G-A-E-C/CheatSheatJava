/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.util.LinkedList;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Tag;

/**
 *
 * @author Smart
 */
public class ModelListTag extends DefaultListModel<Tag>{
    public List<Tag> getElementos(){
        List<Tag>list = new LinkedList<>();
        for (int i = 0; i < getSize(); i++) {
            list.add(getElementAt(i));
        }
        return list; 
   }
}
