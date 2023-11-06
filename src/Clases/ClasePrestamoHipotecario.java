/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author josue
 */
public class ClasePrestamoHipotecario {

    //Atributos        
    private static String numCatastral;
    private static String ubicacion;
    private static double valor;
    
    //Constructores
    public ClasePrestamoHipotecario() {
        this.numCatastral = "";
        this.ubicacion = "";
        this.valor = 0;
    }

    public ClasePrestamoHipotecario(String numCatastral, String ubicacion, double valor) {
        this.numCatastral = numCatastral;
        this.ubicacion = ubicacion;
        this.valor = valor;
    }
 
    //Propiedades
    public static String getNumCatastral() {
        return numCatastral;
    }

    public static void setNumCatastral(String numCatastral) {
        ClasePrestamoHipotecario.numCatastral = numCatastral;
    }

    public static String getUbicacion() {
        return ubicacion;
    }

    public static void setUbicacion(String ubicacion) {
        ClasePrestamoHipotecario.ubicacion = ubicacion;
    }

    public static double getValor() {
        return valor;
    }

    public static void setValor(double valor) {
        ClasePrestamoHipotecario.valor = valor;
    }

    
}
