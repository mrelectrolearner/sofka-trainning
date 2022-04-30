package exercise9;

import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String aditionaltext;
        String text ="La sonrisa sera la mejor arma contra la tristeza";
        String modifiedtext= text.replace("a","e").concat(". El ultimo refugio ante las " +
                "tormentas de cada dia. ");
        System.out.println(modifiedtext);
        while(true){
            System.out.println("ingrese una frase que quiera adicionar: ");
            aditionaltext=scanner.next();
            System.out.println(modifiedtext.concat(" "+aditionaltext+" "));

        }

    }
}
