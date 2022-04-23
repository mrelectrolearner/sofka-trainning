
import java.util.Scanner;
/**
 *Represent the interface with the user and its basics interaction.
 * @version 1.0.0 2022-04-22.
 * @author Luis Felipe Rivas -"luisfelorivas@gmail.com".
 * @since 1.0.0 2022-04-22.
 */

public class Main {
    /**
     * Execute the program: the user register the name, age and cellphone. and a massage welcoming him/her is displayed.
     *
     * @param args
     *
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     *
     * @since 1.0.0 2022-04-22.
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        User user=new User();

        System.out.println("Ingrese su nombre: ");
        user.setName(scanner.next()) ;

        System.out.println("Ingrese su celular: ");
        user.setCellphone(scanner.nextInt());

        System.out.println("Ingrese su edad: ");
        user.setAge(scanner.nextInt());

        System.out.println(user);
    }
}
