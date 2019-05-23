package com.infotel.metier;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Magasin  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4746290387880784608L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private	long idMagasin;
private String nomMagasin;
private int codeMagasin;
private double prixDuLocal;
public long getIdMagasin() {
	return idMagasin;
}
public void setIdMagasin(long idMagasin) {
	this.idMagasin = idMagasin;
}
public String getNomMagasin() {
	return nomMagasin;
}
public void setNomMagasin(String nomMagasin) {
	this.nomMagasin = nomMagasin;
}
public int getCodeMagasin() {
	return codeMagasin;
}
public void setCodeMagasin(int codeMagasin) {
	this.codeMagasin = codeMagasin;
}
public double getPrixDuLocal() {
	return prixDuLocal;
}
public void setPrixDuLocal(double prixDuLocal) {
	this.prixDuLocal = prixDuLocal;
}
@Override
public String toString() {
	return "Magasin [idMagasin=" + idMagasin + ", nomMagasin=" + nomMagasin + ", codeMagasin=" + codeMagasin
			+ ", prixDuLocal=" + prixDuLocal + "]";
}


}
