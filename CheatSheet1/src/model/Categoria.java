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
public class Categoria {
    private String descripcion;
    private String nombre;
    
    private Categoria padre;
    private List<Categoria>subcategoriaList;
    private List<CheatSheet>cheatSheetList;

    public Categoria(String nombre) {
        this.nombre = nombre;
        cheatSheetList = new LinkedList<>();
    }

    
    public Categoria(String descripcion, String nombre) {
        this(nombre);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getPadre() {
        return padre;
    }

    public void setPadre(Categoria padre) {
        this.padre = padre;
    }

    public List<Categoria> getSubcategoriaList() {
        return subcategoriaList;
    }

    public void setSubcategoriaList(List<Categoria> subcategoriaList) {
        this.subcategoriaList = subcategoriaList;
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
