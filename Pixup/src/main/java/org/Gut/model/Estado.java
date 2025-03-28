package org.Solan.model;

import org.Solan.vu.util.ReadUtil;

public class Estado extends Modificaciones<Estado> {
    private int id;
    private String nombre;

    public Estado(String nombre) {}

    public Estado(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    protected Estado crearEntidad(String nombre) {
        System.out.print("Ingrese ID del estado: ");
        int id = ReadUtil.readInt();
        return new Estado(id, nombre);
    }

    @Override
    protected void actualizarEntidad(Estado entidad, String nuevoNombre) {
        System.out.print("¿Deseas modificar el ID (s/n)?: ");
        if (ReadUtil.read().equalsIgnoreCase("s")) {
            System.out.print("Nuevo ID: ");
            entidad.setId(ReadUtil.readInt());
        }
        entidad.setNombre(nuevoNombre);
    }

    @Override
    protected String obtenerNombre(Estado entidad) {
        return String.format("ID: %d | Nombre: %s", entidad.getId(), entidad.getNombre());
    }

    @Override
    protected int extraerId(Estado entidad) {
        return 0;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public void leeDatos() {}
}
