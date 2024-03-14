/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.Modelo;

/**
 *
 * @author Usuario
 */
public class Objeto 
{
    private int id;
    private String nombre;

    public Objeto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    } //Fin del contructor
    
     public Objeto() 
     {
        this.id = 22;
        this.nombre = "Hola";
    } //Fin del contructor

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Objeto{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
    
    
}//Fin de la clase
