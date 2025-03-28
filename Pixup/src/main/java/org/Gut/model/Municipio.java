package org.Solan.model;

import org.Solan.vu.util.ReadUtil;

public class Municipio extends Modificaciones<Municipio> {
    private int id;
    private String nombre;
    private int idEstado;

    public Municipio(String nombre) {}

    public Municipio(int id, String nombre, int idEstado) {
        this.id = id;
        this.nombre = nombre;
        this.idEstado = idEstado;
    }

    @Override
    protected Municipio crearEntidad(String nombre) {
        System.out.print("Ingrese ID del municipio: ");
        int id = ReadUtil.readInt();
        System.out.print("Ingrese ID del estado: ");
        int idEstado = ReadUtil.readInt();
        return new Municipio(id, nombre, idEstado);
    }

    @Override
    protected void actualizarEntidad(Municipio entidad, String nuevoNombre) {
        System.out.print("¿Deseas modificar el ID (s/n)?: ");
        if (ReadUtil.read().equalsIgnoreCase("s")) {
            System.out.print("Nuevo ID: ");
            entidad.setId(ReadUtil.readInt());
        }
        System.out.print("¿Deseas modificar el ID del estado (s/n)?: ");
        if (ReadUtil.read().equalsIgnoreCase("s")) {
            System.out.print("Nuevo ID Estado: ");
            entidad.setIdEstado(ReadUtil.readInt());
        }
        entidad.setNombre(nuevoNombre);
    }

    @Override
    protected String obtenerNombre(Municipio entidad) {
        return String.format("ID: %d | Nombre: %s | ID Estado: %d", entidad.getId(), entidad.getNombre(), entidad.getIdEstado());
    }

    @Override
    protected int extraerId(Municipio entidad) {
        return 0;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getIdEstado() { return idEstado; }

    public void setIdEstado(int idEstado) { this.idEstado = idEstado; }

    @Override
    public void leeDatos() {}
}