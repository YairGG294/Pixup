package org.Solan.model;

import org.Solan.vu.util.ReadUtil;
import java.util.ArrayList;

public abstract class Modificaciones<T> implements org.Solan.vu.vista.SolicitaDatos {
    protected ArrayList<T> lista = new ArrayList<>();

    public void Altas() {
        String nombre;
        do {
            System.out.print("Ingrese nombre: ");
            nombre = ReadUtil.read();
        } while (nombre == null || nombre.trim().isEmpty());

        T entidad = crearEntidadConValidacion(nombre);
        if (entidad != null) {
            lista.add(entidad);
        }
    }

    public void Bajas() {
        Ver();
        System.out.print("Ingrese el índice a eliminar: ");
        int index = ReadUtil.readInt();
        if (index >= 0 && index < lista.size()) {
            System.out.print("¿Estás seguro de eliminar? (s/n): ");
            String confirm = ReadUtil.read();
            if (confirm.equalsIgnoreCase("s")) {
                lista.remove(index);
            }
        } else {
            System.out.println("Índice inválido");
        }
    }

    public void Ver() {
        System.out.println("Listado:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%d. %s%n", i, obtenerNombre(lista.get(i)));
        }
    }

    public void Actu() {
        Ver();
        System.out.print("Ingrese el índice a actualizar: ");
        int index = ReadUtil.readInt();
        if (index >= 0 && index < lista.size()) {
            System.out.print("Ingrese nuevo nombre: ");
            String nuevoNombre = ReadUtil.read();
            if (nuevoNombre == null || nuevoNombre.trim().isEmpty()) {
                System.out.println("El nombre no puede estar vacío.");
                return;
            }
            actualizarEntidad(lista.get(index), nuevoNombre);
        } else {
            System.out.println("Índice inválido");
        }
    }

    protected abstract T crearEntidad(String nombre);

    private T crearEntidadConValidacion(String nombre) {
        T entidad = crearEntidad(nombre);
        int nuevoId = extraerId(entidad);
        for (T item : lista) {
            if (extraerId(item) == nuevoId) {
                System.out.println("Error: El ID ya existe. Alta cancelada.");
                return null;
            }
        }
        return entidad;
    }

    protected abstract void actualizarEntidad(T entidad, String nuevoNombre);
    protected abstract String obtenerNombre(T entidad);
    protected abstract int extraerId(T entidad);
}
