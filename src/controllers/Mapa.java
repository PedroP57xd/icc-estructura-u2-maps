package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }

    public void runHashMap() {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");
        mapa.put("003", "Celular");
        mapa.put("003", "PC");
        System.out.println(mapa);
        System.out.println(mapa.keySet());
        for (String key : mapa.keySet()) {
            System.out.println(mapa.get(key));
        }
        System.out.println(mapa.get("001"));
        System.out.println(mapa.get("005"));

    }

    public void runLinkedHashMap() {
        Map<Integer, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(1, "Pedro");
        linkedMap.put(2, "Juan");
        linkedMap.put(3, "Maria");
        linkedMap.put(4, "Ana");
        linkedMap.put(5, "Luis");

        System.out.println("Valores en LinkedHashMap:");
        for (String value : linkedMap.values()) {
            System.out.println(value);
        }
        System.out.println();
    }

    // Muestra cómo TreeMap ordena automáticamente las claves
    public void runTreeMap() {
        Map<Integer, String> items = new TreeMap<>();
        items.put(3, "carro");
        items.put(6, "bicicleta");
        items.put(1, "moto");

        System.out.println("Elementos ordenados en TreeMap:");
        for (Map.Entry<Integer, String> entry : items.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        System.out.println();
    }

    // Muestra cómo se comporta HashMap cuando la clave es un objeto personalizado
    public void runHashMapObj() {
        Map<Empleado, Integer> empleados = new HashMap<>();
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Juan", "Dev"), 2500); // Esta clave reemplaza a la primera
        empleados.put(new Empleado(1, "Diego", "Dev"), 2500);

        System.out.println("Contenido de HashMap con objetos:");
        for (Map.Entry<Empleado, Integer> entry : empleados.entrySet()) {
            System.out.println(entry.getKey() + " => $" + entry.getValue());
        }
    }

    public void runTreeMapObj() {
        Map<Empleado, Integer> empleados = new TreeMap<>();
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Juan", "Dev"), 2500); // Esta clave reemplaza a la primera
        empleados.put(new Empleado(1, "Diego", "Senior"), 3000);


        for (Map.Entry<Empleado, Integer> entry : empleados.entrySet()) {   
            System.out.println(entry.getKey() + " => $" + entry.getValue());
        }

    }
}
