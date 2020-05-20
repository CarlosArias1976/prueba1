/*
Implemente un algoritmo que le permita solicitar el ingreso por teclado el nombre de la Universidad{
el departamento, la carrera, el nombre de la materia, nombres completos del estudiante,
nivel,numero de cedula, pais, ciudad, canton, provincia, ID, Sexo
*/
package datosdelestudiante;

/**
 *
 * @author Carlos Arias
 */
import java.util.Scanner;
public class DatosDelEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);//new reserva espacio de memoria
        System.out.println("Ingresar nombre de la Universidad");
        String nombreUniversidad=objeto.nextLine();
        System.out.println("Ingresar Departamento");
        String Departamento=objeto.nextLine();
        System.out.println("Ingresar Carrera");
        String Carrera=objeto.nextLine();
        System.out.println("Ingresar nombre de la Materia");
        String nombreMateria=objeto.nextLine();
        System.out.println("Ingresar nombres completos del Estudiante");
        String nombresEstudiante=objeto.nextLine();
        System.out.println("Ingresar Nivel");
        String Nivel=objeto.nextLine();
        System.out.println("Ingresar Numero de Cedula");
        String NumeroCedula=objeto.nextLine();
        System.out.println("Ingresar Pais");
        String Pais=objeto.nextLine();
        System.out.println("Ingresar Provincia");
        String Provincia=objeto.nextLine();
        System.out.println("Ingresar Canton");
        String Canton=objeto.nextLine();
        System.out.println("Ingresar Sexo");
        String Sexo=objeto.nextLine();
        System.out.println("Ingresar ID");
        String ID=objeto.nextLine();
        System.out.println("Bienvenido a la Universidad: "+nombreUniversidad);
    }
    
}
