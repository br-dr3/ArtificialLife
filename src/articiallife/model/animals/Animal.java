package articiallife.model.animals;

public interface Animal
{
    public boolean isAlive();
    public void fight(Animal a);
       
    public void setStrength(double strength);
    public double getStrength();
    public void setLife(double life);
    public double getLife();
    
    public double getLuck();
}
