/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Smart
 */
public class Tag {
    private String nombre;
    
    private List<CheatSheet>cheatSheetList;

    public Tag(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<CheatSheet> getCheatSheetList() {
        return cheatSheetList;
    }

    public void setCheatSheetList(List<CheatSheet> cheatSheetList) {
        this.cheatSheetList = cheatSheetList;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
