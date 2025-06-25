/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patrones;
import Model.*;
import Patrones.*;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author davic
 */
public class GestorTareas implements Observador {
    private static GestorTareas instancia;
    private List<Tarea> tareas;

    private GestorTareas() {
        tareas = new ArrayList<>();
    }

    public static GestorTareas getInstancia() {
        if (instancia == null) {
            instancia = new GestorTareas();
        }
        return instancia;
    }

    public void agregarTarea(Tarea tarea) {
        tarea.agregarObservador(this);
        tareas.add(tarea);
    }

    public void completarTarea(int id) {
        for (Tarea t : tareas) {
            if (t.getId() == id) {
                t.completar();
                return;
            }
        }
        System.out.println("Tarea no encontrada");
    }

    public TareaIterator crearIterador() {
        return new TareaIterator(tareas);
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("[Observador] " + mensaje);
    }
}
