package exercise2;

import exercise1.NumberComparator;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        double number1;
        double number2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("por favor ingrese la primera variable numerica: ");
        number1=scanner.nextDouble();
        System.out.println("por favor ingrese la segunda variable numerica: ");
        number2=scanner.nextDouble();
        NumberComparator.compareTwoNumbers(number1,number2);


    }

}
