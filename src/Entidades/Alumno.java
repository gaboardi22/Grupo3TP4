
package Entidades;

import java.util.HashSet;

/**
 *
 * @author GRUPO 3
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    HashSet<Materia>materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        materias  = new HashSet<>();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(HashSet<Materia> materias) {
        this.materias = materias;
    }
    public void agregarMateria(Materia materia){
        if(!materia.getNombre().isEmpty()){
            materias.add(materia);
        }
    }
    public int contidadMaterias(){
       int cantidad = materias.size();
        return cantidad;
    }

    @Override
    public String toString() {
        return  apellido + " " +  nombre ;
    }
}
