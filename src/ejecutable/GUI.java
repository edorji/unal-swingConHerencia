
package ejecutable;

import ejecutable.estructura.Boton;
import ejecutable.estructura.Panel;
import ejecutable.estructura.Texto;
import ejecutable.estructura.Ventana;
import ejecutable.estructura.VentanaPrincipal;
import javax.swing.JFrame;

public class GUI {
    
    //Variable instancia de ventana para crear la ventana del aplicativo
    private static Ventana aplicacion;
    
    //Función que ejecuta el programa y crea todos los objetos de la pantalla
    public static void main(String[] argumentos){
        
        iniciarVentanaPrincipal();
        Panel panel1 = new Panel();
        Boton botonGuardar = crearBoton("Guardar");
        Boton botonBorrar = crearBoton("Borrar");
        Texto txtNombre = new Texto(); 
        txtNombre.setColumns(10);
        
        panel1.add(txtNombre);
        panel1.add(botonGuardar);
        panel1.add(botonBorrar);        
        aplicacion.getContentPane().add(panel1);
        aplicacion.setVisible(true);
    }
    
    //Función que crea una ventana principal
    public static void iniciarVentanaPrincipal(){
        
        aplicacion = new VentanaPrincipal();
        aplicacion.setTitle("Proyecto final");
        aplicacion.setSize(300, 400);
        aplicacion.setLocation(100, 100);
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //aplicacion.crear(true);
    }
    
    //Crea un botón para pintarlo en la pantalla
    public static Boton crearBoton(String texto){
        Boton boton = new Boton();
        boton.setText(texto);
        return boton;
    }
    
}
