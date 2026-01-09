/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema7 {
    public static void main(String[] args) {

        String[] ciudades = obtenerCiudades();
        imprimirCiudadesCaracteres(ciudades);
    }
    public static String[] obtenerCiudades() {

        Scanner entrada = new Scanner(System.in);
        int n;

        System.out.println("Ingrese el numero de ciudades: ");
        n = entrada.nextInt();
        entrada.nextLine(); 

        String[] ciudades = new String[n];

        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("Ingrese el nombre de la ciudad "+ (i+1));
            ciudades[i] = entrada.nextLine();
        }

        return ciudades;
    }

    public static void imprimirCiudadesCaracteres(String[] ciudades) {

        System.out.println("\nCiudades con 4 o 5 caracteres:");
        int valor_c= ciudades.length;
        for (int i = 0; i < valor_c; i++) {
            int longitud = ciudades[i].length();

            if (longitud == 4 || longitud == 5) {
                System.out.println(ciudades[i]);
            }
        }
    }
}
