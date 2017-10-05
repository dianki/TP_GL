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
@SuppressWarnings("EqualsAndHashcode")
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
       return true;
   else 
       return false;
   }
   
   public boolean estVide()
   {
   int t= this.List.size();
   if(t==0) return true;
   else 
       return false;
   }
   public int getSize()
   {
        return this.List.size();
   }
   
   public Orange getOrange(int n)
   {
     return this.List.get(n);
   }
    @Override
   public String toString()
   {
       String s ="le panier est bien rempli\n";
        s+= Integer.toString(taillemax);
       for( int i=0; i<List.size(); i++)
            s+= List.get(i).toString();
              
       return s;
   }
   @Override
    public boolean equals (Object Obj)
    {if (!(Obj instanceof Panier && Obj==null))
        {
            
           Panier P1 = (Panier) Obj;
         return (this.List.equals(P1.getOrange(n)) && this.taillemax==P1.getSize());
           
        }
     return false;
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

        public double getPrixP()
          {       double  P=0;
        
             for( int i=0; i< this.List.size(); i++)
            {
                P+= this.List.get(i).getPrix();
                }
             
                    return P;
                }
        
        public void Boycotte(String O)
        {
        for( int i=0; i< this.List.size(); i++)
            {
                if(this.List.get(i).getOrigine() == null ? O == null : this.List.get(i).getOrigine().equals(O))
                    this.List.remove(i);
                }
        }
}