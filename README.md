# Laboratorio — Sistema de Cafetería (Java)

<div align="center">
  <img src="https://github.com/user-attachments/assets/9677be1e-d0bb-499b-840d-400809b55d17" alt="Banner Cafetería" width="100%" />
  
  <br/>

  ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
  ![IDE](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
  ![Status](https://img.shields.io/badge/Estado-Completado-success?style=for-the-badge)
</div>

---

## Descripción del Proyecto

Este repositorio contiene la solución completa al **Taller: Sistema de Cafetería**, desarrollado como parte del programa de formación con **Generation Colombia**. 

El taller abarca desde fundamentos de sintaxis en Java hasta la construcción de un flujo simulado para la gestión de turnos, pedidos, control de inventario y cierre de caja en una cafetería.

---

## Parte 1: Ejercicios Conceptuales y Respuestas

### 1. Variables y Tipos de Datos
* **Preguntas:**
  * **¿Por qué usas `double` para el precio y no `int`?**  
    *R: Uso `double` porque el precio maneja valores con decimales.*
  * **¿Qué pasaría si declaras el precio como `int` y le asignas `3.50`?**  
    *R: Java arrojará un error de compilación (`java: incompatible types: possible lossy conversion from double to int`), impidiendo la asignación

[🌐 Checa el código](https://github.com/MarAlvGEN/Laboratorio-Cafeter-a/blob/main/src/parteI/Ejercicio01.java)

---

### 2. Operadores
* **Preguntas:**
  * **¿Qué operador usaste para determinar si aplica el descuento?**  
    *R: El operador mayor que (`>`).*
  * **¿Qué tipo de dato devuelve ese operador?**  
    *R: Devuelve un tipo de dato booleano (`boolean`), cuyos valores son únicamente `true` o `false`.*

[🌐 Checa el código](https://github.com/MarAlvGEN/Laboratorio-Cafeter-a/blob/main/src/parteI/Ejercicio02.java)

---

### 3. `switch`
* **Preguntas:**
  * **¿En qué situación preferirías usar `switch` en lugar de una cadena de `if-else`?**  
    *R: Preferiría usar `if-else` en casos donde la lógica requiere evaluar condiciones más complejas.*
  * **¿Hay algún caso en este ejercicio donde el `switch` no sería la mejor opción?**  
    *R: Para este caso con opciones fijas de categoría, `switch` funciona adecuadamente.*

[🌐 Checa el código](https://github.com/MarAlvGEN/Laboratorio-Cafeter-a/blob/main/src/parteI/Ejercicio03.java)

---

### 4. `while`
* **Preguntas:**
  * **¿Qué ocurre si la condición del `while` nunca se vuelve falsa?**  
    *R: El programa entra en un bucle infinito.*
  * **¿Cómo lo prevendrías en este caso?**  
    *R: Definiendo y actualizando correctamente las condiciones dentro del ciclo.*

[🌐 Checa el código](https://github.com/MarAlvGEN/Laboratorio-Cafeter-a/blob/main/src/parteI/Ejercicio04.java)

---

### 5. `do-while`
* **Preguntas:**
  * **¿Por qué `do-while` es más apropiado que `while` en este caso?**  
    *R: Porque se requiere que la lógica dentro del bloque se ejecute al menos una vez.*
  * **Diferencia en el orden de ejecución:**  
    *R: El `do-while` ejecuta la acción al menos una vez antes de verificar la condición, mientras que el `while` evalúa la condición desde el inicio.*

[🌐 Checa el código](https://github.com/MarAlvGEN/Laboratorio-Cafeter-a/blob/main/src/parteI/Ejercicio05.java)

---

### 6. `for` y Arrays
* **Preguntas:**
  * **¿Por qué usas `for` aquí y no `while`?**  
    *R: Porque se conoce de antemano la cantidad exacta de iteraciones, definida por la longitud del arreglo.*
  * **¿Qué lo hace más conveniente?**  
    *R: Permite declarar la variable de control, la condición y el incremento en una sola línea, lo que mejora la legibilidad.*

[🌐 Checa el código](https://github.com/MarAlvGEN/Laboratorio-Cafeter-a/blob/main/src/parteI/Ejercicio06.java)

---

### 7. Debugging
* **Errores identificados y solucionados:**
  1. **Error de sintaxis:** Intento de asignar un `String` `"5"` a una variable `int`.  
     *Solución: Quitar las comillas para asignar el valor numérico.*
  2. **Error de sintaxis:** Ausencia del punto y coma `;` al finalizar una instrucción.  
     *Solución: Agregar el `;` correspondiente.*
  3. **Error de lógica:** Uso del operador de asignación (`=`) en lugar del operador de comparación dentro del `if`.  
     *Solución: Usar la variable booleana directamente o emplear el operador `==`.*

[🌐 Checa el código](https://github.com/MarAlvGEN/Laboratorio-Cafeter-a/blob/main/src/parteI/Ejercicio07.java)

---

## Parte 2: Sistema de Turno de Cafetería

En la segunda parte del proyecto se implementó un programa unificado que procesa una jornada de atención simulando las siguientes reglas de negocio:

- **Apertura de Caja:** Validación con `do-while` garantizando que el monto inicial sea mayor a `$0`.
- **Control de Inventario:** Verificación en tiempo real del stock de productos (ej. *Brownie*) antes del cobro.
- **Procesamiento de Pedidos:** Recorrido mediante `for` imprimiendo detalle de ítem, cantidad, subtotal y categoría mediante `switch`.
- **Descuentos Automáticos:** Aplicación de un **10% de descuento** en pedidos superiores a `$12.000`.
- **Cierre y Reporte:** Generación de un informe final con el total de pedidos procesados, recaudación e identificación del pedido con mayor valor.

[🌐 Checa el código](https://github.com/MarAlvGEN/Laboratorio-Cafeter-a/blob/main/src/parteII/ARCHIVO.java)
