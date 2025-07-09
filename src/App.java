import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOtreeMap;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Pedro Panjon"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        // runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

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

    private static void runEmpleadoExample() {
        EmpleadoDAO empleadoHash= new EmpleadoDAOHashMap();
        EmpleadoContoller empleadoControllerHash = new EmpleadoContoller(empleadoHash);
        
        EmpleadoDAO empleadoDaoTree = new EmpleadoDAOtreeMap();
        EmpleadoContoller empleadoControllerTree= new EmpleadoContoller(empleadoDaoTree);

        Empleado emp1 = new Empleado(4, "Pedro", "DEV");
        Empleado emp2 = new Empleado(2, "Pedro", "DEV");
        Empleado emp3 = new Empleado(5, "Juan", "DEV");
        Empleado emp4 = new Empleado(3, "Maria", "DEV");
        Empleado emp5 = new Empleado(1, "Juan", "DEV");

        empleadoControllerHash.agregarEmpleado(emp1);
        empleadoControllerHash.agregarEmpleado(emp2);
        empleadoControllerHash.agregarEmpleado(emp3);
        empleadoControllerHash.agregarEmpleado(emp4);
        empleadoControllerHash.agregarEmpleado(emp5);
        empleadoControllerTree.agregarEmpleado(emp1);
        empleadoControllerTree.agregarEmpleado(emp2);
        empleadoControllerTree.agregarEmpleado(emp3);
        empleadoControllerTree.agregarEmpleado(emp4);
        empleadoControllerTree.agregarEmpleado(emp5);

        empleadoControllerHash.list();
        empleadoControllerHash.remove(2);
        empleadoControllerHash.list();

        empleadoControllerTree.list();
        empleadoControllerTree.remove(2);
        empleadoControllerTree.list();
    }

    // private static void runEjerccios() {
    // throw new UnsupportedOperationException("Not implemented yet");

    // }
}
