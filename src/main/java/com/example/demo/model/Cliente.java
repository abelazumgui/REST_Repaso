package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {
	
	@Id
	private int id;
	private String nombre;
	private String apellidos;
	private int num_cuenta;
	private double balance;
	public Cliente() {
		super();
	}
	public Cliente(int id, String nombre, String apellidos, int num_cuenta, double balance) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.num_cuenta = num_cuenta;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getNum_cuenta() {
		return num_cuenta;
	}
	public void setNum_cuenta(int num_cuenta) {
		this.num_cuenta = num_cuenta;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", num_cuenta=" + num_cuenta
				+ ", balance=" + balance + "]";
	}
	
	
	
	
	
}
