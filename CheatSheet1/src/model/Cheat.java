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
public class Cheat {
    private String comando;
    private String descripcion;
    private String parametro;
    
    private Seccion seccion;
    private List<Ejemplo>ejemploList;

    public Cheat(String comando, Seccion seccion) {
        this.comando = comando;
        this.seccion = seccion;
    }

    public Cheat(String comando, String descripcion, Seccion seccion) {
        this(comando, seccion);
        this.descripcion = descripcion;
    }

    public Cheat(String comando, String descripcion, String parametro, Seccion seccion) {
        this(comando, descripcion, seccion);
        this.parametro = parametro;
    }

    
    

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getParametro() {
        return parametro;
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public List<Ejemplo> getEjemploList() {
        return ejemploList;
    }

    public void setEjemploList(List<Ejemplo> ejemploList) {
        this.ejemploList = ejemploList;
    }

    @Override
    public String toString() {
        return "Cheat{" + "comando=" + comando + '}';
    }
    
    
    
}
