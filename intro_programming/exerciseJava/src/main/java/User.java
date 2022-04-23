/**
 *Represent the user.
 * @version 1.0.0 2022-04-22.
 * @author Luis Felipe Rivas -"luisfelorivas@gmail.com".
 * @since 1.0.0 2022-04-22.
 */
public class User {
    private String name;
    private Integer cellphone;
    private Integer age;

    public User() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCellphone(Integer cellphone) {
        this.cellphone = cellphone;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bienvenido señor " +this.name+", es un placer para nosotros " +
                "contar con una persona de"+this.age+ " años.\n" +
                "Próximamente nos comunicaremos con usted al numero "+this.cellphone+".\n" +
                "Feliz día";
    }
}
