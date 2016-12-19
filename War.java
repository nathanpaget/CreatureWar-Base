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
    
    public void goToWar(){
        while(armyOne.size()>0&&armyTwo.size()>0){
            fight(armyOne.get(0),armyTwo.get(0));
            if(!armyOne.get(0).isAlive()){
                armyOne.remove(0);
                System.out.println("A member of army 1 was defeated!");
            }
            if(!armyTwo.get(0).isAlive()){
                armyTwo.remove(0);                
                System.out.println("A member of army 2 was defeated!");
            }
        }
        //System.out.println("Army 1 has "+ armyOne.size() +" members left");
        //System.out.println("Army 2 has "+ armyTwo.size() +" members left");
        if(armyOne.size()>armyTwo.size()){
            System.out.println("Army 1 has won the battle");
        }
        else if(armyOne.size()<armyTwo.size()){
            
            System.out.println("Army 2 has won the battle");
        }
        else{
            
            System.out.println("In a fight to the bitter end, all souls perished");
        }
   }
   private void fight(Creature c1, Creature c2){
       int c1Damage=c1.damage();
       int c2Damage=c2.damage();
       c1.takeDamage(c2Damage);
       c2.takeDamage(c1Damage);
    }
    
    
    private void createArmy(ArrayList<Creature> army){
        int choice;
        for(int i=0;i<armySize;i++){
            choice=rand.nextInt(100);
            if(choice<20){
                army.add(new Human());
            }
            else if(choice<40){
                army.add(new Elf());
            }
            else if(choice<90){
                army.add(new CyberDemon());
            }
            else if(choice<100){
                army.add(new Balrog());
            }
            else{
                army.add(new Human());
            }
        }
    }
}
