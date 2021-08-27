/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5p2_jafetmorel;

import java.util.ArrayList;

/**
 *
 * @author 24661
 */
public class Docente extends Persona{
    private String preg, titma;
    private int alum;
    private String nomcl, desc;
    private ArrayList<Alumnos> alumnos= new ArrayList();

    public Docente() {
        super();
    }

    public Docente(String preg, String titma, int alum, String nomcl, String desc, String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
        this.preg = preg;
        this.titma = titma;
        this.alum = alum;
        this.nomcl = nomcl;
        this.desc = desc;
    }

    public String getPreg() {
        return preg;
    }

    public void setPreg(String preg) {
        this.preg = preg;
    }

    public String getTitma() {
        return titma;
    }

    public void setTitma(String titma) {
        this.titma = titma;
    }

    public int getAlum() {
        return alum;
    }

    public void setAlum(int alum) {
        this.alum = alum;
    }

    public String getNomcl() {
        return nomcl;
    }

    public void setNomcl(String nomcl) {
        this.nomcl = nomcl;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ArrayList<Alumnos> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumnos> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
