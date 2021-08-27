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
public class Alumnos extends Persona{
    private int cuenta, año, clases;
    private ArrayList<Prueba> pruebas = new ArrayList();

    public Alumnos() {
        super();
    }

    public Alumnos(int cuenta, int año, int clases, String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
        this.cuenta = cuenta;
        this.año = año;
        this.clases = clases;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getClases() {
        return clases;
    }

    public void setClases(int clases) {
        this.clases = clases;
    }

    public ArrayList<Prueba> getPruebas() {
        return pruebas;
    }

    public void setPruebas(ArrayList<Prueba> pruebas) {
        this.pruebas = pruebas;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
