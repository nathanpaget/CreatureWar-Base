import java.util.Random;
/**
 * Write a description of class Demon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own

    
   private Random rand = new Random();

    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        super();
    }

    private void setStr(int strength){
        
        super.setSTR(strength);
    }
    private void setHp(int hp){
        super.setHP(hp);
    }
    public int damage(){
        int originalDamage=super.damage();
        if(rand.nextInt(20)==7){
            return 50;
        }
        else{
            return originalDamage;
        }
    
    }
}
