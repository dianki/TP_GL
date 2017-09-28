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
import java.util.*; 
public class Panier {
    
    private int taillemax;
    private ArrayList<Orange> List;
    
    

   public Panier( int t)

{
    this.taillemax= t; 
    this.List= new ArrayList<Orange> (t);
}
   
   public boolean estPlein()
   {
   int t = this.List.size();
   if( t == taillemax ) 
       return false;
   else 
       return true;
   }
   
   public boolean estVide()
   {
   int t= this.List.size();
   if(t!=taillemax) return true;
   else 
       return false;
   }
   
   public String toString()
   {
       String s ="";
        s+= Integer.toString(taillemax);
       for( int i=0; i<List.size(); i++)
            s+= List.get(i).toString();
              
       return s;
   }
   @Override
    public boolean equals (Object O)
    {
        if(this==O) return true;
        if(O==null) return false;
        if (!(O instanceof Orange))return false;
        Panier P1 = (Panier) O;
        Panier P2 = (Panier) O;
        return P1.equals(O) && P2.equals(O);
    }
        public void  ajouter(Orange O) 
        { 
            if(!this.estPlein())
            this.List.add(O);
            else
            System.out.println("le panier est plein");
         }
        
        public void  retirer(Orange O) 
        { 
            if(!this.estVide())
            this.List.remove(O);
            else
            System.out.println("le panier est vide");
         }
}
