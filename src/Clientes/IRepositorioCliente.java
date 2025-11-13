/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Clientes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author UTN
 */
public interface IRepositorioCliente {
   
    public void guardar(Cliente c);
       
    public Optional<Cliente> buscar(String id);
       
    public void eliminar(String id);
       
    public List<Cliente> obtenerTodo();
}
