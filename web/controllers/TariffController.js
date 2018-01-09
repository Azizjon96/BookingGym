class TariffController{
    getAllTariffs()        {
        var tariffService = new TariffService();
        return tariffService.getAllTariffs();
        
    }
    getAllTariffViewButtons()     {
        var tariffs =this.getAllTariffs();
        var tariffsView = document.getElementById("tariffs");
        var result="";
        for(var i=0; i<tariffs.length;i++)
        {
           result+= "<div class='row'>\n\
           <div onclick='tariffClick("+ tariffs[i].t_id_tariff +")' class='btn btn-default col-md-12'  >"+tariffs[i].t_name+
           "</div></div>"
       }
        
        tariffsView.innerHTML = result;
       // tariffsView.innerHTML = "result5";
    }
    
    getAllTariffViewList()     {
        var tariffs =this.getAllTariffs();
        var tariffsView=document.getElementById("tariffs");
        var result="";
        for(var i=0; i<tariffs.length;i++)
        {
            result+= "<div class='row'>\n\
            <div class='alert alert-success'>"+tariffs[i].t_name+
            "</div></div>"
        }
        tariffsView.innerHTML = result;
    }
    
//    getTariffByIdCategory(id)     {
//        var categoryService = new CategoryService();
//        return categoryService.getNewsByIdCategory(id);
//    }
     
        
}


