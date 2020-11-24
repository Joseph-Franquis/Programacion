import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce los niños");
        a = teclado.nextInt();
        System.out.println("Introduce los niñas");
        b = teclado.nextInt();

        c = a+b;
        a = a/c*100;
        b = b/c*100;

        System.out.println("El porcentaje de niños es: " + a);
        System.out.println("El porcentaje de niñas es: " + b); 
    }
        
}        