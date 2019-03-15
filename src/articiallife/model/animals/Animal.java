package articiallife.model.animals;

import articiallife.model.place.Forest;
import articiallife.utils.Direction;

public interface Animal
{
    public boolean isAlive();
    public void fight(Animal a);
       
    public void setStrength(double strength);
    public double getStrength();
    public void setLife(double life);
    public double getLife();
    
    public void walk (Forest f, Direction d);
    
    public double getLuck();
}
