/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facturacion;

import Clientes.Cliente;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author kevin
 */
public class FacturaDto {
    private int numero;
    private Cliente cliente;
    private LocalDateTime fecha;
    private EstadoFactura estado;

    public FacturaDto(int numero, Cliente cliente, LocalDateTime fecha, EstadoFactura estado) {
        this.numero = numero;
        this.cliente = cliente;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public EstadoFactura getEstado() {
        return estado;
    }
    
}
