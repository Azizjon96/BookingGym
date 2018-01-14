
package BookingGym.mappers;

import BookingGym.model.Admin;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonAdminMapper {
     public static String fromJson(Admin admin)
    { 
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(admin);
            return json;
        } catch (IOException ex) {
            Logger.getLogger( JsonAdminMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

 
    
    public static String toJson(Admin admin)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(admin);
            return json;
        } catch (IOException ex) {
            Logger.getLogger( JsonAdminMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
     public static String toJson(List<Admin> admin)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(admin);
            return json;
        } catch (IOException ex) {
            Logger.getLogger( JsonAdminMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }

    public static Admin fromJson(String jsonObject) {
               try {
            ObjectMapper mapper = new ObjectMapper();
            Admin admin = mapper.readValue(jsonObject, Admin.class);
            return admin;
        } catch (IOException ex) {
            Logger.getLogger(JsonAdminMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}