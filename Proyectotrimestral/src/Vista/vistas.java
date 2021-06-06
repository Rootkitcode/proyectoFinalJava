package Vista;
import java.util.*;
import java.util.List;
import java.util.Scanner;

import CajaRegistradora.objetos.Productos;
import test.Color;

public class vistas {
	public void showPrincipalHeader() {
		System.out.println(Color.RED);
		System.out.println("****************************************************************");
		System.out.println("BIENVENIDOS A NUESTRA CAJA REGISTRADORA HECHIZA");
		System.out.println("****************************************************************");
		System.out.println(Color.RESET);
	}
	
	public void showEntrarOpcion() {
		System.out.println("Digite una opcion: ");
	}
	
	public void showPrincipalMenu() {
		System.out.println(Color.YELLOW);
		System.out.println("\t\t\t 1. Comprar");
		System.out.println("\t\t\t 2. Vender");
		System.out.println("\t\t\t 3. Inventario");
		System.out.println("\t\t\t 4. Compras");
		System.out.println("\t\t\t 5. Ventas");
		System.out.println("\t\t\t 6. Salir");
		System.out.println(Color.RESET);
		showEntrarOpcion();
	}
	public void ShowComprarMenu() {
		System.out.println(Color.BLUE);
		System.out.println("******************************************");
		System.out.println("MENU DE COMPRAS");
		System.out.println("******************************************");
		System.out.println(Color.RESET);
	}
	public void showVentasMenu() {
		System.out.println(Color.GREEN);
		System.out.println("******************************************");
		System.out.println("MENU DE VENTAS");
		System.out.println("******************************************");
		System.out.println(Color.RESET);
	}
	
	public void showInventario(Productos[]productos) {
		System.out.println(Color.CYAN);
		System.out.println("******************************************");
		System.out.println("INVENTARIO");
		System.out.println("******************************************");
		System.out.println(Color.RESET);
		
		System.out.println(Color.BLACK);
		System.out.println("***********************************************************************");
		System.out.println("\t\t* PRODUCTO\t | Cantidad \t| Vr Unitario\t | Item\t | \t Vr Total*");
		System.out.println("***********************************************************************");
		for ( Productos ventas : productos) {
			System.out.println("\t\t|* " +ventas.getNombre() + "\t| " +ventas.getCantidad() + "\t\t|* "+ ventas.getPrecio()
			+ "\t\t|* " + ventas.getCantidad() * ventas.getPrecio() + "\t\t*");
		}
		System.out.println(Color.RESET);
		
	}
	public void showVentas(List<Productos> productos) {
		System.out.println(Color.MAGENTA);
        System.out.println("\t\t*****************************************************");
        System.out.println("\t\t*                  V E N T A S                      *");
        System.out.println("\t\t*****************************************************");
        System.out.println(Color.RESET);

        System.out.println(Color.MAGENTA_BOLD);
        System.out.println("\t\t-----------------------------------------------------");
        System.out.println("\t\t* PRODUCTO\t| Item\t|  Cantidad\t| Vr Unitario\t| Vr Total\t*");
        System.out.println("\t\t-----------------------------------------------------");
        for(Productos ventas: productos) {
        	System.out.println("\t\t* " +ventas.getNombre() + "\t\t| " + ventas.getCantidad()
        	+ "\t\t| "+ ventas.getPrecio() + "\t\t| " + ventas.getCantidad() * ventas.getPrecio());
        }
        System.out.println(Color.RESET);
	}
	
	public void showComprar(List<Productos> productos) {
        System.out.println(Color.BLUE);
        System.out.println("\t\t*****************************************************");
        System.out.println("\t\t*                C O M P R A S                      *");
        System.out.println("\t\t*****************************************************");
        System.out.println(Color.RESET);

        System.out.println(Color.RED_BOLD);
        System.out.println("\t\t-----------------------------------------------------");
        System.out.println("\t\t* PRODUCTO\t| Cantidad\t| Vr Unitario\t| Vr Total\t*");
        System.out.println("\t\t-----------------------------------------------------");
        for (Productos ventas : productos) {
            System.out.println("\t\t* "+ventas.getNombre()+"\t| "+ventas.getCantidad()+"\t\t| "+ventas.getPrecio()+"\t\t\t| "
        +ventas.getCantidad()*ventas.getPrecio()+"\t\t*");
        }
        System.out.println(Color.RESET);
    }
	
	public void showProductOption() {
		System.out.println(Color.BLACK);
		System.out.println("\t\t\t1. Carne");
		System.out.println("\t\t\t2. Zanahorias");
		System.out.println("\t\t\t3. Arroz");
		System.out.println("\t\t\t4. Leche");
		System.out.println("\t\t\t5. Volver");
		System.out.println(Color.RESET);
	}
	//vamos a solicitar cantidad productos
	
	public int getCantidad(Scanner teclado) {
		System.out.println("Digite la cantidad por unidad: ");
		return teclado.nextInt();
	}
	
	//solicitamosel precio de los productos
	public double getPrecio(Scanner teclado) {
		System.out.println("Digite el precio por unidad: ");
		return teclado.nextDouble();
	}
	
	
		
	}
	
	
	

