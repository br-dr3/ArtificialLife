package articiallife.model.place;

import articiallife.model.animals.Animal;
import articiallife.utils.Position;
import java.util.HashMap;
import java.util.Map;

public class Forest
{
    Map<Animal, Position> map;
    Object matrix[][];
    
    public Forest()
    {
        map = new HashMap();
        matrix = new Object[10][10];
    }
    
    public void setObject(Animal a, Position p) throws Exception
    {
        if (map.containsValue(a))
            throw new Exception("The animal " + a + " already exists.");
        if (map.containsKey(p))
            throw new Exception("The position " + p + " already have a Object");
        
        matrix[p.getX()][p.getY()] = a;
        map.put(a, p);
        
    }
    
    public Object getObject(Position p)
    {
        return matrix[p.getX()][p.getY()];
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
