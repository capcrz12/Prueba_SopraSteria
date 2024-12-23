import java.util.Scanner;

public class ParImpar {

    public static int leerNumero () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        scanner.close();

        return numero;
    }

    public static void main(String[] args) {
        int numero = leerNumero();

        // Comprobamos si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println("Números pares descendentes: ");

            for (int i = numero; i >= 0; i -= 2) {
                System.out.println(i);
            }
        }
        else {
            System.out.println("Números impares descendentes: ");

            for (int i = numero; i >= 1; i -= 2) {
                System.out.println(i);
            }
        }
    }
}