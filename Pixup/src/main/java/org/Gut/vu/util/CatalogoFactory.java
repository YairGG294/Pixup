package org.Solan.vu.util;


import org.Solan.model.Colonia;
import org.Solan.model.Estado;
import org.Solan.model.Modificaciones;
import org.Solan.model.Municipio;
import org.Solan.pixup.PixupEnum;

public class CatalogoFactory
{

    private static String nombre;

    public static Modificaciones getPixupByPixupEnum(PixupEnum pixupEnum)
    {
        switch (pixupEnum)
        {
            case COLONIA:
                return new Colonia(nombre);
            case ESTADO:
                return new Estado(nombre);
            case MUNICIPIO:
                return new Municipio(nombre);
            case OPCION_ERRONEA:
            case SALIR:
            default:
                return null;
        }
    }
}

