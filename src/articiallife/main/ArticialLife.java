package articiallife.main;

import articiallife.model.animals.Tiger;
import articiallife.model.place.Forest;
import articiallife.utils.Direction;
import articiallife.utils.Direction.CardinalDirections;
import articiallife.utils.Position;

public class ArticialLife
{
    public static void main(String[] args) throws Exception
    {
        Forest f = new Forest();
        Tiger tiger = new Tiger();
        
        f.setObject(tiger, new Position (0, 0));

        tiger.walk(f, new Direction(CardinalDirections.NORTH), 5);
        
        System.out.println(f);
    }
}
