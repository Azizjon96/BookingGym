package BookingGym.controllers;

import BookingGym.dal.TariffDal;
import BookingGym.model.Tariff;
import java.util.List;

public class TariffController {
     protected TariffDal tariffDal;
    public TariffController() {
        tariffDal= new TariffDal(); 
    }
    
    public List<Tariff> getAllTariffs()
    {
        
        return tariffDal.selectAll();
    }
    
    public Tariff getTariffById(int id)
    {
        return tariffDal.selectById(id);
    }
    
    public int insertTariff(Tariff tariff)
    {
        return tariffDal.insert(tariff);
    }
    
     public int updateTariff(Tariff tariff)
    {
        return tariffDal.update(tariff);
    }
      public Tariff deleteTariff(int id)
    {
        return tariffDal.deleteById(id);
    }
}
