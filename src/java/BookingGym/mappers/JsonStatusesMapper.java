
package BookingGym.mappers;

import BookingGym.model.Statuses;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonStatusesMapper {
   public static Statuses fromJson(String json)
    {
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Statuses statuses =mapper.readValue(json,Statuses.class);
            return statuses;
        } catch (IOException ex) {
            Logger.getLogger( JsonStatusesMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

 
    
    public static String toJson(Statuses statuses)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(statuses);
            return json;
        } catch (IOException ex) {
            Logger.getLogger( JsonStatusesMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
     public static String toJson(List<Statuses> statusess)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(statusess);
            return json;
        } catch (IOException ex) {
            Logger.getLogger( JsonStatusesMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }  
}
