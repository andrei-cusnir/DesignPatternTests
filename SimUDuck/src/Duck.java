import DuckBehaviors.FlyBehaviors.FlyBehavior;
import DuckBehaviors.QuackBehaviors.QuackBehavior;

public  abstract class Duck {
    FlyBehavior flyBehavior;    // flyable interface
    QuackBehavior quackBehavior;    // quackable interface
    public void setFlyBehavior(FlyBehavior fb){     //possibility to set other flyable class to already created duck
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){     //possibility to set other quackable class to already created duck
        quackBehavior = qb;
    }

    public void performQuack(){     //possibility to quack
        quackBehavior.quack();
    }
    public void performFly(){       //possibility to fly
        flyBehavior.fly();
    }

     public void swim(){
         System.out.println("All ducks can swim");

     }
     public void display(){
         System.out.println("I'm Mallard Duck");
     }
}
