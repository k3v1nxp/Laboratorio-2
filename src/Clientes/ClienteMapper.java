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
public class ClienteMapper implements IMapper<Cliente,ClienteDto> {

    @Override
    public ClienteDto ToDTO(Cliente ent) {
       return new ClienteDto(ent.getId(),ent.getEmail(),ent.getNombre(),ent.getTelefono());
   
    }

    @Override
    public Cliente ToEntidad(ClienteDto dto) {
       Cliente Cliente = new Cliente(dto.getId(),dto.getNombre(),dto.getEmail(),dto.getTelefono());
        return Cliente;
    }

    
    







// return new ClienteDto(ent.getId(),ent.getEmail(),ent.getNombre(),ent.getTelefono());
   
    

   
    //public ClienteDto clienteToDTO (Cliente cliente){
     //   return new ClienteDto(cliente.getId(),cliente.getEmail(),cliente.getNombre(),cliente.getTelefono());
   // }
    
    //public Cliente DtoToCliente (ClienteDto dto){
      //  Cliente cliente = new Cliente(dto.getId(),dto.getNombre(),dto.getEmail(),dto.getTelefono());
       // return Cliente;
    //}
}
