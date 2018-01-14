class AdminService
{
    getAllAdmin()
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/BookingGym/GetAllAdmin', false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var adminList= JSON.parse(request.responseText );
             return adminList;
         }
         return null;
    }
}