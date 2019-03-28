/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seminar3;

/**
 *
 * @author Stefanidis
 */
public class Hero {
    
 private String name;
 private int health=100;
 private int damage;
 private int level=1;
   
   
  
  //constructor
   public Hero(String name, int health, int damage, int level){
   
   this.name=name;
   this.health=health;
   this.damage=damage;
   this.level=level;
   
   }


 
   
   
   
   
   public String getName(){
       return this.name;
   }
   
   
   public void setName(String n){
   this.name=name;
   
   }
   
    
     public void afisare(){
     
         System.out.println("Name " + this.name);
         System.out.println("Helth " + this.health);
         System.out.println("Damage " + this.damage);
         System.out.println("Level "+ this.level);
     
     
     }
    
    
    
}


