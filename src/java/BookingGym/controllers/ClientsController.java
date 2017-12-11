
package BookingGym.controllers;
import java.util.List;
import BookingGym.dal.ClientsDal;
import BookingGym.model.Clients;

public class ClientsController {
      protected ClientsDal clientsDal;
    public ClientsController() {
        clientsDal= new ClientsDal();
    }
    
    public List<Clients> getAllClientses()
    {
        return clientsDal.selectAll();
    }
    
    public Clients getClientsById(String id)
    {
        return clientsDal.selectById(id);
    }
    
    public int insertClients(Clients clients)
    {
        return clientsDal.insert(clients);
    }
    
     public int updateClients(Clients clients)
    {
        return clientsDal.update(clients);
    }
}
