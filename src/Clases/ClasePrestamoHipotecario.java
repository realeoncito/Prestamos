/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import static Clases.ClasePrestamos.getNombreCliente;

/**
 *
 * @author josue
 */
public class ClasePrestamoHipotecario extends ClasePrestamos{

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
    public String getNumCatastral() {
        return numCatastral;
    }

    public void setNumCatastral(String numCatastral) {
        ClasePrestamoHipotecario.numCatastral = numCatastral;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        ClasePrestamoHipotecario.ubicacion = ubicacion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        ClasePrestamoHipotecario.valor = valor;
    }

    public String toString(){
        return ("Nombre del Cliente: " + getNombreCliente() + ""
                + "\nTipo de Prestamo: Hipotecario "
                + "\nNumero Catastral: " + getNumCatastral() +""
                + "\nUbicacion: " + getUbicacion() + ""
                + "\nValor: "+ getValor());
    }
}
