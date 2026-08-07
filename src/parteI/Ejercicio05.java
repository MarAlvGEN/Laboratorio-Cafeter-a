package parteI;

public class Ejercicio05 {
    public static void main(String[] args) {
        double montoApertura = -5000.0;

        int i = 1;
        do {
            if (i == 2) {
                montoApertura = 50000.0;
            }

            System.out.printf("Intento #%d: Monto ingresado = $%.2f%n", i, montoApertura);

            if (montoApertura <= 0) {
                System.out.println("ERROR: El monto de apertura debe ser mayor a $0. Intente de nuevo.\n");
            }

            i++;
        } while (montoApertura <= 0);

        System.out.printf("Caja abierta exitosamente con un monto de: $%.2f%n", montoApertura);
    }
}

// 1. ¿Por qué do-while es más apropiado que while aquí?
// 2. Describe con tus palabras la diferencia en el orden de ejecución.

// 1. Porque en este caso requiero que la condición se ejecute al menos una vez.
// 2. El "do while" se una cuando se va a ejecutar algo al menos una vez HASTA que una condicion se cumpla. Sin embargo,
//    en el while entra directamente a la comprobación, la cual no tendría porque ser verdadera en ese momento.