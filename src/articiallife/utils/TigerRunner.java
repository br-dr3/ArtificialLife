package articiallife.utils;


import articiallife.model.place.Forest;
import articiallife.utils.TigerController;


public class TigerRunner implements Runnable
{
    public TigerController t;
    public Forest f;
    
    public TigerRunner(TigerController t, Forest f)
    {
        this.t = t;
        this.f = f;
    }
        
    @Override
    public void run()
    {
        t.run(f, 5);
    }
}
