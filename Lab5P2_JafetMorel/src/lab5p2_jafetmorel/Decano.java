/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5p2_jafetmorel;

/**
 *
 * @author 24661
 */
public class Decano extends Persona{
    private String preg;
    private int ID, edad;
    private String titun, titma;

    public Decano() {
        super();
    }

    public Decano(String preg, int ID, int edad, String titun, String titma, String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
        this.preg = preg;
        this.ID = ID;
        this.edad = edad;
        this.titun = titun;
        this.titma = titma;
    }

    public String getPreg() {
        return preg;
    }

    public void setPreg(String preg) {
        this.preg = preg;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTitun() {
        return titun;
    }

    public void setTitun(String titun) {
        this.titun = titun;
    }

    public String getTitma() {
        return titma;
    }

    public void setTitma(String titma) {
        this.titma = titma;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
