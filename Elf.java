import java.util.Random;
/**
 * Write a description of class Elf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private int maxSTR=18;
    private int minSTR=5;
    
    private int maxHP=25;;
    private int minHP=8;
    
   private Random rand = new Random();

    /**
     * Constructor for objects of class Human
     */
    public Elf()
    {
        super();
        setSTR();
        setHP();
        
    }
    private void setSTR(){
        
        super.setSTR(rand.nextInt(maxSTR-minSTR+1)+minSTR);
    }
    private void setHP(){
        super.setHP(rand.nextInt(maxHP-minHP+1)+minHP);
    }
    public int damage(){
        int originalDamage=super.damage();
        if(rand.nextInt(10)==7){
            return originalDamage*2;
        }
        else{
            return originalDamage;
        }
    
    }
}
