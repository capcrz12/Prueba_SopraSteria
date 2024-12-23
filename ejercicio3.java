import java.util.Scanner;

public class CalculoSalario {

    public static double leerTarifa () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la tarifa por hora: ");
        double tarifa = scanner.nextDouble();

        while (tarifa < 0) {
            System.out.println("Tarifa incorrecta. Introduce un número positivo.");
            tarifa = scanner.nextDouble();
        }

        scanner.close();

        return tarifa;
    }

    public static int leerHorasTrabajadas () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce las horas trabajadas: ");
        int horas = scanner.nextInt();

        while (horas < 0) {
            System.out.println("Horas incorrectas. Introduce un número positivo.");
            horas = scanner.nextInt();
        }

        scanner.close();

        return horas;
    }

    public static void main (String[] args) {
        int horas = leerHorasTrabajadas();
        double tarifa = leerTarifa();
        int salario = 0;

        if (horas <= 40) {
            salario = horas * tarifa;
        }
        else {
            double salarioBase = 40 * tarifa;
            int horasExtra = horas - 40;
            double sueldoExtra = horasExtra * tarifa * 1.5;
            salario = salarioBase + sueldoExtra;
        }
        
        System.out.println("El salario es: " + salario);
    }
}