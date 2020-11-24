import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
                int a = 0;
                double b = 160.386;

                Scanner teclado = new Scanner(System.in);
                System.out.println("Introduce los Euros");
                a = teclado.nextInt();
                System.out.println("Las pesetas es igual a: " + a*b);
        }
}        