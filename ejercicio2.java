import java.util.Scanner;

class Persona {
    String sexo;    // 'M' o 'F'
    int edad;

    public Persona (String sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
    }
}

public class Main {

    public static Persona[] leerPersonas () {
        Scanner scanner = new Scanner(System.in);

        Persona[] personas = new Persona[50];

        for (int i = 0; i < 50; i++) {
            System.out.println("Introduce los datos de la persona " + (i + 1) + ": ");
            System.out.print("Sexo (M/F): ");
            String sexo = scanner.next();
            System.out.print("Edad: "); 
            int edad = scanner.nextInt();

            personas[i] = new Persona(sexo, edad);
        }

        return personas;
    }

    public static void main(String[] args) {
        int mayoresEdad = 0;
        int menoresEdad = 0;
        int mayoresMasc = 0;
        int menoresFem = 0;
        double porMayores;
        double porMujeres = 0;
        int mujeres = 0;

        Persona[] personas = leerPersonas();

        for (int i = 0; i < 50; i++ ) {
            Persona persona = personas[i];

            if (persona.edad >= 18) {
                mayoresEdad++;
                if (persona.sexo.equals("M")) {
                    mayoresMasc++;
                }
            }
            else {
                menoresEdad++;
                if (persona.sexo.equals("F")) {
                    menoresFem++;
                }
            }

            if (persona.sexo.equals("F")) {
                mujeres++;
            }
        }

        porMayores = ((double) mayoresEdad / personas.length) * 100;
        porMujeres = ((double) mujeres / personas.length) * 100;

        System.out.println("\nResultados:");
        System.out.println("a. Cantidad de personas mayores de edad (18 años o más): " + mayoresEdad);
        System.out.println("b. Cantidad de personas menores de edad: " + menoresEdad);
        System.out.println("c. Cantidad de personas masculinas mayores de edad: " + mayoresMasc);
        System.out.println("d. Cantidad de personas femeninas menores de edad: " + menoresFem);
        System.out.println("e. Porcentaje que representan las personas mayores de edad respecto al total de personas: " + porMayores + "%");
        System.out.println("f. Porcentaje que representan las mujeres respecto al total de personas: " + porMujeres + "%");
    }
}