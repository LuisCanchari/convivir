package edu.cientifica.convivir.model;

import java.sql.Date;

public class Abono {
	private Integer id;
	private Date fechaAbono;
	private Date fechaRegistro;
	private Double monto;
	private Cuota cuota;
	private Usuario usuario;
}
