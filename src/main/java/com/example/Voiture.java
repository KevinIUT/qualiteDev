package com.example;

public class Voiture
{
    private String marque;
    private int prix;

    public Voiture(String uneMarque, int unPrix)
    {
        this.marque = uneMarque;
        this.prix = unPrix;
    }
    public Voiture()
    {
        this.marque = "vide";
        this.prix = 0;
    }


    // Setter
    public void setMarque(String uneMarque)
    {
        this.marque = uneMarque;
    }
    public void setPrix(int unPrix)
    {
        this.prix = unPrix;
    }
    // Getter
    public String getMarque() {
        return marque;
    }
    public int getPrix() {
        return prix;
    }
}
