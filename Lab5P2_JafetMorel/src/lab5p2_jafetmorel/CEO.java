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
public class CEO extends Persona{
    private String preg;
    private int ID, exp, edad;

    public CEO() {
        super();
    }

    public CEO(String preg, int ID, int exp, int edad, String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
        this.preg = preg;
        this.ID = ID;
        this.exp = exp;
        this.edad = edad;
    }

    

    public String getPreg() {
        return preg;
    }

    public void setPreg(String titulo) {
        this.preg = titulo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
