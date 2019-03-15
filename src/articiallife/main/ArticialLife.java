package articiallife.main;

import articiallife.model.place.Forest;
import articiallife.utils.Position;
import articiallife.utils.TigerController;
import articiallife.utils.TigerRunner;

public class ArticialLife
{
    public static void main(String[] args) throws Exception
    {
        int n = 5;
        int lines = 25;
        int columns = 25;
        int times = 100;
        
        Forest f = new Forest(lines, columns);
        TigerController tigerControllers[] = new TigerController[n];
        Thread threads[] = new Thread[n];
        
        for(int i = 0; i < n; i++)
        {
            tigerControllers[i] = new TigerController("Tigre" + (i+1));
            f.setObject(tigerControllers[i].getTiger(), new Position(0, n*i));
        }
        
        
        for(int i = 0; i < n; i++)
        {
            threads[i] = new Thread (new TigerRunner(tigerControllers[i], f, times), "Thread " + i);
            threads[i].start();
            threads[i].join();
        }
        
        for(int i = 0; i < n; i++)
            System.out.println("Tigre" + i + ": " + f.getPosition(tigerControllers[i].getTiger()));
        
    }
}
