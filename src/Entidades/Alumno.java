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
    HashSet<Materia> materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        materias = new HashSet<>();
    }

    public void agregarMateria(Materia m) {
        materias.add(m);
        }
    public void cantidadDeMaterias(){
        System.out.println("Cantidad de materias");
        for (Materia materia : materias) {
            System.out.println(materia.toString());
        }
    }

    @Override
    public String toString() {
        return "Alumno{" + "legajo=" + legajo + ", apellido=" + apellido + ", nombre=" + nombre + ", materias=" + materias + '}';
    }

}
