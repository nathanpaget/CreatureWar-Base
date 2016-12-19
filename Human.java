import java.util.Random;
/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human extends Creature
{
    // instance variables - replace the example below with your own
    private int maxSTR=18;
    private int minSTR=5;
    
    private int maxHP=30;;
    private int minHP=10;
    
   private Random rand = new Random();

    /**
     * Constructor for objects of class Human
     */
    public Human()
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
}
