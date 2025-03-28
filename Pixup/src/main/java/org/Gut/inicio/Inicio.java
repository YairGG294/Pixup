package org.Solan.inicio;

import org.Solan.pixup.TipoEjecutable;
import org.Solan.vu.util.ReadUtil;
import org.Solan.vu.vista.Ejecutable;
import org.Solan.vu.vista.Menu;

public class Inicio {
    public Inicio() {
    }
    public static void main(String[] args) {
        boolean flag = true;
        int opcion = 0;
        TipoEjecutable tipoEjecutable = null;
        Ejecutable ejecutable = null;

        while (flag) {
            Menu.principal();
            opcion = ReadUtil.readInt();
            tipoEjecutable = TipoEjecutable.getTipoEjecutableById(opcion);
            if (TipoEjecutable.SALIR.equals(tipoEjecutable)) {
                flag = false;
            }
            if (TipoEjecutable.OPCION_ERRONEA.equals(tipoEjecutable)) {
                Menu.opcionInvalida();
            }
            if (tipoEjecutable.getEjecutable() != null) {
                ejecutable = tipoEjecutable.getEjecutable();
                ejecutable.run();
            }
        }
    }
}
