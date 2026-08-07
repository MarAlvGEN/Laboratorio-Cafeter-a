package parteI;

public class Ejercicio07 {
    public static void main(String[] args) {
        int cantidadVendida = 1;
        double precioUnitario = 4500;
        double total = cantidadVendida * precioUnitario;
        boolean aplicaDescuento = (total > 20000);

        if (aplicaDescuento) {
            total -= (total * 0.10);
        }
        System.out.println("Total: " + total);
    }
}


// ¿Cuántos errores encontraste? Clasifica cada uno (sintaxis vs. lógica) y explica su impacto.

// Encontré 3 errores en total (2 de sintaxis y 1 de lógica):
// 1. Error de sintaxis - String/Int:
//    - Origin: int cantidadVendida = "5";
//    - Se intentaba asignar un String a una variable declarada como int. No se podia copilar.
//
//    - Local: Quitar las comillas para asignar el valor como 5 numerico.
//
// 2. Error de sintaxis — Falta ";":
//    - Origin: double total = cantidadVendida * precioUnitario
//    - La sentencia no finalizaba con punto y coma (;), lo cual es una regla obligatoria en Java.
//
//    - Local: Agregar el ; al final de la instrucción.
//
// 3. Error de lógica — Comparación, no asignación:
//    - Origin: if (aplicaDescuento = true)
//    - Se usó el operador de asignación (=) dentro de la condición del if en lugar de una comparación. Esto reasigna
//      la variable a true siempre, haciendo que el descuento se aplique incluso cuando el total es menor o igual a $20.000.
//
//    - Local: Comparar directamente con if (aplicaDescuento) o usar el operador de comparación de igualdad "==".