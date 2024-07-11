package enums;

public enum Raza {
    GATO, PERRO, DESCONOCIDO;

    public static Raza from(String input){
        if(input.isBlank() || input.length() != 1) return DESCONOCIDO;

        char codigo = input.toUpperCase().charAt(0);
        return switch (codigo){
            case 'G' -> GATO;
            case 'P' -> PERRO;
            default -> DESCONOCIDO;
        };
    }
}
