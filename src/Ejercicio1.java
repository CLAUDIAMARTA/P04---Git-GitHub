import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*
        1. Escribe un programa que pida un número e indique si es par o impar (un número es
par si al dividirlo entre 2 el resto es 0).
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        int division = numero/2;
        int resto = numero%division;
        if (resto == 0) {
            System.out.println("El número es par");
        }
        else {
            System.out.println("Es impar");
        }
    }
}
