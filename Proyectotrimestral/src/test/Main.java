package test;

import java.util.Scanner;

import CajaRegistradora.objetos.Productos;
import CajaRegistradora.objetos.carnicos;
import CajaRegistradora.objetos.Granos;
import CajaRegistradora.objetos.Lacteos;
import CajaRegistradora.objetos.Verduras;
import storage.DataBase;
import Vista.vistas;


public class Main {
	private static Scanner teclado = new Scanner(System.in);
	private static DataBase dataBase = new DataBase();
	private static vistas Vista = new vistas();
	
	public static void main(String[]args) {
		init();
	}
	private static void init() {
		int oPrincipal;
		do {
			Vista.showPrincipalHeader();
			Vista.showPrincipalMenu();
			oPrincipal = teclado.nextInt();
			switch (oPrincipal) {
			case 1:
				Vista.ShowComprarMenu();
				Vista.showProductOption();
				comprar();
				break;
			case 2:
				Vista.showVentasMenu();
				Vista.showProductOption();
				ventas();
				break;
				
			case 3:
				Vista.showInventario(dataBase.getAll());
				System.out.println("Digite una tecla para continuar...");
				teclado.nextInt();
				break;
			case 4: 
				Vista.showComprar(dataBase.getCompras());
				System.out.println("Digite una tecla para continuar...");
				teclado.nextInt();
				break;
				
			case 5:
				Vista.showVentas(dataBase.getVenta());
				System.out.println("Digite una tecla para continuar.... ");
				teclado.nextInt();
				break;
			case 6:
				System.out.println("Gracias por utilizar nuestro sistema");
				break;
				
			default:
				System.out.println("Opcion Invalida");
				
			}
		}
			while (oPrincipal != 6);
		}
		
	
	
	private static void comprar() {
		// TODO Auto-generated method stub
		int comprarOpcion;
		do {
			Vista.showEntrarOpcion();
			comprarOpcion = teclado.nextInt();
			if(comprarOpcion >=1 && comprarOpcion <=4) {
				comprarProducto(comprarOpcion);
			}else if (comprarOpcion == 5) {
					System.out.println("Producto no existe");
			}else {
				System.out.println("Opcion no valida");
				}
		} while (comprarOpcion != 5);
			}
	
	
		private static void ventas() {
			// TODO Auto-generated method stub
			int ventasOpcion;
			do {
				Vista.showEntrarOpcion();
				ventasOpcion = teclado.nextInt();
				if(ventasOpcion >=1 && ventasOpcion <=4) {
					ventasProductos(ventasOpcion);
				}else if (ventasOpcion == 5) {
						System.out.println("mensaje");
					} else {
						System.out.println("mensaje");
					}
			} while (ventasOpcion != 5);
			
		}
	
	
	
	private static void comprarProducto(int comprarOpcion) {
		// TODO Auto-generated method stub
		Productos producto = null;
		switch (comprarOpcion) {
		case 1:
			producto = new carnicos("Lomo cuadrado");
			break;
		case 2:
			producto = new Verduras("zanahoria");
			break;
			
		case 3:
			producto = new Granos("Arroz");
			break;
			
		case 4:
			producto = new Lacteos("leche");
			break; 
			default:
				System.out.println("Opcion no valida");
		}
		int cantidad = Vista.getCantidad(teclado);
		double precio = Vista.getPrecio(teclado);
		producto.setCantidad(cantidad);
		producto.setPrecio(precio);
		dataBase.agregarCompras(producto);
		dataBase.comprarProducto(producto);
		
		
	}

		
		
	private static void ventasProductos(int ventasOpcion) {
		// TODO Auto-generated method stub
		Productos producto = null;
		if(ventasOpcion < 1 || ventasOpcion > 4) {
			System.out.println("El producto no existe");
			return;
		}
		producto = dataBase.getByID(ventasOpcion -1);
		if(producto == null) {
			System.out.println("El producto es nulo");
		}
		System.out.println(producto);
		int cantidad = Vista.getCantidad(teclado);
		producto.setCantidad(cantidad);
		producto.setPrecio(producto.getPrecio() * 0.19);
		System.out.println("\t\t\t Valor a recibir: " + producto.getCantidad() * producto.getPrecio());
		dataBase.agregarVenta(producto);
		dataBase.ventasProductos(producto, cantidad);
		
	}
	
}

		
		
	


		
	

			
			
		
		
	
	


