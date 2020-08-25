package com.gmail.leonard;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class ExampleDTO implements Serializable {

	protected Collection<String> lista;
	private String nombre;
	private String contrasennia;
	public ArrayList<String> lista2;


	public Collection<String> getLista() {
		return lista;
	}

	public void setLista(Collection<String> lista) {
		this.lista = lista;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasennia() {
		return contrasennia;
	}

	public void setContrasennia(String contrasennia) {
		this.contrasennia = contrasennia;
	}

	public ArrayList<String> getLista2() {
		return lista2;
	}

	public void setLista2(ArrayList<String> lista2) {
		this.lista2 = lista2;
	}
}
