package controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class EmpleadoDAOtreeMap implements EmpleadoDAO {
    private Map<Empleado,Empleado> empleados;
    public EmpleadoDAOtreeMap(){
        this.empleados = new TreeMap<>();
    }

    @Override
    public void add(Empleado emp) {
        empleados.put(emp, emp);
    }

    @Override
    public void list() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados");
        } else {
            System.out.println("Listado");
            for (Empleado emp : empleados.values()) {
                System.out.println(emp);
            }
        }
    }

    @Override
    public void remove(int id) {
        Empleado toRemove = null;
        for (Empleado emp : empleados.keySet()) {
            if (emp.getId() == id) {
                toRemove = emp;
                break;
            }
        }
        if (toRemove != null) {
            empleados.remove(toRemove);
        }
    }
    
}
