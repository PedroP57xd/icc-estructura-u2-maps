import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Pedro Panjon"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();
    }

    private static void runMapExamlpe() {
        System.out.println(" ");
        Mapa mapa = new Mapa();
        System.out.println("Ejemplo de uso de Mapas");
        mapa.runHashMap();
        System.out.println(" ");
        System.out.println("Ejemplo de uso de LinkedHashMap");
        mapa.runLinkedHashMap();
        System.out.println(" ");
        System.out.println("Ejemplo de uso de TreeMap");
        mapa.runTreeMap();
        System.out.println(" ");
        System.out.println("Ejemplo de uso de HashMap con objetos");
        mapa.runHashMapObj();
        System.out.println(" ");
        System.out.println("Ejemplo de uso de TreeMap con objetos");
        mapa.runTreeMapObj();
        System.out.println(" ");

    }

    // private static void runEmpleadoExample() {
    // throw new UnsupportedOperationException("Not implemented yet");
    // }

    // private static void runEjerccios() {
    // throw new UnsupportedOperationException("Not implemented yet");

    // }
}
