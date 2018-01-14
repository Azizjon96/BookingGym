class ClientService{

        insertClients(json)
            {
                //alert("insertClient+");
                 var request = new XMLHttpRequest();
                 request.open('GET', '/BookingGym/InsertClients?json=' + json, false);
                 request.send();
                 if (request.status != 200)  {
                      alert( request.status + ': ' + request.statusText ); 
                 } 
                 else    {
                     var client = JSON.parse(request.responseText);
                     return client;
                 }
                 return null;
            }  
        getAllClient()
        
        {
                    var request = new XMLHttpRequest();
                     request.open('GET', '/BookingGym/GetAllClients', false);
                    request.send();
                    if (request.status != 200) 
                        {
                        alert( request.status + ': ' + request.statusText ); 
                        return null;
                         } 
                      else 
                        {
                            var client = JSON.parse(request.responseText);
                            return client;
                        }
                        }
    

    
}





