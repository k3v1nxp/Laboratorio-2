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
public class CategoriaMapper implements IMapper<Categoria,CategoriaDTO> {

    @Override
    public CategoriaDTO ToDTO(Categoria ent) {
        return new CategoriaDTO (ent.getId(), ent.getNombre(), ent.getDescripcion(), ent.isActiva());
    }

    @Override
    public Categoria ToEntidad(CategoriaDTO dto) {
        Categoria categoria = new Categoria(dto.getId(),dto.getNombre(), dto.getDescripcion(), dto.isActiva());
        return categoria;
    }
    
}
