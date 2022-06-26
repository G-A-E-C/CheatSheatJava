/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Smart
 */
public class Seccion {
    private String descipcion;
    private String nombre;
    
    private CheatSheet cheatSheet;
    private Seccion padre;
    private List<Seccion>subSeccionList;
    private List<Cheat>cheatList;

    public Seccion(String nombre, CheatSheet cheatSheet) {
        this.nombre = nombre;
        this.cheatSheet = cheatSheet;
        this.cheatList= new LinkedList<>();
    }

    public Seccion(String descipcion, String nombre, CheatSheet cheatSheet) {
        this(nombre, cheatSheet);
        this.descipcion = descipcion;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CheatSheet getCheatSheet() {
        return cheatSheet;
    }

    public void setCheatSheet(CheatSheet cheatSheet) {
        this.cheatSheet = cheatSheet;
    }

    public Seccion getPadre() {
        return padre;
    }

    public void setPadre(Seccion padre) {
        this.padre = padre;
    }

    public List<Seccion> getSubSeccionList() {
        return subSeccionList;
    }

    public void setSubSeccionList(List<Seccion> subSeccionList) {
        this.subSeccionList = subSeccionList;
    }

    public List<Cheat> getCheatList() {
        return cheatList;
    }

    public void setCheatList(List<Cheat> cheatList) {
        this.cheatList = cheatList;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
