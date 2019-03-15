package articiallife.main;

import articiallife.model.animals.Tiger;
import articiallife.model.place.Forest;
import articiallife.utils.Position;

public class ArticialLife
{
    public static void main(String[] args) throws Exception
    {
        Forest f = new Forest();
        
        Tiger tiger1 = new Tiger();
        Tiger tiger2 = new Tiger();
        
        while (tiger1.isAlive() && tiger2.isAlive())
        {
            tiger1.fight(tiger2);
            tiger2.fight(tiger1);
        } 
        
        System.out.println(tiger1);
        System.out.println(tiger2);
    }
}
