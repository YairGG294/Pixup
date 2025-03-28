package org.Solan.model;

import org.Solan.vu.util.ReadUtil;

public class Colonia extends Modificaciones<Colonia> {
    private int id;
    private String nombre;
    private String cp;
    private int idMunicipio;

    public Colonia(String nombre) {}

    public Colonia(int id, String nombre, String cp, int idMunicipio) {
        this.id = id;
        this.nombre = nombre;
        this.cp = cp;
        this.idMunicipio = idMunicipio;
    }

    @Override
    protected Colonia crearEntidad(String nombre) {
        System.out.print("Ingrese ID de la colonia: ");
        int id = ReadUtil.readInt();
        System.out.print("Ingrese código postal: ");
        String cp = ReadUtil.read();
        System.out.print("Ingrese ID del municipio: ");
        int idMunicipio = ReadUtil.readInt();
        return new Colonia(id, nombre, cp, idMunicipio);
    }

    @Override
    protected void actualizarEntidad(Colonia entidad, String nuevoNombre) {
        System.out.print("¿Deseas modificar el ID (s/n)?: ");
        if (ReadUtil.read().equalsIgnoreCase("s")) {
            System.out.print("Nuevo ID: ");
            entidad.setId(ReadUtil.readInt());
        }
        System.out.print("¿Deseas modificar el CP (s/n)?: ");
        if (ReadUtil.read().equalsIgnoreCase("s")) {
            System.out.print("Nuevo CP: ");
            entidad.setCp(ReadUtil.read());
        }
        System.out.print("¿Deseas modificar el ID del municipio (s/n)?: ");
        if (ReadUtil.read().equalsIgnoreCase("s")) {
            System.out.print("Nuevo ID Municipio: ");
            entidad.setIdMunicipio(ReadUtil.readInt());
        }
        entidad.setNombre(nuevoNombre);
    }

    @Override
    protected String obtenerNombre(Colonia entidad) {
        return String.format("ID: %d | Nombre: %s | CP: %s | ID Municipio: %d", entidad.getId(), entidad.getNombre(), entidad.getCp(), entidad.getIdMunicipio());
    }

    @Override
    protected int extraerId(Colonia entidad) {
        return 0;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCp() { return cp; }

    public void setCp(String cp) { this.cp = cp; }

    public int getIdMunicipio() { return idMunicipio; }

    public void setIdMunicipio(int idMunicipio) { this.idMunicipio = idMunicipio; }

    @Override
    public void leeDatos() {}
}


