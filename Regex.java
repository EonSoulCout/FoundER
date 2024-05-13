package Modelo;

import LibreriaV2.Generica;

public class Regex {

	private Generica<String,String> er;

	public Regex() {
		er=new Generica<>();
	}
	public Regex(String patron, String...palabras) {
		er=new Generica<>(patron);
		er.loadElementos(palabras);

	}
	public String getPatron() {
		return er.getA1();
	}
	public void setPatron(String patron) {
		this.er.setA1(patron);
	}
	public String [] getPalabras() {
		return er.getA5();
	}
	public void setPalabras(String...palabras) {
		 this.er.loadElementos(palabras);
	 }





}
