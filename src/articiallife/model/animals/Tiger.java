package articiallife.model.animals;

import java.text.DecimalFormat;
import java.util.Random;

public class Tiger implements Animal
{
    private double strength;
    private double life;
    
    public Tiger(double strength, double life)
    {
        this.setStrength(strength);
        this.setLife(life);
    }
    
    public Tiger()
    {
        this.setStrength(10);
        this.setLife(100);
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
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        
        return (this.isAlive())?
                "Tiger[life = "+ decimalFormat.format(this.getLife()) + "; strength = " + decimalFormat.format(this.getStrength()) + "]":
                "Tiger[dead]";
    }

}
