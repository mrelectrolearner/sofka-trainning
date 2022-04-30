package exercise8;

import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        String dayOfWeek;
        Scanner scanner=new Scanner(System.in);
        System.out.println("por favor ingrese un dia de la semana: ");
        dayOfWeek= scanner.next();
        switch (dayOfWeek.toLowerCase()){
            case "sabado":
            case "domingo":
                System.out.println("No es un dia laboral");
                break;
            default:
                System.out.println("Es un dia laboral");


        }
        System.out.println("Gracias, hasta luego");
    }
}
