/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocredito;

/**
 *
 * @author develias
 */
public class ProyectoCredito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        SistemaTarjetas sistema = new SistemaTarjetas();
        sistema.agregarTarjeta("4532015112830366", "12/25", "123");
        sistema.mostrarTarjetas();
    }

}
