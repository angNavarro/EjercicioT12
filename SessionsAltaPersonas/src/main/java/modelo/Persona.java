/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class Persona {
    private final int codigo;

    public Persona(int codigo, String nombre, String apellidos, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos; 
    }

    public int getEdad() {
        return edad;
    }
    private final String nombre;
    private final String apellidos;
    private final int edad;
    
    //Añadir metodo para añadir el siguiente codigo a persona
    public static int siguienteCodigo(ArrayList<Persona> lista){
    if(lista.isEmpty()) return 1;
    return lista.get(lista.size()-1).getCodigo()+1; //Utilizo el size para ver lo largo que es y añado uno mas. 
    
    }
    
}
