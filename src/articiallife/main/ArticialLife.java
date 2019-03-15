package articiallife.main;

import articiallife.model.animals.Tiger;
import articiallife.model.place.Forest;
import articiallife.utils.Position;

public class ArticialLife
{
    public static void main(String[] args) throws Exception
    {
        Forest f = new Forest();
        
        f.setObject(new Tiger(), new Position(0, 0));
        
        System.out.println(f);
    }
}
