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
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento; 
    private String codigoSeguridad;

    // Constructor
    public TarjetaDeCredito(String numero, String fechaVencimiento, String codigoSeguridad) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.codigoSeguridad = codigoSeguridad;
    }

    public boolean esValido() {
        return validarNumero() && validarFechaVencimiento() && validarCodigoSeguridad();
    }

    private boolean validarNumero() {
        if (numero == null || numero.length() < 13 || numero.length() > 16) {
            return false;
        }
        for (int i = 0; i < numero.length(); i++) {
            char c = numero.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return validarTipoTarjeta();
    }

    private boolean validarTipoTarjeta() {
        char primerDigito = numero.charAt(0);

        if (primerDigito == '4') {
            System.out.println("Es una tarjeta Visa.");
            return true;
        } else if (primerDigito == '5') {
            System.out.println("Es una tarjeta Mastercard.");
            return true;
        } else if (primerDigito == '3') {
            System.out.println("Es una tarjeta American Express.");
            return true;
        }

        System.out.println("Tipo de tarjeta desconocido.");
        return false;
    }

    private boolean validarFechaVencimiento() {
        if (fechaVencimiento == null || fechaVencimiento.length() != 5 || fechaVencimiento.charAt(2) != '/') {
            return false;
        }
        String mesStr = fechaVencimiento.substring(0, 2);
        String anioStr = fechaVencimiento.substring(3);

        for (char c : mesStr.toCharArray()) {
            if (c < '0' || c > '9') return false;
        }
        for (char c : anioStr.toCharArray()) {
            if (c < '0' || c > '9') return false;
        }

        int mes = (mesStr.charAt(0) - '0') * 10 + (mesStr.charAt(1) - '0');
        int anio = (anioStr.charAt(0) - '0') * 10 + (anioStr.charAt(1) - '0');

        return mes >= 1 && mes <= 12 && anio >= 0;
    }

    private boolean validarCodigoSeguridad() {
        if (codigoSeguridad == null || codigoSeguridad.length() < 3 || codigoSeguridad.length() > 4) {
            return false;
        }
        for (int i = 0; i < codigoSeguridad.length(); i++) {
            char c = codigoSeguridad.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" +
               "numero='" + numero + '\'' +
               ", fechaVencimiento='" + fechaVencimiento + '\'' +
               ", codigoSeguridad='" + codigoSeguridad + '\'' +
               '}';
    }
}

    

