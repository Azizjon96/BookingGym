
package BookingGym.mappers;

import BookingGym.model.Clients;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;
class JsonClientsMapper {
    

    public static Clients fromJson(String json)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Clients clients =mapper.readValue(json,Clients.class);
            return clients;
        } catch (IOException ex) {
            Logger.getLogger(JsonClientsMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
 
    
    public static String toJson(Clients clients)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(clients);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonClientsMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
     public static String toJson(List<Clients> clientses)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(clientses);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonClientsMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }

}
