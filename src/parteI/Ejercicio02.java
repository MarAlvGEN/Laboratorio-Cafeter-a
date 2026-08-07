package parteI;

public class Ejercicio02 {
    public static void main(String[] args) {
        final int descuento = 15;
        final int producto1 = 42500;
        boolean tieneDescuento = false;
        double descuentoFinal = 0;
        double precioFinal = producto1;

        if (producto1 > 30000) {
            tieneDescuento = true;
            descuentoFinal = (double) (producto1 * descuento) / 100;
            precioFinal = producto1 - descuentoFinal;
        }

        System.out.printf("El producto tiene un valor de: $%d\n", producto1);
        System.out.printf("¿El usuario tiene derecho a descuento del %d%%?: %b.\n\n", descuento, tieneDescuento);
        System.out.printf("El valor del descuento es: $%.2f\n", descuentoFinal);
        System.out.printf("El precio final es: $%.2f\n", precioFinal);
    }
}

//Pregunta:
// 1. ¿Qué operador usaste para determinar si aplica el descuento?
// 2. ¿Qué tipo de dato devuelve ese operador?

//Respuesta:
// 1. Para determinar si aplica el descuento usé mayor que ">" para verificar si es mayoe a 30000.
// 2. El tipo de dato que devuelve esa condicional es un booleano, cuyos únicos valores posibles son true o false.