/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String nombre;
        String cedula;

        System.out.println("Seleccione una opcion:");
        System.out.println("1. Calcular planilla de luz");
        System.out.println("2. Calcular predio");
        System.out.println("Ingrese una opcion: ");
        opcion = entrada.nextInt();
        entrada.nextLine(); 

        System.out.println("Ingrese el nombre del cliente: ");
        nombre = entrada.nextLine();

        System.out.println("Ingrese la cedula del cliente: ");
        cedula = entrada.nextLine();

        if (opcion == 1) {
            calcularValorLuz(nombre, cedula);
        } else {
            if (opcion == 2) {
                calcularPredio(nombre, cedula);
            } else {
                System.out.println("Opcion Invalida vuelva a elegir 1 o 2");
            }
        }
    }

    public static void calcularValorLuz(String nombre, String cedula) {
        Scanner entrada = new Scanner(System.in);
        double valorKilowatio;
        double numeroKilowatios;
        double total;

        System.out.println("Ingrese el valor del kilowatio: ");
        valorKilowatio = entrada.nextDouble();

        System.out.println("Ingrese el numero de kilowatios del mes: ");
        numeroKilowatios = entrada.nextDouble();
        
        total = valorKilowatio * numeroKilowatios;
        System.out.printf("\nCliente %s con cédula %s debe cancelar el valor de"
                + " $%.2f\n", 
                nombre, cedula, total);
                
    }
    public static void calcularPredio(String nombre, String cedula) {
        Scanner entrada = new Scanner(System.in);
        double valorInmueble;
        double valorPredio;
        System.out.println("Ingrese el valor del inmueble: ");
        valorInmueble = entrada.nextDouble();
        valorPredio = valorInmueble * 0.02;
        System.out.printf("\nCliente %s con cedula %s tiene un buen inmueble "
                + "con el costo de $%.2f y tiene que pagar de predio $%.2f\n", 
                nombre, cedula, valorInmueble, valorPredio);
    }
}
