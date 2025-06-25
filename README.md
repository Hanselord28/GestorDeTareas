# GestorDeTareas 

## 📌 Descripción del sistema
**GestorTareas** es una aplicación de consola desarrollada en Java estándar que permite gestionar una lista de tareas. A través de un menú interactivo, el usuario puede:
- Agregar nuevas tareas
- Visualizar todas las tareas
- Marcar tareas como completadas

El sistema aplica **cuatro patrones de diseño** de forma coherente y funcional para mantener el código modular, extensible y fácil de mantener.

---

## 🛠️ Problema a resolver
En muchas actividades cotidianas, es necesario llevar control de tareas o pendientes. Este sistema ofrece una solución sencilla para registrar, completar y visualizar tareas, aplicando principios de diseño orientado a objetos y patrones de diseño para mejorar la estructura y la reutilización del código.

---

## 🧩 Patrones de diseño aplicados y justificación

### 1. **Singleton** (Creacional)
**Clase:** `GestorTareas.java`  
**Propósito:** Garantizar una única instancia del gestor central de tareas.  
**Justificación:** El patrón Singleton asegura que todas las operaciones de agregar, listar o completar tareas se realicen sobre la misma lista compartida, evitando inconsistencias.

---

### 2. **Adapter** (Estructural)
**Clase:** `SimpleTaskAdapter.java`  
**Propósito:** Adaptar objetos de tipo `SimpleTask` (estructura externa) al modelo interno `Tarea`.  
**Justificación:** Este patrón permite reutilizar una clase externa con estructura diferente, integrándola al sistema sin modificar el código original, promoviendo la compatibilidad y la escalabilidad.

---

### 3. **Observer** (De comportamiento)
**Clases:** `Observable.java`, `Observador.java`, uso en `Tarea.java` y `GestorTareas.java`  
**Propósito:** Notificar automáticamente a los observadores cuando una tarea cambia de estado.  
**Justificación:** Permite una comunicación desacoplada entre tareas y componentes interesados en los cambios (por ejemplo, para mostrar mensajes en consola al completar una tarea).

---

### 4. **Iterator** (Libre elección)
**Clase:** `TareaIterator.java`  
**Propósito:** Recorrer la colección de tareas sin exponer su implementación interna.  
**Justificación:** Facilita el recorrido ordenado de la lista de tareas mediante una interfaz común, haciendo el sistema más limpio y extensible.

---

## 🧪 Instrucciones de compilación y ejecución (solo con `/src`)

### ✔️ Opción 1: Desde un IDE como NetBeans

1. Crea un nuevo proyecto Java vacío en NetBeans.
2. Elimina la carpeta `src` generada automáticamente.
3. Copia y pega la carpeta `src` entregada en su lugar.
4. Asegúrate de que los paquetes (`app`, `modelo`, `patrones`) estén bien reconocidos.
5. Abre `Main.java` (ubicado en `src/app/`) y haz clic derecho > **Run File**.# GestorDeTareas
Un gestor de tareas creado para la asignatura de patrones de diseño 
