package com.infotel.dao;

import java.util.List;

import javax.ejb.Remote;

import com.infotel.metier.Magasin;
import com.infotel.metier.ProduitNonPerissable;

@Remote
public interface IdaoRemote {
	public void ajouterMagasin(Magasin m);
	public List<Magasin> findAllMagasins();
	public void modifierMagasin(Magasin m);
	public void supprimerMagasin(long idMagasin);
	public Magasin getMagasin(long idMagasin);
	public Magasin affichageMagasin(long idMagasin);
	
	public void ajouterProduitNonPerissable(ProduitNonPerissable p);
	public List<ProduitNonPerissable> findAllProduitNonPerissable();
	public void modifierProduitNonPerissable(ProduitNonPerissable p);
	public void supprimerProduitNonPerissable(long idProduit);
	public ProduitNonPerissable getProduitNonPerissable(Long idProduit);
	public ProduitNonPerissable  affichageProduitNonPerissable(long idProduit);


}
