package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demo.interfaces.IClienteService;
import com.example.demo.model.Cliente;
@Service
public class ClienteService implements IClienteService {

	@Override
	public void alta(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public Cliente busqueda_id(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modificar(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(int id_cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Cliente> listado() {
		// TODO Auto-generated method stub
		return null;
	}

}
