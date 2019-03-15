package articiallife.utils;

public class Position
{
    public int x;
    public int y;
    
    public Position(int x, int y)
    {
        this.x = x;
        this.y = y;
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
}
