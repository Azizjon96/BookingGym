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
                     var count= request.responseText;
                     return count;
                 }
                 return null;
            }  
    

    
}





