package com.mycompany.subprocss;

public class Loader {
    
    public static void go(String[] args) {
        
        SubProcss Main = new SubProcss();
        // SubProcss (.java externo) Main (Es el public static void por ejemplo: " public static void MAIN(String[] args) " dentro de SubProcss.java ) 
        // Le estamos especificando la ruta de nuestro proceso en este caso "Se encuentra en el .java llamado 'SubProcss' y que debe copiar  'Main' "
        // Por lo tanto le diremos que cree un '=' (igual) '= new' llamado 'SubProcss' el nombre debe ser exactamente el mismo.
        
        Main.start();
        // Este es el comando que ejecutara el archivo, le estamos indicando que ejecute Main junto todo su codigo (si desean pueden cambiar el nombre)
        // pero siosi debe mantener ' .start(); '
        // En ocasiones les saltara un error ya que no tienen su codigo en la ruta del proceso. CODIGO:

    // void start() {
    //    throw new UnsupportedOperationException("Not supported yet.");
        
    }
    
}

