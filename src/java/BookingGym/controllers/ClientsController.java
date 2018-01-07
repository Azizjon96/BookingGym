
package BookingGym.controllers;
import java.util.List;
import BookingGym.dal.ClientsDal;
import BookingGym.model.Clients;

public class ClientsController {
      protected ClientsDal clientsDal;
    public ClientsController() {
        clientsDal= new ClientsDal();
    }
    
    public List<Clients> getAllClients()
    {
        return clientsDal.selectAll();
    }
    
    public Clients getClientsById(int id)
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
    
      public int deleteClients(int id)
    {
        return clientsDal.delete(id);
    }
    
     
     
}
