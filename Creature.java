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
   public Creature(){
       
   }
    
   public int damage(){
       //TODO: change this
       return rand.nextInt(strength);
    }
    public boolean isAlive(){
        return hp>0;
        
    }
}
