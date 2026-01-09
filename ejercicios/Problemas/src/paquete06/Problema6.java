/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Problema6 {

    public static void main(String[] args) {
        
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};

        double media = obtenerMedia(informacion);
        double desviacion = obtenerDesviacion(informacion, media);

        System.out.printf("Media aritmetica: %.2f\n", media);
        System.out.printf("Desviacion estandar: %.2f\n", desviacion);
    }
    public static double obtenerMedia(int[] arreglo) {

        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        double media = suma / arreglo.length;
        return media;
    }

    public static double obtenerDesviacion(int[] x, double media) {

        double suma = 0;

        for (int i = 0; i < x.length; i++) {
            suma = suma + Math.pow(x[i] - media, 2);
        }

        double desviacion = Math.sqrt(suma / x.length);
        return desviacion;
    }
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    

        
