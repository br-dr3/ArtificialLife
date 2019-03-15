package articiallife.model.animals.signals;

import java.text.DecimalFormat;

public class Pheromony<Animal>
{
    public String name;
    public double concentration;
    private final double dispersing = 0.2;
    private final Animal a = (Animal) new Object();
    
    public Pheromony()
    {
        this("Safe", 1);
    }
    
    public Pheromony(String t, double d)
    {
        this.setName(t);
        this.setConcentration(d);
    }
    
    public Pheromony(String t)
    {
        this(t, 1);
    }
    
    public void setConcentration(double c)
    {
        this.concentration = c;
    }
    
    public double getConcentration()
    {
        return this.concentration;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String t)
    {
        this.name = t;
    }
    
    public void update()
    {
        this.concentration -= dispersing;
    }
    
    @Override
    public String toString()
    {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return (this.getConcentration() > 0)? this.getName() + "(" + 
                decimalFormat.format(this.getConcentration()) + ")" : "null";
    }
    
    public Animal getType()
    {
        return this.a;
    }
}
