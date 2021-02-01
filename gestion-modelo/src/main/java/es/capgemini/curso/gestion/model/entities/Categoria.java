package es.capgemini.curso.gestion.model.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categoria implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcategoria;
	
	private String nombre;

	/*
	 * En el mappedBy hay que poner el nombre del campo que he puesto en Java
	 */
	@OneToMany(mappedBy = "categoria", fetch = FetchType.EAGER)
	private List<Producto> productos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdcategoria() {
		return idcategoria;
	}
	
	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}


	
	public Categoria(String nombre, List<Producto> productos) {
		this.nombre = nombre;
		this.productos = productos;
	}
	
	public Categoria(String nombre) {
		this.nombre = nombre;
	}

	public Categoria() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(getIdcategoria());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (productos == null) {
			if (other.productos != null)
				return false;
		} else if (!productos.equals(other.productos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Categoria [idcategoria=" + idcategoria + ", nombre=" + nombre + ", productos=" + productos + "]";
	}



}
