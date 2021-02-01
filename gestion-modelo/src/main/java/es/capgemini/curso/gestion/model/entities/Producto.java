package es.capgemini.curso.gestion.model.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idproducto;

	private String nombre;

	private float precio;
	
	private int unidades;
	
	@ManyToOne
	@JoinColumn(name = "idcategoria")
	private Categoria categoria;

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	
	public Producto(String nombre, float precio, int unidades) {
		this.nombre = nombre;
		this.precio = precio;
		this.unidades = unidades;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getIdproducto());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (idproducto != other.idproducto)
			return false;
		return true;
	}

	public Producto() {
	}

	@Override
	public String toString() {
		return "Producto [idproducto=" + idproducto + ", nombre=" + nombre + ", precio=" + precio + ", unidades="
				+ unidades + "]";
	}
	

}
