
package BookingGym.mappers;

import BookingGym.model.Reservation;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;
public class JsonReservationMaper {
    public static Reservation fromJson(String json)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Reservation reservation =mapper.readValue(json,Reservation.class);
            return reservation;
        } catch (IOException ex) {
            Logger.getLogger( JsonReservationMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
 
    
    public static String toJson(Reservation reservation)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(reservation);
            return json;
        } catch (IOException ex) {
            Logger.getLogger( JsonReservationMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
     public static String toJson(List<Reservation> reservations)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(reservations);
            return json;
        } catch (IOException ex) {
            Logger.getLogger( JsonReservationMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
}
