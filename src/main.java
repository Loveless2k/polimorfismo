import entidad.Animal;
import enums.Raza;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println("Bienvenido al juego de polimorfismo. ¡Tienes que crear un animal, gato o perro!");

        try(Scanner sc = new Scanner(System.in)) {
            while(true) {

                System.out.println("""
                        Ingrese la raza del animal:
                        G -> Gato
                        P -> Perro
                        S -> Salir
                        """);

                String codigoRaza = sc.nextLine();

                if(codigoRaza.equalsIgnoreCase("S")) {
                    System.out.println("Gracias por jugar!");
                    break;
                }

                Raza raza = Raza.from(codigoRaza);

                if(raza == Raza.DESCONOCIDO) {
                    System.out.println("La raza ingresada no existe. Por favor, inténtelo nuevamente.");
                    continue;
                }

                System.out.println("Ingrese el nombre del animal: ");
                String nombre = sc.nextLine();

                System.out.println("Ingrese la edad del animal: ");
                int edad = sc.nextInt();
                sc.nextLine();

                Animal nuevoAnimal = Animal.getAnimal(nombre, edad, raza);
                nuevoAnimal.mostrarAnimal();
            }
        }
    }
}
