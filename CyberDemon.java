import java.util.Random;
/**
 * Write a description of class CyberDemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CyberDemon extends Demon
{
    private int maxSTR=40;
    private int minSTR=20;
    
    private int maxHP=100;;
    private int minHP=25;
    
   private Random rand = new Random();
    /**
     * Constructor for objects of class CyberDemon
     */
    public CyberDemon()
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
