package edu.cientifica.convivir.model;

import java.sql.Date;
import java.util.List;

public class Cuota {
	private Integer id;
	private String titulo;
	private String anio;
	private String mes;
	private Date fechaEmision;
	private Date fechaVencimiento;
	private String estado;
	
	private List<CuotaDetalle> listaCuotaDetalle;
	private List<Abono> listaAbono; 
}
