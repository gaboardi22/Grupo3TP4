/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Ezequiel
 */
public class Colegio {

    public static void main(String[] args) {
        Materia inglesI = new Materia(1, "Ingles I", 1);
        Materia matematicas = new Materia(2, "Matemáticas", 1);
        Materia laboratorioI = new Materia(3, "Laboratorio", 1);
        Alumno alumno1 = new Alumno(1001,"López","Martin");
        Alumno alumno2 = new Alumno(1002,"Martínez","Brenda");
        alumno1.agregarMateria(inglesI);
        alumno1.agregarMateria(matematicas);
        alumno1.agregarMateria(laboratorioI);
        alumno2.agregarMateria(inglesI);
        alumno2.agregarMateria(matematicas);
        alumno2.agregarMateria(laboratorioI);
        alumno2.agregarMateria(laboratorioI);
        alumno1.cantidadDeMaterias();
        alumno2.cantidadDeMaterias();
                }
}
