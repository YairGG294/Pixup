package org.Solan.vu.vista;

import javax.swing.*;

public class Ventana extends JFrame implements Ejecutable {
    private static Ventana ventana;
    public Ventana()
    {
    }

    @Override
    public void run() {
        setBounds( 100, 100, 300, 200);
        setVisible( true );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
    }

    public static Ventana getInstance(){
        if(ventana==null)
        {
            return new Ventana();
        }
        return ventana;
    }
}
