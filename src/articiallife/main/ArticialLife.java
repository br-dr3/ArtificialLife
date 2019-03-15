package articiallife.main;

import articiallife.model.animals.signals.Pheromony;
import articiallife.model.place.Forest;
import articiallife.utils.Position;

public class ArticialLife
{
    public static void main(String[] args) throws Exception
    {
        Forest f = new Forest(5, 5);
        
        String[] names = {"Fear", "Safe", "Love", "Food", "Sad"};
        
        int n = 7;
        
        for(int i = 0; i < 5; i++)
            for(int j = 0; j < 5; j++)
                f.setObject(new Pheromony(names[i]), new Position(i, j));
        
        for(int i = 0; i < n; i++)
        {
            System.out.println(f);
            f.update();
        }
    }
}
