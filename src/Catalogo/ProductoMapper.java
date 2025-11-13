/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

import Mappers.IMapper;

/**
 *
 * @author UTN
 */
public class ProductoMapper implements IMapper<Producto,ProductoDTO> {

    @Override
    public ProductoDTO ToDTO(Producto ent) {
        return new ProductoDTO(ent.getCodigo(),ent.getNombre(),ent.getPrecio(), ent.getStock(),ent.getCategoria());
    }

    @Override
    public Producto ToEntidad(ProductoDTO dto) {
        Producto producto new = Producto()
        
    }
    
}
