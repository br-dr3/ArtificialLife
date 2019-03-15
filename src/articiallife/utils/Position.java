package articiallife.utils;

public class Position
{
    public int x;
    public int y;
    public boolean valid;
    
    public Position(int x, int y)
    {
        this.x = x;
        this.y = y;
        
        this.valid = (x >= 0 && y >= 0);
    }
    
    public Position(int x, int y, boolean valid)
    {
        this.x = x;
        this.y = y;
        this.valid = valid;
    }
    
    public int getX()
    {
        return this.x;
    }
    
    public int getY()
    {
        return this.y;
    }
    
    @Override
    public String toString()
    {
        return "Position[x = " + this.getX() + ", y = " + this.getY() + "]";
    }
    
    public boolean isValid()
    {
        return this.valid;
    }
}
