import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
        3. Escribe un programa que pida dos números e indique si el primero es mayor que el
segundo o no.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero1 = sc.nextInt();
        System.out.println("Introduce otro número: ");
        int numero2 = sc.nextInt();
        if (numero1 > numero2){
            System.out.println("El primer número es mayor que el segundo");
        } else {
            System.out.println("El segundo número es mayor que el primero");
        }

    }
}
