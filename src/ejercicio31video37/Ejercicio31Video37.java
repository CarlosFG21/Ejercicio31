/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio31video37;

/**
 *
 * @author DELL
 */
public class Ejercicio31Video37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        empleados trabajador1 = new empleados(" PACO ");
        
        empleados trabajador2 = new empleados(" ANA ");
        
        empleados trabajador3 = new empleados(" ANTONIO ");
        
        trabajador1.cambiaSeccion("RRHH");
        
        System.out.println(trabajador1.devuelveDatos());
        
        System.out.println(trabajador2.devuelveDatos());
        
        System.out.println(trabajador3.devuelveDatos());
    }
}


