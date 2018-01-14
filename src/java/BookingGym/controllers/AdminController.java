package BookingGym.controllers;

import BookingGym.dal.AdminDal;
import BookingGym.model.Admin;
import java.util.List;

public class AdminController {
     protected AdminDal adminDal;
    public AdminController() {
        adminDal= new AdminDal(); 
    }
    
    public List<Admin> getAllAdmin()
    {
        return adminDal.selectAll();
    }
    
}
