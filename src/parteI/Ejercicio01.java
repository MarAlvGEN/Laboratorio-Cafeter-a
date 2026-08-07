package parteI;

public class Ejercicio01 {
    public static void main(String[] args) {
        String nombreProducto = "Chocolate";
        double precioUnitario = 4500.50;
        int cantidadInventario = 25;
        boolean disponibleHoy = true;
        char codigoProducto = 'P';

        String mensaje = String.format(
                "Producto: %s | Precio: $%.2f | Inventario: %d unidades | Disponible hoy: %b | Código: %c",
                nombreProducto, precioUnitario, cantidadInventario, disponibleHoy, codigoProducto
        );

        System.out.println(mensaje);
    }
}

//1. ¿Por qué usas double para el precio y no int?
//2. ¿Qué pasaría si declaras el precio como int y le asignas 3.50?

// 1. Uso Doble en lugar de int porque es el número que voy a asignar tiene decimales.
// 2. Si declaro la variable de tipo int y le agrego decimales JAVA va a entrar en un error indicando 
// "java: incompatible types: possible lossy conversion from double to int"
