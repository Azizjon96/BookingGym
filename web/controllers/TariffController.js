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
        tariffsView.innerHTML = "result5";
        for(var i=0; i<tariffs.length;i++)
        {
            result+= "<div  style='border: 2px solid red; margin-top: 3%; padding: 2%; '>\n\
            <div><h4>"+tariffs[i].t_name+"</h4></div> \n\
            <div>Цена: "+tariffs[i].r_cost+"</div>\n\
            <div>Доступное количество посещений: "+tariffs[i].t_number_visits+"</div>\n\
            <div>Доступное количество дней: "+tariffs[i].t_number_days+"</div>\n\
            </div>"
        }
        tariffsView.innerHTML = result;
    }
    
//    getTariffByIdCategory(id)     {
//        var categoryService = new CategoryService();
//        return categoryService.getNewsByIdCategory(id);
//    }
     
        
}


