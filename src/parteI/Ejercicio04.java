package parteI;

public class Ejercicio04 {
    public static void main(String[] args) {
        int inventario = 50;
        final int consumo = 3;

        int i = 1;
        while (inventario >= 10) {
            inventario -= consumo;
            System.out.printf("Pedido #%d enviado\n", i);
            System.out.printf("Inventario restante: %d unidades\n\n", inventario);
            i++;
        }
        System.out.printf("CRITICO: inventario solo con %d unidades\nHacer Reestock antes de seguir enviando pedidos...\n", inventario);

    }
}

// 1. ¿Qué ocurre si la condición del while nunca se vuelve falsa?
// 2. ¿Cómo lo prevendrías en este caso?

// 1. Entraría en un bucle infinito en este caso.
// 2. Colocando las condicionales de forma correspondiente.