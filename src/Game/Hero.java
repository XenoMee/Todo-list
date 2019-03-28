
package Game;


public class Hero {
    
 private String name;
 private int health=100;
 private int damage;
 private int level=1;
 
 static final double PROBABILITYOFATTACK = 0.8; 
 
 
 //functia de atac
 public void attack(Hero victim){
     
     if (!( this.health>0&&victim.health>0)){
         
         System.out.println(" Cannot attack, not both heros are allive! ");
         
         return;
     }
     
     int dmg = (int)(Math.random()*(this.damage/2+1)+(damage+1)/2);
     dmg+=this.getLevel()-1;
     System.out.println(this.getName()+" is attacking "+victim.getName()+" with damage "+dmg);
     victim.health-=dmg;
     
     if(victim.GetHelth()<=0){
         victim.health=0;
         System.out.println(victim.getName()+" has been killed! ");
         this.level++;
         System.out.println(this.getName()+" has leveled up! ");
     }
     
 }
 
 public void fight(Hero victim){
     while(this.GetHelth()>0 && victim.GetHelth()>0){
         if(Math.random()<Hero.PROBABILITYOFATTACK)
         this.attack(victim);
         if(Math.random()<Hero.PROBABILITYOFATTACK)
         victim.attack(this);
     }
     
 }
 
   
  //constructor
   private Hero(String name, int damage, int health, int level){
   
   this.name=name;
   this.health=health;
   this.damage=damage;
   this.level=level;
   }
   
   
   public Hero(String name, int damage){
       this(name,damage,100,1);
    
   }
    
   //constructor de copiere
   public Hero(Hero x){
       this(x.name,x.health,x.damage,x.level);
   } 

   public String getName(){
       return this.name;
   }
   public void setName(String name){
       this.name=name;
   
   }

   public int GetHelth(){
       return this.health;
   }
   public void setHealth(int health) {
        this.health = health;
    }
   
   public int getDamage() {
        return this.damage;
    } 
     
    public int getLevel() {
        return this.level;
    }

     
     public void afisare(){
     
         System.out.println("Name " + this.name);
         System.out.println("Helth " + this.health);
         System.out.println("Damage " + this.getDamage());
         System.out.println("Level "+ this.getLevel());
     
     
     }



    
    
    
    
    
     
     
     
     
}


