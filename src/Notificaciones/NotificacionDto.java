/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notificaciones;

import Facturacion.Factura;
import java.time.LocalDateTime;

/**
 *
 * @author kevin
 */
public class NotificacionDto {
    private int id;
    private Factura factura;
    private CanalNotificacion canal;
    private EstadoNotificacion estado;
    private LocalDateTime fecha;

    public int getId() {
        return id;
    }

    public Factura getFactura() {
        return factura;
    }

    public CanalNotificacion getCanal() {
        return canal;
    }

    public EstadoNotificacion getEstado() {
        return estado;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public NotificacionDto(int id, Factura factura, CanalNotificacion canal, EstadoNotificacion estado, LocalDateTime fecha) {
        this.id = id;
        this.factura = factura;
        this.canal = canal;
        this.estado = estado;
        this.fecha = fecha;
    }
    
}
