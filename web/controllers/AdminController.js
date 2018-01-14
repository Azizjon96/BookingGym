
class AdminController
{
    getAllAdmin()
    {
        var adminService = new AdminService();
        return adminService.getAllAdmin();
    }
    authentication()
    {   
        var data=this.getAllAdmin();
        var authAdmin=document.form.inputlogin.value;
        var authPassword=document.form.inputpass.value;
        for(var i=0; i<data.length;i++)
        {
            var login=data[i].a_login;
            var password=data[i].a_pass;
            if (authAdmin == login && authPassword == password)
            {
                //alert("Вы вошедший!");
                return 1;
            }                
        }
        return 0;
    }
}


