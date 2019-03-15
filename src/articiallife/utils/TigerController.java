package articiallife.utils;

import articiallife.model.animals.Tiger;
import articiallife.model.place.Forest;
import articiallife.utils.Direction.CardinalDirections;
import java.util.Random;

public class TigerController 
{
    public Tiger tiger;
    
    public TigerController(Tiger tiger)
    {
        this.tiger = tiger;
    }
    
    public TigerController(String name)
    {
        this.tiger = new Tiger(name);
    }
    
    public Tiger getTiger()
    {
        return this.tiger;
    }
    
    public void moveTiger(Direction d, Forest f) throws Exception
    {
        this.tiger.walk(f, d);
    }
    
    public boolean canWalk(Direction cd, Forest f)
    {
        if(cd == null) 
            return false;
        
        return f.getObject(cd.getNewPosition(f.getPosition(this.tiger))) == null;
    }
    
    public void run(Forest f, int times)
    {
        long seed = System.currentTimeMillis()+Thread.currentThread().getId() * 1234567890123456789L;
        Random r = new Random(seed);  
        Direction cd = null;
        for (int i = 0; i < times; i++)
        {
            for(double n = r.nextDouble(); !canWalk(cd, f); n = r.nextDouble())
            {
                if (n <= 0.25)
                    cd = new Direction(CardinalDirections.NORTH);
                else if (n <= 0.5)
                    cd = new Direction(CardinalDirections.SOUTH);
                else if (n <= 0.75)
                    cd = new Direction(CardinalDirections.EAST);
                else
                    cd = new Direction(CardinalDirections.WEST);
            }
            
            this.tiger.walk(f, cd);
        }
    }
}
