package edu.cientifica.divisasapp.model;

public class Moneda {
	private String codigoISO;
	private String descripcion;
	private String pais;
	private double factor;
	
	
	public Moneda() {
		super();
	}


	public Moneda(String codigoISO, String descripcion, String pais, double factor) {
		super();
		this.codigoISO = codigoISO;
		this.descripcion = descripcion;
		this.pais = pais;
		this.factor = factor;
	}


	public String getCodigoISO() {
		return codigoISO;
	}


	public void setCodigoISO(String codigoISO) {
		this.codigoISO = codigoISO;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public double getFactor() {
		return factor;
	}


	public void setFactor(double factor) {
		this.factor = factor;
	}
	
}
