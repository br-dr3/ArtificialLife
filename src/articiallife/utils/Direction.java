package articiallife.utils;

public class Direction
{
    public enum CardinalDirections
    {
        NORTH(1, 0),
        SOUTH(-1, 0),
        EAST(0, 1),
        WEST(0, -1);
        
        private final int x;
        private final int y;
        
        CardinalDirections(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
        
        private int x() 
        { 
            return x; 
        }
        
        private int y()
        {
            return y;
        }
    }
      
    public CardinalDirections cardinalDirection;
    
    public Direction(CardinalDirections cd)
    {
        this.cardinalDirection = cd;
    }
    
    public CardinalDirections getDirection()
    {
        return this.cardinalDirection;
    }
    
    public Position getNewPosition(Position p)
    {        
        return new Position(p.getX() + this.cardinalDirection.x(), p.getY() + this.cardinalDirection.y());
    }
}
