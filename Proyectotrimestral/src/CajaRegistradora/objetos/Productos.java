package CajaRegistradora.objetos;
import java.util.*;

public abstract class Productos {
	private String nombre;
	private int item;
	private double precio;
	private int cantidad;
	
	Productos(){}
		Productos(String nombre){
			this.nombre = nombre;
		
	}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getItem() {
			return item;
		}
		public void setItem(int item) {
			this.item = item;
			System.out.println("No es posible registrar una cantidad menor a 0: ");
			return;
		}
		public double getPrecio() {
			return precio;
		}
		
		public void setPrecio(double precio) {
			this.precio = precio;
			if(precio < 0) {
				System.out.println("Error en el precio:");
				return;
			}
		}
		public int getCantidad() {
			return cantidad;
		}
		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}
			@Override
			public String toString() {
				return "Producto: " + this.nombre + " - " + this.item + " -$" + this.precio;
			}
			public Productos clone() throws CloneNotSupportedException{
				return (Productos) super.clone();
			
		}
		

}

