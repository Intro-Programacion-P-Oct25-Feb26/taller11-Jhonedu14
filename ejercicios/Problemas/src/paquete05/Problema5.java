/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Problema5 {
    public static void main(String[] args) {

         

        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] resultado = sumaArreglos(informacion, informacion2);

        int   valor =resultado.length;
        for (int i = 0; i <valor; i++) {
            for (int c = 0; c < resultado[i].length; c++) {
                System.out.printf("%s\t", resultado[i][c]);
            }
            System.out.println();

        }

    }
    public static int[][] sumaArreglos(int[][] a, int[][] b) {
        
        int[][] suma = new int[3][3];
        for (int fila = 0; fila < a.length; fila++) {
            for (int  colu= 0; colu < a[fila].length; colu++) {

                int valor2= a[fila][colu];
                int valor3= b[fila][colu];
                suma[fila][colu] = valor2 + valor3;
            }

        }
        return suma;
    }

}
