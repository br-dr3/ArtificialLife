package articiallife.model.place;

import articiallife.model.animals.Animal;
import articiallife.utils.Position;
import java.util.HashMap;
import java.util.Map;

public class Forest
{
    Map<Animal, Position> map;
    Object matrix[][];
    
    public Position getPosition(Animal a)
    {
        if (a == null)
            return new Position (-1, -1, false);
        else
            return map.get(a);
    }
    
    public Forest()
    {
        this(10, 10);
    }
    
    public Forest(int x, int y)
    {
        map = new HashMap();
        matrix = new Object [x][y];
    }
    
    public void setObject(Animal a, Position p)
    {
        if (map.containsKey(a))
        {
            Position oldPosition = map.get(a);
            matrix[oldPosition.getX()][oldPosition.getY()] = null;
        }
        
        if (map.containsValue(p))
            return;
        
        if(!p.isValid() || p.getX() >= matrix.length || p.getY() >= matrix[0].length)
            return;
        
        matrix[p.getX()][p.getY()] = a;
        map.put(a, p);
        
    }
    
    public Object getObject(Position p)
    {
        if(p.getX() >= 0 && 
           p.getX() < matrix.length && 
           p.getY() >= 0 &&
           p.getY() < matrix[0].length)
            return matrix[p.getX()][p.getY()];
        else
            return new Integer(-1);
    }
        
    @Override
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        
        stringBuilder.append("Forest=\n");
        
        for(int i = 0; i < matrix.length; i++)
        {
            stringBuilder.append("[");
            
            for(int j = 0; j < matrix[i].length -1; j++)
                stringBuilder.append(matrix[i][j] + ", ");
        
            stringBuilder.append(matrix[i][matrix[i].length-1] + "]\n");
        }
        
        return stringBuilder.toString();
    }
}
