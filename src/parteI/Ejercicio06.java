package parteI;

public class Ejercicio06 {
    public static void main(String[] args) {
        String[] productos = {"Café americano", "Capuchino", "Jugo de naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};

        double sumaPrecios = 0;

        System.out.println("MENU");

        for (int i = 0; i < productos.length; i++) {
            System.out.printf("%d - %s | $%.2f\n", (i + 1), productos[i], precios[i]);
            sumaPrecios += precios[i];
        }

        double promedio = sumaPrecios / productos.length;
        System.out.printf("Precio promedio del menú: $%.2f\n", promedio);
    }
}

// 1. ¿Por qué usas for aquí y no while?
// 2. ¿Qué tiene el for que lo hace más conveniente cuando conoces el número de elementos?

// 1. Porque en este caso sé cuantas ves se va a ejecutar un bucle, siento esta la longitud de productos.
// 2. En este caso siento que es más comodo. Toda la parte de la creación de variable, la condicional
//    y el incrementador está en una sola línea, por lo que mejora legibilidad y facilita la escritura de código.