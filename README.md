<img width="1246" height="132" alt="image" src="https://github.com/user-attachments/assets/b98ae2ec-c816-42c0-b211-ab439f2bbbc9" />
 Proyecto de Despliegue de Software

 Descripción

El programa utiliza una clase llamada `ProyectoSoftware` para guardar la información de un proyecto de software y controlar la fase en la que se encuentra.

El proyecto puede avanzar por diferentes etapas hasta llegar a la fase de despliegue.

 Objetivo

El objetivo del ejercicio es practicar algunos conceptos de Programación Orientada a Objetos (POO), como:

 Clases y objetos.
 Atributos.
 Constructores.
 Métodos.
 Uso de números para representar estados.
 Condiciones.
 Cambio de estado de un objeto.

Clase ProyectoSoftware

La clase `ProyectoSoftware` tiene los siguientes atributos:

 `nombreProyecto`: nombre del proyecto.
 `clienteEmpresa`: empresa para la que se realiza el proyecto.
 `faseActual`: número que representa la fase en la que se encuentra el proyecto.

Las fases son:

 `1`: Análisis.
 `2`: Desarrollo.
 `3`: Despliegue.

 Constructor

El constructor recibe el nombre del proyecto y el nombre de la empresa.

La `faseActual` comienza siempre en `1`, por lo que todo proyecto comienza en la etapa de **Análisis**.

 Métodos

`avanzarFase()`

Permite avanzar el proyecto a la siguiente fase.

La fase aumenta de uno en uno hasta llegar a `3`.

Una vez que el proyecto está en la fase de Despliegue, no puede avanzar más.

 `obtenerEstado()`

Devuelve el nombre de la fase actual en forma de texto.

Por ejemplo:

 `1` → Análisis.
 `2` → Desarrollo.
 `3` → Despliegue.

 Ejemplo

En el `main` se crea un proyecto y se muestra su estado inicial.

Después se utiliza `avanzarFase()` para pasar por las diferentes etapas del proyecto.

Finalmente, se muestra por consola la transición desde **Análisis**, pasando por **Desarrollo**, hasta llegar a **Despliegue**.
