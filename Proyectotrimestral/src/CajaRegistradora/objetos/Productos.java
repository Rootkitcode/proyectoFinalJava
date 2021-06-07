package CajaRegistradora.objetos;

public abstract class Productos {
	private String nombre;
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
		public int getCantidad() {
			return cantidad;
		}
		
		public void setCantidad(int cantidad) {
			if(cantidad <0) {
				System.out.println("No se puede registrar una cantidad menor a cero");
				return;
			}
			this.cantidad = cantidad;
		}
		
		public double getPrecio() {
			return precio;
		}
		
		public void setPrecio(double precio) {
			if(precio < 0) {
				System.out.println("Error en el precio:");
				return;
			}
			this.precio = precio;
		}
		
		
			@Override
			public String toString() {
				return "Producto: " + this.nombre + " - "  + " -$" + this.cantidad + " + "+ this.precio;
			}
			@Override
			public Productos clone() throws CloneNotSupportedException{
				return (Productos) super.clone();
			
		}
		

}

