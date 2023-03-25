import java.util.Locale;
import java.util.Scanner;

public class Aliquota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

                double salario = sc.nextDouble();
                    // De 1900.0 até 2800.0 o IR é de 7.5% e pode deduzir R$ 142
                if(salario >= 1900.0 && salario <= 2800.0) {
                    System.out.println("A sua aliquota é de 7,5%");
                    System.out.println("Voce pode deduzir ate R$ 142");
                    // De 2800.01 até 3751.0 o IR é de 15% e pode deduzir R$ 350
                } else if(salario >= 2800.01 && salario <= 3751.0) {
                    System.out.println("A sua aliquota é de 15%");
                    System.out.println("Voce pode deduzir ate R$ R$ 350");
                    // De 3751.01 até 4664.00 o IR é de 22.5% e pode deduzir R$ 636
                } else if(salario >= 3751.01 && salario <= 4664.0) {
                    System.out.println("A sua aliquota é de 22.5%");
                    System.out.println("Voce pode deduzir ate R$ 636");
                }
            }
        }


