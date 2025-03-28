package org.Solan.pixup;

public enum PixupEnum
{
    ESTADO(1),
    MUNICIPIO(2),
    COLONIA(3),
    SALIR(4),
    OPCION_ERRONEA( 5 ),
    CATALOGO_ENUM(6);
    private Integer tipo;

    PixupEnum(Integer tipo)
    {
        this.tipo = tipo;
    }

    public Integer getTipo()
    {
        return tipo;
    }

    public static PixupEnum getPixupEnumById(Integer id )
    {
        switch( id )
        {
            case 1:
                return ESTADO;
            case 2:
                return MUNICIPIO;
            case 3:
                return COLONIA;
            case 4:
                return SALIR;
            case 5:
                return CATALOGO_ENUM;
            case 6:
            default:
                return OPCION_ERRONEA;

        }
    }
}
