package exercise10;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        String text;
        String textModified;
        Scanner scanner=new Scanner(System.in);

        System.out.println("ingrese una frase: ");
        text=scanner.nextLine();
        textModified=text.replace(" ","" );
        System.out.println(textModified);

    }
}
