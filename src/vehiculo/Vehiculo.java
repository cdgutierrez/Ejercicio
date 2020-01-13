package vehiculo;

import java.util.Comparator;

public abstract class Vehiculo {

	private String marca;
	private String modelo;
	private double precio;
	
	public Vehiculo(String marca, String modelo, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + "// modelo=" + modelo + "// precio=" + precio + "]";
	}
	
	public class OrdenarPorPrecio implements Comparator<Vehiculo>{

		@Override
		public int compare(Vehiculo a1, Vehiculo a2) {
			return (int) (a1.getPrecio() - a2.getPrecio());
		}

	}
	
}


