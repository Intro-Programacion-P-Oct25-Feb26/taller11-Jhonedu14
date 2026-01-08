/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] informacion = {
            {1, 2, 3},
            {10, 20, 30},
            {100, 200, 300}
        };
        mostrarPares(informacion);
    }
    public static void mostrarPares(int[][] arreglo) {

        String cadena = "";
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                if (arreglo[i][j] % 2 == 0) {
                    cadena = cadena + arreglo[i][j] + " ";
                }
            }
        }
        System.out.println("Numeros pares: \n" + cadena);
    }
}
