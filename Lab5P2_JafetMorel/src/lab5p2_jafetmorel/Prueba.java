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
public class Prueba {
    private String equipo, coop, participacion, nota;
    private int general;
    private Docente docente;

    public Prueba() {
    }

    public Prueba(String equipo, String coop, String participacion, String nota, int general, Docente docente) {
        this.equipo = equipo;
        this.coop = coop;
        this.participacion = participacion;
        this.nota = nota;
        this.general = general;
        this.docente = docente;
    }

    

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getCoop() {
        return coop;
    }

    public void setCoop(String coop) {
        this.coop = coop;
    }

    public String getParticipacion() {
        return participacion;
    }

    public void setParticipacion(String participacion) {
        this.participacion = participacion;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public int getGeneral() {
        return general;
    }

    public void setGeneral(int general) {
        this.general = general;
    }

    public Docente getDocente() {
        return docente;
    }

    @Override
    public String toString() {
        return "Prueba{" + "equipo=" + equipo + ", coop=" + coop + ", participacion=" + participacion + ", nota=" + nota + ", general=" + general + '}';
    }
    
}
