/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ketro
 */
public class Proveedor {
    private String nombre;
    
    // Constructores

    public Proveedor() {
    }

    public Proveedor(String nombre) {
        this.nombre = nombre;
    }
    
    // Gets & Sets

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
