/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App;
import Model.Tarea;
import Patrones.*;
import java.util.Scanner;
/**
 *
 * @author davic
 */
public class Main {
    public static void main(String[] args) {
        GestorTareas gestor = GestorTareas.getInstancia();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n1. Agregar tarea\n2. Ver tareas\n3. Completar tarea\n4. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Descripcion de la tarea: ");
                    String desc = sc.nextLine();
                    gestor.agregarTarea(new Tarea(desc));
                    break;
                case 2:
                    TareaIterator it = gestor.crearIterador();
                    while (it.hasNext()) {
                        Tarea t = it.next();
                        System.out.println(t);
                    }
                    break;
                case 3:
                    System.out.print("Ingrese ID de la tarea a completar: ");
                    int id = sc.nextInt();
                    gestor.completarTarea(id);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opcion no válida");
            }
        }
    }
}
