/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import Mappers.IMapper;

/**
 *
 * @author UTN
 */
public class MetodoPagoMapper implements IMapper<MetodoPago,MetodoPagoDto> {
    private String idCliente;

    @Override
    public MetodoPagoDto ToDTO(MetodoPago ent) {
        return new MetodoPagoDto(ent.getId(),
                ent.getTipo().toString(),
                ent.getDetalles(), idCliente);
    
    }
    
     public MetodoPagoDto ToDTO(MetodoPago ent, String idCliente) {
      this.idCliente=idCliente;
      return this.ToDTO(ent);
    }

    @Override
    public MetodoPago ToEntidad(MetodoPagoDto dto) {
        return new MetodoPago(dto.getId()
                ,TipoMetodoPago.valueOf(dto.getTipo().toUpperCase())
                ,dto.getDetalles());
    }
   



// public MetodoPagoDto MatodoPagoToDto(MetodoPago metodopago){
        //return new MatodoPagoToDto(metodopago.getId(),metodopago.getTipo(),metodopago.getDetalles());
    
//}
}
