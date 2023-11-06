/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author josue
 */
public class ClasePrestamoPersonal extends ClasePrestamos {

    //Atributos
    private static String aval1;
    private static String aval2;
    private static double sueldo;
    
    //Constructores 
    public ClasePrestamoPersonal(String aval1, String aval2, double sueldo) {
        this.aval1 = aval1;
        this.aval2 = aval2;
        this.sueldo = sueldo;
    }

    public ClasePrestamoPersonal() {
        this.aval1 = "";
        this.aval2 = "";
        this.sueldo = 0;
    }
    
    //Propiedades
    public String getAval1() {
        return aval1;
    }

    public void setAval1(String aval1) {
        this.aval1 = aval1;
    }

    public String getAval2() {
        return aval2;
    }

    public void setAval2(String aval2) {
        this.aval2 = aval2;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
    
}
