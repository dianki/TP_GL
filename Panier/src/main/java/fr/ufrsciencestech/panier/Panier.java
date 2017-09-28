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
    
    

   public Panier( int t, ArrayList<Orange> O)

{
    this.taillemax= t; 
    this.List=O;
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
   
   public String toString(){
       String s ="ggggg";
       for( int i= 0; List.size();i++)
            s+= List.get(i).toString();
   }
}
