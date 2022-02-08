package com.loiane.cursojava.aula56;

public class Pessoa {

	private TipoDocumento tipodocumento;
	private String numeroDocumento;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(TipoDocumento tipodocumento, String numeroDocumento) {
		super();
		this.tipodocumento = tipodocumento;
		this.numeroDocumento = numeroDocumento;
	}
	
	public TipoDocumento getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(TipoDocumento tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	@Override
	public String toString() {
		return "Pessoa [tipodocumento=" + tipodocumento + ", numeroDocumento=" + numeroDocumento + "]";
	}
	
	
	
}
