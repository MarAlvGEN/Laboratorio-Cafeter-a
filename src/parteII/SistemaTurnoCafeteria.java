package parteII;

public class SistemaTurnoCafeteria {

    public static void main(String[] args) {

        String[] nombres = {"Café americano", "Capuchino", "Jugo naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        int[] stock = {5, 4, 8, 6, 10};

        char[] categorias = {'B', 'B', 'F', 'C', 'P'}; // B=Bebida caliente, F=Fría, C=Comida, P=Postre
        int[] pedidoProducto = {0, 2, 1, 4, 0, 3, 4, 4, 4, 4}; // índice del producto en cada pedido
        int[] pedidoCantidad = {2, 1, 3, 1, 1, 2, 15, 5, -1, 3}; // unidades por pedido

        int montoApertura = -5000;
        int intento = 1;

        double mayorValor = 0;
        int pedidoMayorValor = 0;

        boolean error = true;

        System.out.println("=== APERTURA DE TURNO ===");
        do {
            System.out.println("SIMULACRO #" + intento);
            if (montoApertura <= 0) {
                System.out.println("ERROR: El monto de apertura debe ser mayor a $0.\n");
                montoApertura = 50000;
            } else {
                error = false;
                System.out.println("INICIO DE CAJA EXITOSO | APERTURA: " + montoApertura + "\n");
                System.out.println("### PROCESANDO PEDIDOS ###");
                for (int i = 0; i < pedidoProducto.length; i++) {
                    int productoPedido = i + 1;
                    String productoNombre = nombres[pedidoProducto[i]];
                    double productoPrecio = precios[pedidoProducto[i]];
                    char productoCategoria = categorias[pedidoProducto[i]];
                    int productoStockInicial = stock[pedidoProducto[i]];
                    int productoCantidad = pedidoCantidad[i];
                    double subtotal = productoPrecio * productoCantidad;
                    double precioFinal = subtotal;
                    double descuentoMonto = 0;

                    int stockTotal = stock[pedidoProducto[i]] - productoCantidad;
                    boolean tieneDescueto = false;

                    System.out.println("################################");
                    System.out.printf("Pedido #%d\n", productoPedido);
                    if (subtotal <= 0) {
                        System.out.println("ERROR: SUBTOTAL DEBE SER SUPERIOR A 0\n");
                        continue;
                    } else if (stockTotal < 0) {
                        System.out.println("NO HAY STOCK PARA PROCESAR ESA VENTA - VERIFICAR PEDIDO\n");
                        continue;
                    } else {
                        if (subtotal > 12000) {
                            descuentoMonto = subtotal * 10 / 100;
                            tieneDescueto = true;
                            precioFinal -= descuentoMonto;
                        }

                        if (precioFinal > mayorValor) {
                            mayorValor = precioFinal;
                            pedidoMayorValor = productoPedido;
                        }

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
                        System.out.println("Cantidad venta: " + productoCantidad);

                        stock[pedidoProducto[i]] = stockTotal;
                        System.out.println("Stock ACTUAL: " + productoStockInicial);
                        System.out.println("Stock DESPUES de venta: " + stockTotal);

                        System.out.printf("Subtotal: %.2f$\n", subtotal);
                        if (tieneDescueto) {
                            System.out.println("FELICIDADES TIENES UN DESCUENTO DEL 10%");
                            System.out.printf("Se te descontará un total de: $%.2f!\n\n", descuentoMonto);
                        }
                        System.out.printf("PRECIO FINAL:  $%.2f \n\n", precioFinal);
                    }
                }
                System.out.printf(
                        "### PEDIDO MAYOR VALOR ###\n" +
                        "Número del pedido: %d \n" +
                        "Valor del pedido: %.2f", pedidoMayorValor, mayorValor);
            }
            intento++;
        } while (error);
    }
}