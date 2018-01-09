
package BookingGym.mappers;

import BookingGym.model.Tariff;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonTariffMapper {
     public static String fromJson(Tariff tariff)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(tariff);
            return json;
        } catch (IOException ex) {
            Logger.getLogger( JsonTariffMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

 
    
    public static String toJson(Tariff tariff)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(tariff);
            return json;
        } catch (IOException ex) {
            Logger.getLogger( JsonTariffMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
     public static String toJson(List<Tariff> tariffs)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(tariffs);
            return json;
        } catch (IOException ex) {
            Logger.getLogger( JsonTariffMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }

    public static Tariff fromJson(String jsonObject) {
               try {
            ObjectMapper mapper = new ObjectMapper();
            Tariff tariff = mapper.readValue(jsonObject, Tariff.class);
            return tariff;
        } catch (IOException ex) {
            Logger.getLogger(JsonTariffMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
