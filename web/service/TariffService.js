class TariffService{
    getAllTariffs()     {
        

        var request = new XMLHttpRequest();

        request.open('GET', '/BookingGym/GetAllTariffs', false);
     // return "res1";
            
        request.send();
       // return "re";
        if (request.status != 200) 
        {
            alert( request.status + ': ' + request.statusText ); 
            
           return null;
        } 
        else 
        {
            var tariffs = JSON.parse(request.responseText);
            return tariffs;
        }
    }

    getTariffById(id)     {
        var request = new XMLHttpRequest();
        request.open('GET', '/BookingGym/getTariffById'+'?id='+id, false);
        request.send();
        if (request.status != 200) 
        {
            alert( request.status + ': ' + request.statusText ); 
            return null;
        } 
        else 
        {
            var tariff = JSON.parse(request.responseText);
            return tariff;
        }
    }
    

    
}





