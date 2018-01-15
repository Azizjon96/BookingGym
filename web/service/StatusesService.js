class StatusesService{

        updateStateses(json)
            {
                        //alert("updateStateses...");
                 var request = new XMLHttpRequest();
                 request.open('GET', '/BookingGym/UpdateStatuses?json=' + json, false);
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
        
        getStateses()
        
        {
                    var request = new XMLHttpRequest();
                     request.open('GET', '/BookingGym/GetNewClients', false);
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





