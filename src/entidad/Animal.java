package entidad;

import enums.Raza;

public class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarAnimal(){
        String tipoAnimal = this.getClass().getSimpleName();
        System.out.println(this.nombre + " es un " + tipoAnimal + " y tiene " + this.edad + " años");
    }

    public static Animal getAnimal(String nombre, int edad, Raza raza){
        return switch (raza){
            case GATO -> new Gato(nombre, edad);
            case PERRO -> new Perro(nombre, edad);
            default -> new Animal(nombre, edad);ew
        };
    }

    public String getNombre() {
        return nombre;
    }
}

class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void mostrarAnimal() {
        super.mostrarAnimal();
        System.out.printf(".. %s%n".repeat(3),
                this.getNombre() + " hace miau!",
                this.getNombre() + " araña las cortinas!",
                this.getNombre() + " toma agua de la llave!");
    }
}

class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void mostrarAnimal() {
        super.mostrarAnimal();
        System.out.printf(".. %s%n".repeat(3),
                this.getNombre() + " hace woof!",
                this.getNombre() + " hace caca en todas partes!",
                this.getNombre() + " es insoportable!");
    }
}
