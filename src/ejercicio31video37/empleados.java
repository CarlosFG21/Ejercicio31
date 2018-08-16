/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio31video37;

import java.util.*;

public class empleados {
    
    public empleados(String nom){
        
        nombre = nom;
        seccion = "Administracion";
        Id=IdSiguiente;
        IdSiguiente++;
    }

    
    public void cambiaSeccion(String seccion){
        
        this.seccion = seccion;
        
    }
    
    
    public String devuelveDatos(){
        
        return "EL NOMBRE ES: " + nombre + " Y LA SECCION ES " + seccion + 
                " Y EL ID = " + Id;
        
    }
    
    private final String nombre;
    private String seccion;
    private int Id;
    private static int IdSiguiente =1;
    
}
