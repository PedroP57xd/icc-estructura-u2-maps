package models;

import java.util.Objects;

import javax.swing.text.Position;

public class Empleado implements Comparable<Empleado> {
    private int id;
    private String name;
    private String position;

    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Empleado)) return false;
        Empleado other = (Empleado) obj;
        return id == other.id && name.equals(other.name) && position.equals(other.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, position);
    }

    @Override
    public String toString() {
        return "Empleado{id=" + id + ", name='" + name + "', Position='" + position + "'}";
    }
    @Override
    public int compareTo(Empleado other) {
        int comparacionId=Integer.compare(this.id, other.id);
        if (comparacionId != 0) {
            return comparacionId;
        }else{
            return name.compareTo(other.getName());
        }
    }

}