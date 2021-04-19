package it.prova.gestionericercalibri.model;

public class Libro {

	private String titolo;
	private String genere;
	private Integer pagine;
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public Integer getPagine() {
		return pagine;
	}
	public void setPagine(Integer pagine) {
		this.pagine = pagine;
	}
	public Libro(String titolo, String genere, Integer pagine) {
		super();
		this.titolo = titolo;
		this.genere = genere;
		this.pagine = pagine;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genere == null) ? 0 : genere.hashCode());
		result = prime * result + ((pagine == null) ? 0 : pagine.hashCode());
		result = prime * result + ((titolo == null) ? 0 : titolo.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
		
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		Libro other = (Libro) obj;
		
		if (genere == null) {
			if (other.genere != null) {
				return false;
			}
		} else if (!genere.equalsIgnoreCase(other.genere)) {
			return false;
		}
		if (pagine == null) {
			if (other.pagine != null) {
				return false;
			}
		} else if (!pagine.equals(other.pagine)) {
			return false;
		}
		if (titolo == null) {
			if (other.titolo != null) {
				return false;
			}
		} else if (!titolo.equalsIgnoreCase(other.titolo)) {
			return false;
		}
		return true;
	}
	
	
}
