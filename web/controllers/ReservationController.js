class ReservationController
{
    insertReservation()
    {
        var service = new ReservationService();
        var r_id_client=document.getElementById("id").value;
        var r_hall=document.getElementById("hall").value;
        var r_begin_visits=document.getElementById("BDate").value;
        var r_end_visits=document.getElementById("EDate").value;
        var r_id_tariff=document.getElementById("tariff").value;

        
       // var doctor=sel.options[sel.selectedIndex].text;  

        var object = {};
        object.r_id_reservation = null;
        object.r_id_client = r_id_client;
        object.r_hall = r_hall;
        object.r_begin_visits = r_begin_visits;
        object.r_end_visits = r_end_visits;
        object.r_id_tariff = r_id_tariff;
        object.r_id_status = r_id_client;
        
        var json=JSON.stringify(object);
        var count= service.insertReservation(json);
        //alert("json_______________OUT");
        return count;
    }   
}
