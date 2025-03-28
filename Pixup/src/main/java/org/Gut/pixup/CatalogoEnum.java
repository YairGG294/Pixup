package org.Solan.pixup;

import org.Solan.vu.util.CatalogoFactory;

public enum CatalogoEnum
{
    ALTAS(1),
    BAJAS(2),
    VER(3),
    SALIR(4),
    OPCION_ERRONEA( 5 ),
    ACTUALIZACION(6);
    private Integer tipo;
    private CatalogoFactory catalogoFactory;

    CatalogoEnum(Integer tipo)
    {
        this.tipo = tipo;
    }

    public Integer getTipo()
    {
        return tipo;
    }

    public static CatalogoEnum getCatalogoEnumById(Integer id )
    {
        switch( id )
        {
            case 1:
                return ALTAS;
            case 2:
                return BAJAS;
            case 3:
                return VER;
            case 4:
                return  ACTUALIZACION;
            case 5:
                return SALIR;
            case 6:
            default:
                return OPCION_ERRONEA;

        }
    }

    public CatalogoFactory getCatalogoFactory() {
        return catalogoFactory;
    }
}