/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejecutor;

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    public static void main(String[] args) {
        VentaProductos venta = new VentaProductos();
        venta.ingresarDatos();
        venta.calcularDescuento();
        venta.calcularPrecioFinal();
    }
}
