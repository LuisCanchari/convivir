package edu.cientifica.divisasapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import edu.cientifica.divisasapp.model.Moneda;

@Service //inyeccion de dependencias
public class Conversor {
	
	private Moneda monedaOrigen;
	private Moneda monedaDestino;
	private double cantidad;
	List<Moneda> listMoneda;
	
	public Conversor() {
		super();
		listMoneda =  new ArrayList<Moneda>();
		
		listMoneda.add(new Moneda("PEN", "Nuevol Sol", "Peru", 3.61));
		listMoneda.add(new Moneda("USD", "Dolar", "Estados Unidos", 1));
		listMoneda.add(new Moneda("EUR", "Euro", "Europa", 0.82));
		listMoneda.add(new Moneda("MXN", "Peso", "Mexico", 20.56));
		listMoneda.add(new Moneda("ARS", "Peso", "Argentina", 87.27));
		listMoneda.add(new Moneda("BOB", "Boliviano", "Bolivia", 6.73));
		listMoneda.add(new Moneda("BRL", "Real", "Brasil", 5.46));
		listMoneda.add(new Moneda("CLP", "Peso", "Chile", 734.33));
		listMoneda.add(new Moneda("GBP", "Libra", "Inglaterra", 0.72));
		listMoneda.add(new Moneda("COP", "Peso", "Colombia", 150));
		
	}
	
	public Conversor(Moneda monedaOrigen, Moneda monedaDestino, double cantidad) {
		super();
		this.monedaOrigen = monedaOrigen;
		this.monedaDestino = monedaDestino;
		this.cantidad = cantidad;
	}


	public Moneda getMonedaOrigen() {
		return monedaOrigen;
	}

	public void setMonedaOrigen(Moneda monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}

	public Moneda getMonedaDestino() {
		return monedaDestino;
	}

	public void setMonedaDestino(Moneda monedaDestino) {
		this.monedaDestino = monedaDestino;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	private double convertir() {
		double resultado;
		resultado = (cantidad*monedaDestino.getFactor())/(monedaOrigen.getFactor());
		return resultado; 
	}
	
	private Moneda buscarMonedaPorCodigo(String codigoISO) {
		Moneda moneda = null;
		for (Moneda m: listMoneda) {
			if (m.getCodigoISO().equals(codigoISO)){
				moneda = m;
				break;
			}
		}
	
		return moneda;
	}
	
	public double convertir(String codigoIsoOrigen, String codigoIsoDestino, Double Cantidad) {
		this.monedaOrigen = buscarMonedaPorCodigo(codigoIsoOrigen);
		this.monedaDestino = buscarMonedaPorCodigo(codigoIsoDestino);
		this.cantidad = Cantidad; 
		return convertir(); 
	}
	
	public List<Moneda> listaMoneda() {
		
		return listMoneda;
	}
}
