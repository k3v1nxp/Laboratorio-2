/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Facturacion;

/**
 *
 * @author kevin
 */
public interface EstadoFacturaState {
    void emitir(Factura factura);
    void pagar(Factura factura);
    void anular(Factura factura);
    String getNombreEstado();
    
    //verifica
    boolean puedeEmitir();
    boolean puedePagar();
    boolean puedeAnular();
}

