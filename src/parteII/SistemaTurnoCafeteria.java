package parteII;

public class SistemaTurnoCafeteria {

    public static void main(String[] args) {

        String[] nombres = {"Café americano", "Capuchino", "Jugo naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        char[] categorias = {'B', 'B', 'F', 'C', 'P'}; // B=Bebida caliente, F=Fría, C=Comida, P=Postre
        int[] pedidoProducto = {0, 2, 1, 4, 0, 3}; // índice del producto en cada pedido
        int[] pedidoCantidad = {2, 1, 3, 1, 1, 2}; // unidades por pedi

        // T1
        for (int i = 0; i < pedidoProducto.length + 1; i++) {

            int productoPedido = i + 1;
            String productoNombre = nombres[pedidoProducto[i]];
            double productoPrecio = precios[i];
            char productoCategoria = categorias[pedidoProducto[i]];
            int productoCantidad = pedidoCantidad[i];
            double subtotal = productoPrecio * productoCantidad;
            double precioFinal = subtotal;

            boolean tieneDescueto = false;

            if (subtotal > 12000) {
                tieneDescueto = true;
                precioFinal -= (subtotal * 10 ) / 100;
            }

            System.out.println("\n################################");
            System.out.println("Pedido #" + productoPedido );
            System.out.println("Producto: " + productoNombre);
            System.out.printf("Categoría: ");
            switch (productoCategoria) {
                case 'B':
                    System.out.println("Bebida caliente");
                    break;
                case 'F':
                    System.out.println("Bebida fría");
                    break;
                case 'C':
                    System.out.println("Comida");
                    break;
                case 'P':
                    System.out.println("Postre");
                    break;
                default:
                    System.out.println("Sin categoría");
                    break;
            }
            System.out.println("Precio u: " + productoPrecio);
            System.out.println("Cantidad: " + productoCantidad);
            System.out.println("Subtotal: " +  subtotal);
            System.out.println("Tiene descuento: " + tieneDescueto);
            System.out.println("Precio final: " + precioFinal);

//      Tarea 2 — Descuento por pedido
//  Si el subtotal de un pedido supera $12.000, aplica un descuento del 10%. Muestra si aplicó o no
//  el descuento y el valor final

        }
    }
}
