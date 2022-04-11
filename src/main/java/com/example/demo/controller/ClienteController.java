package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.interfaces.IClienteService;
import com.example.demo.model.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	IClienteService cservice;
	
	@GetMapping("/listado")
	public ArrayList<Cliente> verClientes(){
		return cservice.listado();
	}
	
	@PostMapping("/nuevo")
	public String añadirDisco(@RequestBody Cliente cliente){
		Cliente nuevo=cservice.busqueda_id(cliente.getId());
		if(nuevo==null) {
			cservice.alta(cliente);
			return "Añadido correctamente.";
		} else {
			return "Ya existe.";
		}
	}
	
	@GetMapping("/buscarcliente/{id_cliente}")
	public Cliente verDisco(@PathVariable("id_cliente") Integer id_cliente){
		Cliente nuevo=cservice.busqueda_id(id_cliente);
		if(nuevo==null) {
			return null;
		} else {
			return nuevo;
		}
	}
	
	@DeleteMapping("/eliminarcliente/{id_cliente}")
	public String eliminarDisco(@PathVariable("id_cliente") Integer id_cliente){
		Cliente nuevo=cservice.busqueda_id(id_cliente);
		if(nuevo==null) {
			return "No existe.";
		} else {
			cservice.eliminar(id_cliente);
			return "Eliminado.";
		}
	}
	
	@PutMapping("/modificar")
	public String modificarDisco(@RequestBody Cliente cliente){
		Cliente nuevo=cservice.busqueda_id(cliente.getId());
		if(nuevo==null) {
			return "No existe.";
		} else {
			cservice.modificar(cliente);
			return "Modificado.";
		}
	}
}
