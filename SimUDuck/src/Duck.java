import DuckBehaviors.FlyBehavior;
import DuckBehaviors.QuackBehavior;

public  abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }

     public void swim(){
         System.out.println("All ducks can swim");

     }
     public void display(){
         System.out.println("I'm Mallard Duck");
     }
}
