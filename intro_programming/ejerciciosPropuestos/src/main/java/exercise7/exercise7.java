package exercise7;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        double number=0;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("por favor ingrese un numero mayor o igual a 0 para salir del programa: ");
            number=scanner.nextDouble();

        }while(number<0);

    }
}
