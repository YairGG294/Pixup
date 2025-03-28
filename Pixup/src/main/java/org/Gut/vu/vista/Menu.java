package org.Solan.vu.vista;

public class Menu {
    public static void principal( )
    {
        System.out.println("WELCOME");
        System.out.println("PIXUP");
        System.out.println("SELECCIONA UNA OPCION");
        System.out.println("1.- Consola");
        System.out.println("2.- Ventana");
        System.out.println("3.- Salir");
    }
    public static void Catalogo( )
    {
        System.out.println("--------------------------------");
        System.out.println("SELECCIONA UNA OPCION");
        System.out.println("1.- Catalogo");
        System.out.println("2.- Pendiente");
        System.out.println("3.- Salir");
        System.out.println("--------------------------------");
    }
    public static void seleccionaOpcion( )
    {
        System.out.println("Dame una opción");
    }
    public static void opcionInvalida( )
    {
        System.out.println("La opción no es correcta");
    }
    public static void errorDato( )
    {
        System.out.println("No es un dato valido");
    }
    public static void leeColoniaId( ){
        System.out.println("Ingresa el id de la colonia");
    }
    public static void leeColoniaName( ){
        System.out.println("Ingresa el nombre de la colonia");
    }
    public static void leeColoniaCp( ){
        System.out.println("Ingresa el codigo postal de la colonia");
    }
    public static void leeEstadoId( ){
        System.out.println("Ingresa el Id del estado");
    }
    public static void leeEstadoName( ){
        System.out.println("Ingresa el nombre del estado");
    }
    public static void leeMunId( ){
        System.out.println("Ingresa el ID del municipio");
    }
    public static void leeMunName( ){
        System.out.println("Ingresa el nombre del municipio");
    }
}
