import java.util.Random;
/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creature
{
   private int hp;
   private int strength;
   private Random rand = new Random();
   public Creature(int strength, int hp){
       this.strength=strength;
       this.hp=hp;
   }
   public Creature(){
       this.strength=10;
       this.hp=10;
   }
    
   public int damage(){
       //TODO: change this
       return rand.nextInt(strength)+1;
    }
    public boolean isAlive(){
        return hp>0;
    }
    protected void setSTR(int strength){
        this.strength=strength;
    }
    protected void setHP(int hp){
        this.hp=hp;
    }
    public void takeDamage(int damageTaken){
        hp=hp-damageTaken;
    }
        
}
