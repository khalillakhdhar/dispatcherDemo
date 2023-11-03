package com.webservice.model;

public class User {
private String nom;
private double poids,taille;
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public double getPoids() {
	return poids;
}
public void setPoids(double poids) {
	this.poids = poids;
}
public double getTaille() {
	return taille;
}
public void setTaille(double taille) {
	this.taille = taille;
}
public long imc()
{
	return Math.round(poids/Math.pow(taille, 2));
}
public String interpretation()
{
if(this.imc()<20)
	return "maigre";
else if(this.imc()<=25)
{
	return "idéale";
}
return "surpoid";

}
@Override
public String toString() {
	return "User [nom=" + nom + ", poids=" + poids + ", taille=" + taille + ", imc=" + imc() + ", interpretation="
			+ interpretation() + "]";
}



}




