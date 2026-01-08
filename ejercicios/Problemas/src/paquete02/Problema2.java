/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] viviendas = obtenerViviendas();
        double[][] consumos = obtenerConsumosMensuales();
        double[] totales = ConsumoAnual(consumos);
        mostrarReporte(viviendas, totales);
    
    }
    
    public static String[] obtenerViviendas() {
        Scanner entrada = new Scanner(System.in);
        String[] viviendas = new String[10];

        for (int i = 0; i < viviendas.length; i++) {
            System.out.printf("Ingrese el nombre de la vivienda\n");
            viviendas[i] = entrada.nextLine();
        }

        return viviendas;
    }
    public static double[][] obtenerConsumosMensuales() {
         Scanner entrada = new Scanner(System.in);
        double[][] consumos = new double[10][12];

        for (int i = 0; i < consumos.length; i++) {
            System.out.println("Consumos de la vivienda " + (i + 1));
            for (int j = 0; j < consumos[i].length; j++) {
                System.out.print("Mes " + (j + 1) + ": ");
                consumos[i][j] = entrada.nextDouble();
            }
        }

        return consumos;
    }

    public static double[] ConsumoAnual(double[][] consumos) {

        double[] total = new double[consumos.length];

        for (int i = 0; i < consumos.length; i++) {
            double suma = 0;
            for (int j = 0; j < consumos[i].length; j++) {
                suma = suma + consumos[i][j];
            }
            total[i] = suma;
        }

        return total;
    }

    public static void mostrarReporte(String[] viviendas, double[] totales) {

        String reporte = "Reporte Anual de consumo de viviendas\n";
        for (int i = 0; i < viviendas.length; i++) {
            reporte = String.format(
            "%sVivienda %s: %.2f \n",
            reporte,
            viviendas[i],
            totales[i]);
        }
        System.out.println(reporte);
    }
}
