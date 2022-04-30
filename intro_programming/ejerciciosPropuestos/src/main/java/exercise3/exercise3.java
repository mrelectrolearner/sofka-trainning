package exercise3;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Double radio;
        Double areaCirculo;
        Scanner scanner=new Scanner(System.in);
        System.out.println("por favor ingrese el radio del circulo: ");
        radio=Double.parseDouble(scanner.next());
        areaCirculo=Math.PI*Math.pow(radio,2);
        System.out.println("El area del círculo es: "+areaCirculo);

    }
}
