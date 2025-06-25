/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Patrones.*;
/**
 *
 * @author davic
 */
public class Tarea extends Observable {
    private static int contador = 0;
    private int id;
    private String descripcion;
    private boolean completada = false;

    public Tarea(String descripcion) {
        this.id = ++contador;
        this.descripcion = descripcion;
    }

    public int getId() { return id; }

    public void completar() {
        this.completada = true;
        notificar("Tarea completada: " + descripcion);
    }

    public String toString() {
    return "[" + id + "] " + descripcion + (completada ? " (completada)" : " (pendiente)");
}

}
