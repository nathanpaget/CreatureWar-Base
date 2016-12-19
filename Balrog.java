import java.util.Random;
/**
 * Write a description of class Balrog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balrog extends Demon
{
    private int maxSTR=100;
    private int minSTR=50;
    
    private int maxHP=200;;
    private int minHP=80;
    
   private Random rand = new Random();
    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
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
        return super.damage()+super.damage();
    }
}
