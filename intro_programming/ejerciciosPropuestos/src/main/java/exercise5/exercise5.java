package exercise5;

import java.util.ArrayList;

public class exercise5 {
    public static void main(String[] args) {
        Integer counter=0;
        ArrayList<Integer> oddNumberList=new ArrayList<>();
        ArrayList<Integer> evenNumberList=new ArrayList<>();
        while (counter<=100){
            if(counter%2==0){
                evenNumberList.add(counter);
                counter++;
                continue;
            }
            oddNumberList.add(counter);
            counter++;

        }
        System.out.println("lista de numeros impares del 1 al 100: "+ oddNumberList);
        System.out.println("lista de numeros pares del 1 al 100: "+ evenNumberList);
    }
}
