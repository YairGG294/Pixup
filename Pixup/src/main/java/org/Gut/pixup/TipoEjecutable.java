package org.Solan.pixup;

import org.Solan.vu.vista.ConsolaCatalogo;
import org.Solan.vu.vista.Ventana;
import org.Solan.vu.vista.Ejecutable;

public enum TipoEjecutable
{
    CONSOLA(1, ConsolaCatalogo.getInstance()),
    VENTANA(2, Ventana.getInstance()),
    SALIR(3, null),
    OPCION_ERRONEA(4, null);
    private Integer id;
    private Ejecutable ejecutable;

    TipoEjecutable(Integer id, Ejecutable ejecutable) {
        this.id = id;
        this.ejecutable = ejecutable;
    }

    public Integer getId() {
        return id;
    }

    public static TipoEjecutable getTipoEjecutableById(int opcion) {
        switch (opcion) {
            case 1:
                return CONSOLA;
            case 2:
                return VENTANA;
            case 3:
                return SALIR;
            default:
                return OPCION_ERRONEA;
        }
    }

    public Ejecutable getEjecutable() {
        return ejecutable;
    }
}
