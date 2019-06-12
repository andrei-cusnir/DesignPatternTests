import DuckBehaviors.FlyBehavior;
import DuckBehaviors.FlyWithWings;
import DuckBehaviors.Quack;
import DuckBehaviors.QuackBehavior;

public class MallardDuck extends Duck  {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

}
