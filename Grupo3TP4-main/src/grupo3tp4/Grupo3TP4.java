
package grupo3tp4;

import Entidades.Alumno;
import Entidades.Materia;


public class Grupo3TP4 {

   
    public static void main(String[] args) {
     
        Materia inglesI = new Materia(01,"ingles I primer año", 1);
        Materia laboratorioI = new Materia(02,"laboratorio I primer año", 1);
        Materia matematica = new Materia(03,"matematica primer año", 1);
        
        Alumno lopez = new Alumno (1001,"lopez","martin");
        Alumno martinez = new Alumno (1002,"marinez","brenda");
        
        lopez.agregarMateria(matematica);
        lopez.agregarMateria(inglesI);
        lopez.agregarMateria(laboratorioI);
        
        martinez.agregarMateria(matematica);
        martinez.agregarMateria(inglesI);
        martinez.agregarMateria(laboratorioI);
        martinez.agregarMateria(laboratorioI);
        
        System.out.println(lopez.getNombre()+" "+lopez.getApellido()+" esta incripto en "+lopez.contidadMaterias()+" materias");
        System.out.println(martinez.getNombre()+" "+martinez.getApellido()+" esta inscripta en "+martinez.contidadMaterias()+" materias");
        
    }
    
}
