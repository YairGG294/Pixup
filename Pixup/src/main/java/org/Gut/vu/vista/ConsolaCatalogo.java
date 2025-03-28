
package org.Solan.vu.vista;

import org.Solan.model.Colonia;
import org.Solan.model.Estado;
import org.Solan.model.Municipio;
import org.Solan.vu.util.ReadUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsolaCatalogo implements Ejecutable {

    private static ConsolaCatalogo consolaCatalogo;
    private static ArrayList<Estado> estados = new ArrayList<>();
    private static ArrayList<Municipio> municipios = new ArrayList<>();
    private static ArrayList<Colonia> colonias = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    public static ConsolaCatalogo getInstance() {
        if(consolaCatalogo==null)
        {
            return new ConsolaCatalogo();
        }
        return consolaCatalogo;
    }

    @Override
    public void run() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Estado");
            System.out.println("2. Municipio");
            System.out.println("3. Colonia");
            System.out.println("4. Salir");
            int opcion = ReadUtil.readInt();

            switch (opcion) {
                case 1 -> menuEntidad("Estado");
                case 2 -> menuEntidad("Municipio");
                case 3 -> menuEntidad("Colonia");
                case 4 -> continuar = false;
                default -> System.out.println("Opción inválida");
            }
        }
    }

    private void menuEntidad(String tipo) {
        boolean continuar = true;
        while (continuar) {
            System.out.printf("\n--- Menú de %s ---\n", tipo);
            System.out.println("1. Dar de alta");
            System.out.println("2. Dar de baja");
            System.out.println("3. Ver datos");
            System.out.println("4. Actualizar");
            System.out.println("5. Salir");
            int opcion = ReadUtil.readInt();

            switch (opcion) {
                case 1 -> alta(tipo);
                case 2 -> baja(tipo);
                case 3 -> ver(tipo);
                case 4 -> actualizar(tipo);
                case 5 -> continuar = false;
                default -> System.out.println("Opción inválida");
            }
        }
    }

    private void alta(String tipo) {
        System.out.print("Ingrese nombre: ");
        String nombre = ReadUtil.read();
        switch (tipo) {
            case "Estado" -> estados.add(new Estado(nombre));
            case "Municipio" -> municipios.add(new Municipio(nombre));
            case "Colonia" -> colonias.add(new Colonia(nombre));
        }
    }

    private void baja(String tipo) {
        ver(tipo);
        System.out.print("Ingrese el índice a eliminar: ");
        int index = ReadUtil.readInt();
        try {
            switch (tipo) {
                case "Estado" -> estados.remove(index);
                case "Municipio" -> municipios.remove(index);
                case "Colonia" -> colonias.remove(index);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Índice inválido");
        }
    }

    private void ver(String tipo) {
        System.out.printf("\nLista de %s:\n", tipo);
        switch (tipo) {
            case "Estado" -> {
                for (int i = 0; i < estados.size(); i++)
                    System.out.printf("%d. %s\n", i, estados.get(i).getNombre());
            }
            case "Municipio" -> {
                for (int i = 0; i < municipios.size(); i++)
                    System.out.printf("%d. %s\n", i, municipios.get(i).getNombre());
            }
            case "Colonia" -> {
                for (int i = 0; i < colonias.size(); i++)
                    System.out.printf("%d. %s\n", i, colonias.get(i).getNombre());
            }
        }
    }

    private void actualizar(String tipo) {
        ver(tipo);
        System.out.print("Ingrese el índice a actualizar: ");
        int index = ReadUtil.readInt();
        System.out.print("Ingrese nuevo nombre: ");
        String nuevoNombre = scanner.nextLine();
        try {
            switch (tipo) {
                case "Estado" -> estados.get(index).setNombre(nuevoNombre);
                case "Municipio" -> municipios.get(index).setNombre(nuevoNombre);
                case "Colonia" -> colonias.get(index).setNombre(nuevoNombre);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Índice inválido");
        }
    }
}
