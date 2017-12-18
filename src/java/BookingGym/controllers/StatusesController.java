package BookingGym.controllers;

import BookingGym.dal.StatusesDal;
import BookingGym.model.Statuses;
import java.util.List;


public class StatusesController {
    protected StatusesDal statusesDal;
    public StatusesController() {
        statusesDal= new StatusesDal();
    }
    
    public List<Statuses> getAllStatuses()
    {
        return statusesDal.selectAll();
    }
    
    public Statuses getStatusesById(String id)
    {
        return statusesDal.selectById(id);
    }
    
    public int insertStatuses(Statuses statuses)
    {
        return statusesDal.insert(statuses);
    }
    
     public int updateStatuses(Statuses statuses)
    {
        return statusesDal.update(statuses);
    }
      public int deleteStatuses(Statuses statuses)
    {
        return statusesDal.delete(statuses);
    }
}
