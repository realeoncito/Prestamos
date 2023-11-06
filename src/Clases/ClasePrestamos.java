/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author josue
 */
public class ClasePrestamos {
    //Atributos
    private static int numeroPrestamo;
    private static String nombreCliente;
    private static int tipoPrestamo;
    
    //Constructores
    
    public ClasePrestamos(){
        this.numeroPrestamo = 0;
        this.nombreCliente = "";
        this.tipoPrestamo = 0;
    }
    
    public ClasePrestamos(int num, String nombre, int tipo){
        this.numeroPrestamo = num;
        this.nombreCliente = nombre;
        this.tipoPrestamo = tipo;
    }

    public static int getNumeroPrestamos() {
        return numeroPrestamo;
    }

    public static void setNumeroPrestamos(int numeroPrestamos) {
        ClasePrestamos.numeroPrestamo = numeroPrestamos;
    }

    public static String getNombreCliente() {
        return nombreCliente;
    }

    public static void setNombreCliente(String nombreCliente) {
        ClasePrestamos.nombreCliente = nombreCliente;
    }

    public static int getTipoPrestamo() {
        return tipoPrestamo;
    }

    public static void setTipoPrestamo(int tipoPrestamo) {
        ClasePrestamos.tipoPrestamo = tipoPrestamo;
    }
    
}
