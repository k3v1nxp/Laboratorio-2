/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

/**
 *
 * @author UTN
 */
public abstract class TemplateMethod {
    
    public final void processData() {
        agregar();
        buscar();
        eliminar();
    }
    
    protected abstract void agregar();
    
    protected abstract void buscar();
    
    protected void eliminar() {
        
    }
}
