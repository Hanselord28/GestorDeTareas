/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patrones;
import Model.*;

import java.util.Iterator;
import java.util.List;
/**
 *
 * @author davic
 */
public class TareaIterator implements Iterator<Tarea> {
    private List<Tarea> tareas;
    private int posicion = 0;

    public TareaIterator(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    @Override
    public boolean hasNext() {
        return posicion < tareas.size();
    }

    @Override
    public Tarea next() {
        return tareas.get(posicion++);
    }
}
