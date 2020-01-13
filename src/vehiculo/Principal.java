package vehiculo;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("$###,###.##");
		
		/*System.out.println(
				"Marca: " + auto.getMarca() + " // " +
				"Modelo: " + auto.getModelo() + " // " +
				"Puertas: "	+ auto.getPuertas() + " // " +
				"Precio: " + df.format(auto.getPrecio())
				);
		
		System.out.println(
				"Marca: " + moto.getMarca() + " // " +
				"Modelo: " + moto.getModelo() + " // " +
				"Cilindrada: "	+ moto.getCilindrada() + " // " +
				"Precio: " + df.format(moto.getPrecio())
				);
				*/
		
		List<Auto> Autos = new ArrayList<Auto>();
		Autos.add(new Auto("Citroen","C4 Cactus",1200000,5));
		Autos.add(new Auto("Volkswagen","Amarok",1600000,4));
		Autos.add(new Auto("Fiat","Cronos",750000,4));
		

		for(Auto todos:Autos)
			System.out.println(
							"Marca: " + todos.getMarca() + " // " +
							"Modelo: " + todos.getModelo() + " // " +
							"Puertas: "	+ todos.getPuertas() + " // " +
							"Precio: " + df.format(todos.getPrecio())
							);
		
		List<Moto> Motos = new ArrayList<Moto>();
		Motos.add(new Moto("Motomel","Blitz",50000,"110cc"));
		Motos.add(new Moto("Honda","Cb",175000,"125cc"));
		Motos.add(new Moto("Suzuki","An",160000,"125cc"));
		
		for(Moto todos:Motos)
			System.out.println(
							"Marca: " + todos.getMarca() + " // " +
							"Modelo: " + todos.getModelo() + " // " +
							"Cilindrada: "	+ todos.getCilindrada() + " // " +
							"Precio: " + df.format(todos.getPrecio())
							);
		
		
		Collections.sort(Autos, Comparator.comparing(Vehiculo::getPrecio));
		Collections.sort(Motos, Comparator.comparing(Vehiculo::getPrecio));
		
		
		
		if (Autos.get(Autos.size() - 1).getPrecio() > Motos.get(Motos.size() - 1).getPrecio()) {
			System.out.println("Vehiculo más caro: " + Autos.get(Autos.size() - 1).getMarca() + " " + Autos.get(Autos.size() - 1).getModelo());
		}
		else {
			System.out.println("Vehiculo más caro: " + Motos.get(Motos.size() - 1).getMarca() + " " + Motos.get(Motos.size() - 1).getModelo());
		}

		if (Autos.get(0).getPrecio() < Motos.get(0).getPrecio()) {
			System.out.println("Vehiculo más barato: " + Autos.get(0).getMarca() + " " + Autos.get(0).getModelo());
		}
		else {
			System.out.println("Vehiculo más barato: " + Motos.get(0).getMarca() + " " + Motos.get(0).getModelo());
		}
		
		

		

	}


	
}

