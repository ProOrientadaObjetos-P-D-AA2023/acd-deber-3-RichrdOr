/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejecutor2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        GestionEmpleados gestionEmpleados = new GestionEmpleados();
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú ");
            System.out.println("Agregar empleado                         [1]");
            System.out.println("Mostrar información de los empleados     [2]");
            System.out.println("Calcular aumento de salario              [3]");
            System.out.println("Salir                                    [4]");
            System.out.println("Seleccione una opción: ");

            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    gestionEmpleados.agregarEmpleado();
                    break;
                case 2:
                    gestionEmpleados.mostrarEmpleados();
                    break;
                case 3:
                    gestionEmpleados.calcularAumentoSalarial();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
