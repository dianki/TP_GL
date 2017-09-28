/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author mb423917
 */
public class Orange {
    
    private double prix;
    private String origine;
    
    
   public Orange (double p, String o)
   {
   this.origine=o;
   this.prix=p;
   }
   public String getOrigine()
   {
       
        return origine;
   }
   
   public double getPrix(){
   
       return prix;
   }
   
   public void setOrigine(String O)
   {
       this.origine=O;
   }
   
  class PrixNegatif extends Exception { 

  public PrixNegatif(){

    System.out.println("Vous essayez d'instancier le prix des oranges avec prix négatif !");

  }  

}
   public void setPrix(double P)

   throws PrixNegatif
   {
       if(P < 0)
           throw new PrixNegatif();
       else
       {
       this.prix=P;
       }
   }
   
   
}
