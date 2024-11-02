import java.util.Scanner;

public class EjercicioEnglishSchool {

    public static void main(String[] args) {

        //Declaración de variables

        int edad;

        Scanner teclado = new Scanner (System.in);

        System.out.println("-----Bienvenido a English School-----");

        System.out.println("Ingrese la edad del alumno: ");

        edad = teclado.nextInt();

        //Prueba de switch

        switch (edad) {
            case 4:
            case 5:
            case 6:
                System.out.println("El horario del grupo kinder, es Lunes y Miercoles de 16hs a 17hs.");
                break;
            case 7:
            case 8:
                System.out.println("El horario del grupo 1st year, es Martes y Jueves de 16:30hs a 17:30hs");
                break;
            case 9:
            case 10:
                System.out.println("El horario del grupo 2nd year, es Martes y Jueves de 17:30hs a 19hs");
                break;
            case 11:
            case 12:
            case 13:
                System.out.println("El horario del grupo 3rd year, es Martes y Jueves de 17hs a 18:30hs");
                break;
            default:
                System.out.println("Ingresó una edad que no corresponde");
        }
    }
}