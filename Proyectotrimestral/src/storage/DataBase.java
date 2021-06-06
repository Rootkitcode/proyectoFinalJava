package storage;
import java.util.*;

import CajaRegistradora.objetos.carnicos;
import CajaRegistradora.objetos.Verduras;

import java.util.ArrayList;
import java.util.List;

import CajaRegistradora.objetos.Granos;
import CajaRegistradora.objetos.Lacteos;
import CajaRegistradora.objetos.Productos;


public class DataBase {
	
	private Productos[] productos;
	private List<Productos> ventas;
	private List<Productos>comprar;
	
	public DataBase() {
		productos = new Productos[4];
		Productos Carnicos = new carnicos("lomo cuadrado");
		Productos verduras = new Verduras("zanahoria");
		Productos granos = new Granos("Arroz");
		Productos lacteos = new Lacteos("Leche");
		
		productos[0] = Carnicos;
		productos[1] = verduras;
		productos[2] = granos;
		productos[3] = lacteos;
		
		
		ventas = new ArrayList<>();
		comprar = new ArrayList<>();
		
	}
	//@Contract(pure = true)
	private boolean isValidID(int id) {
		return id >= 0 && id <=2;
	}
	// obtener el producto por el id
	
	public Productos getByID(int id) {
		if (!isValidID(id)) {
			System.out.println("El item de este producto no existe");
			return null;
		}
		Productos r = null;
		try {
			r = productos[id].clone();
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return r;
		
	}
	
	//devolvemos todos los productos
	public Productos[]getAll(){
		Productos[] list = new Productos[4];
		try {
			list[0] = productos[0].clone();
			list[1] = productos[1].clone();
			list[2] = productos[2].clone();
			list[03] = productos[3].clone();
		} catch (CloneNotSupportedException ignored) {}
		return list;
	}
	public void comprarProducto(Productos producto) {
		Productos oldProductos;
		switch (producto.getClass().getSimpleName()) {
		case "carnicos":
			oldProductos = productos[0];
			break;
		case "Verduras":
			oldProductos = productos[1];
			break;
		case "granos":
			oldProductos = productos[2];
			break;
		case "Lacteos":
			oldProductos = productos[3];
			break;
			default:
			System.out.println("El producto no es valido");
			return;
			
		}
		oldProductos.setItem(oldProductos.getItem() + producto.getItem());
		oldProductos.setPrecio(producto.getPrecio());
	}
	
	public void ventasProductos(Productos producto, int valor) {
		Productos oldProductos;
		switch (producto.getClass().getSimpleName()) {
		case "carnicos":
			oldProductos = productos[0];
			break;
		case "Verduras":
			oldProductos = productos[1];
			break;
		case "granos":
			oldProductos = productos[2];
			break;
		case "Lacteos":
			oldProductos = productos[3];
			break;
			default:
			System.out.println("El producto no es valido");
			return;
		}
		oldProductos.setItem(oldProductos.getItem() - valor);
	}
	//agregar ventas
	public void agregarVenta(Productos producto) {
		ventas.add(producto);
	}
	//devolvamos los productos vendidos
	public List<Productos> getVenta(){
		return ventas;
	}
	//agregar compras
	public void agregarCompras(Productos producto) {
		comprar.add(producto);
	}
	
	//devolver todos los productos comprados
	public List<Productos>getCompras(){
		return comprar;
	}
	
	

}
