package parteI;

public class Ejercicio03 {
    public static void main(String[] args) {
        char codigo = 'F';
        int iva = 0;

        switch (codigo) {
            case 'B':
                System.out.printf("Categoría: Bebida caliente | IVA: %d\n", iva);
                break;
            case 'F':
                iva = 5;
                System.out.printf("Categoría: Bebida fría | IVA: %d\n", iva);
                break;
            case 'C':
                iva = 8;
                System.out.printf("Categoría: Comida | IVA: %d\n", iva);
                break;
            case 'P':
                iva = 8;
                System.out.printf("Categoría: Postre | IVA: %d\n", iva);
                break;
            default:
                System.out.println("Categoría no reconocida | IVA: No aplica");
                break;
        }
    }
}

// 1. ¿En qué situación preferirías usar switch en lugar de una cadena de if-else?
// 2. ¿Hay algún caso en este ejercicio donde el switch no sería la mejor opción?

// 1. Preferiría usar if-else en casos donde la lógica es un poco más condicional.
// 2. La verdad considero que no, quizá lo usaría para algo más relacionado a la parte lógica dentro de los case del switch,
//    pero para casos con más de 4 opciones usaría directamente switch.