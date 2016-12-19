import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class War here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class War
{
    // instance variables - replace the example below with your own
    private int armySize;
    private ArrayList<Creature> armyOne=new ArrayList<Creature>();
    private ArrayList<Creature> armyTwo=new ArrayList<Creature>();
    private Random rand = new Random();
    /**
     * Constructor for objects of class War
     */
    public War()
    {
        armySize=10;
        createArmy(armyOne);
        createArmy(armyTwo);
    }
    public War(int armySize )
    {
        this.armySize=armySize;
        createArmy(armyOne);
        createArmy(armyTwo);
    }

    private void createArmy(ArrayList<Creature> army){
        int choice;
        for(int i=0;i<armySize;i++){
            choice=rand.nextInt(100);
            if(choice<20){
                army.add(new Human());
                System.out.println("add human");
            }
            else if(choice<40){
                army.add(new Elf());
                System.out.println("add elf");
            }
            else if(choice<90){
                army.add(new CyberDemon());
                System.out.println("add cyberdemon");
            }
            else if(choice<100){
                army.add(new Balrog());
                System.out.println("add balrog");
            }
            else{
                army.add(new Human());
                System.out.println("why are we here?");
            }
        }
    }
}
