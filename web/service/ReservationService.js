class ReservationService
{
    insertReservation(json)
    {
                 var request = new XMLHttpRequest();
                 request.open('GET', '/BookingGym/InsertReservation?json=' + json, false);
                 request.send();
                 if (request.status != 200)  {
                      alert( request.status + ': ' + request.statusText ); 
                 } 
                 else    {
                     var res = JSON.parse(request.responseText);
                     return res;
                 }
                 return null;
    }
}