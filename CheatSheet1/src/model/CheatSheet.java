/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author Smart
 */
public class CheatSheet {
    private String descripcion;
    private Date fecha;
    private String nombre;
    private Integer numeroVotos;
    private Float promedioVotos;
    
    private Categoria categoria;
    private List<Tag>tagList;
    private List<Seccion>seccionList;
    private Autor autor;

    public CheatSheet(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.fecha = new Date();
        this.seccionList = new LinkedList<>();
        this.tagList = new LinkedList<>();
        
    }

    public CheatSheet(String descripcion, String nombre, Categoria categoria) {
        this(nombre, categoria);
        this.descripcion = descripcion;
    }

    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroVotos() {
        return numeroVotos;
    }

    public void setNumeroVotos(Integer numeroVotos) {
        this.numeroVotos = numeroVotos;
    }

    public Float getPromedioVotos() {
        return promedioVotos;
    }

    public void setPromedioVotos(Float promedioVotos) {
        this.promedioVotos = promedioVotos;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }

    public List<Seccion> getSeccionList() {
        return seccionList;
    }

    public void setSeccionList(List<Seccion> seccionList) {
        this.seccionList = seccionList;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
