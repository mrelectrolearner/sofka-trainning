package excercise6;

import java.util.ArrayList;

public class exercise6 {
    public static void main(String[] args) {

        ArrayList<Integer> oddNumberList=new ArrayList<>();
        ArrayList<Integer> evenNumberList=new ArrayList<>();
        for(int counter=0; counter<=100;counter++){
            if(counter%2==0){
                evenNumberList.add(counter);
                continue;
            }
            oddNumberList.add(counter);

        }
        System.out.println("lista de numeros impares del 1 al 100: "+ oddNumberList);
        System.out.println("lista de numeros pares del 1 al 100: "+ evenNumberList);
    }

}
