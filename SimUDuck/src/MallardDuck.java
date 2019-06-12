import DuckBehaviors.FlyBehaviors.FlyWithWings;
import DuckBehaviors.QuackBehaviors.Quack;

public class MallardDuck extends Duck  {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

}
