package articiallife.model.animals;

import articiallife.model.animals.signals.Pheromone;
import articiallife.model.place.Forest;
import articiallife.utils.Direction;
import articiallife.utils.Position;
import java.text.DecimalFormat;
import java.util.Random;

public class Tiger implements Animal
{
    private double strength;
    private double life;
    public String name;
    
    public Tiger(double strength, double life)
    {
        this.setStrength(strength);
        this.setLife(life);
    }
    
    public Tiger(String s)
    {
        this.setStrength(10);
        this.setLife(100);
        this.setName(s);
    }

    
    public void setName(String s)
    {
        this.name = s;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    @Override
    public boolean isAlive()
    {
        return !this.isDead();
    }

    public boolean isDead()
    {
        return this.life <= 0;
    }

    @Override
    public void fight(Animal a)
    {
        if(this.isDead())
            return;
        
        a.setLife(a.getLife()-this.getStrength());
            
        if(a.isAlive())
            this.setLife(this.getLife()-a.getStrength());
        
        this.setStrength(this.getStrength()*this.getLuck());
        a.setStrength(a.getStrength()*a.getLuck());
    }

    @Override
    public void setStrength(double strength)
    {
        this.strength = strength;
    }

    @Override
    public double getStrength()
    {
        return this.strength;
    }

    @Override
    public void setLife(double life)
    {
        this.life = life;
    }

    @Override
    public double getLife()
    {
        return this.life;
    }

    @Override
    public double getLuck()
    {
        
        Random r = new Random ();
        double luck = r.nextDouble();
        
        return (luck > 0.5)? 1.1 : 0.9;
    }
    
    @Override
    public String toString()
    {        
        return (this.isAlive())?
                this.getName():
                "dead("+ this.getName() +")";
    }

    @Override
    public void walk(Forest f, Direction d)
    {
        if(d != null)
        {
            Position thisPosition = f.getPosition(this);
            f.setObject(this, d.getNewPosition(thisPosition));
        }
    }
    
    public void walk(Forest f, Direction d, int times)
    {
        for(int i = 0; i < times; i++)
        {
            this.walk(f, d);
        }
    }
    
    public boolean checkPheromony(Pheromone p)
    {
        return p.getType() == this.getClass();
    }
}
