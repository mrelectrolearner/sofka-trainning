package exercise4;

import java.util.Scanner;

public class exercise4 {
    static Double iva=0.21;
    public static void main(String[] args) {

        Double precio;
        Double valorTotalProducto;
        Scanner scanner=new Scanner(System.in);
        System.out.println("por favor ingrese el valor del producto: ");
        precio=Double.parseDouble(scanner.next());
        valorTotalProducto=precio+precio*iva;
        System.out.println("el valor del producto mas el iva es: "+valorTotalProducto);
    }
}
