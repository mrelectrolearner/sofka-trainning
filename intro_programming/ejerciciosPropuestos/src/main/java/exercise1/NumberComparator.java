package exercise1;

public class NumberComparator {

    public static void compareTwoNumbers(double number1, double number2){
        double variableUno=number1;
        double variableDos=number2;
        if(variableUno>variableDos){
            System.out.println("variable uno: " +variableUno+" es mayor que variable dos: "+ variableDos);
        } else if (variableUno<variableDos) {
            System.out.println("variable uno: " +variableUno+" es menor que variable dos: "+ variableDos);
        }else{
            System.out.println("variable uno: " +variableUno+" es igual que variable dos: "+ variableDos);
        }
    }
}
