package articiallife.utils;


import articiallife.model.place.Forest;
import articiallife.utils.TigerController;


public class TigerRunner implements Runnable
{
    public TigerController t;
    public Forest f;
    public int times;
    
    public TigerRunner(TigerController t, Forest f, int times)
    {
        this.t = t;
        this.f = f;
        this.times = times;
    }
        
    @Override
    public void run()
    {
        t.run(f, this.times);
    }
}
