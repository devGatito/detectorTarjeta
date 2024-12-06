/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocredito;
import java.util.ArrayList;

/**
 *
 * @author develias
 */
public class SistemaTarjetas {
    
  private ArrayList<TarjetaDeCredito> tarjetas;

    // Constructor
    public SistemaTarjetas() {
        this.tarjetas = new ArrayList<>();
    }

    // Método para agregar una tarjeta
    public boolean agregarTarjeta(String numero, String fechaVencimiento, String codigoSeguridad) {
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(numero, fechaVencimiento, codigoSeguridad);
        if (tarjeta.esValido()) {
            tarjetas.add(tarjeta);
            System.out.println("Tarjeta agregada correctamente.");
            return true;
        } else {
            System.out.println("Tarjeta no válida. No se puede agregar.");
            return false;
        }
    }

    public void mostrarTarjetas() {
        if (tarjetas.isEmpty()) {
            System.out.println("No hay tarjetas almacenadas.");
        } else {
            System.out.println("Tarjetas almacenadas:");
            for (TarjetaDeCredito tarjeta : tarjetas) {
                System.out.println(tarjeta);
            }
        }
    }
}

   