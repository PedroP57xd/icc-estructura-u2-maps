package controllers;

import models.Empleado;

public class EmpleadoContoller {
    private EmpleadoDAO empleadoDAO;

    // Constructor con inyección de dependencia
    public EmpleadoContoller(EmpleadoDAO empleadoDAO) {
        this.empleadoDAO = empleadoDAO;
    }

    public void agregarEmpleado(Empleado emp) {
        empleadoDAO.add(emp);
    }

    public void list() {
        empleadoDAO.list();
    }

    public void remove(int id) {
        empleadoDAO.remove(id);
    }
}
