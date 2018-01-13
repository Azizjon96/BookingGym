class ClientController
{
    insertClientDB()
    {
        //alert("insertClienttDB+");
        var clientService = new ClientService();
        var c_name=document.getElementById("name").value;
        var c_surname=document.getElementById("surname").value;
        var c_lastname=document.getElementById("lastname").value;
        var c_numberphone=document.getElementById("numberphone").value;
        
       // var doctor=sel.options[sel.selectedIndex].text;  

        var object = {};
        object.c_id_client = null;
        object.c_name = c_name;
        object.c_surname = c_surname;
        object.c_lastname = c_lastname;
        object.c_phone = c_numberphone;
        
        var json=JSON.stringify(object);
        var count= clientService.insertClients(json);
        //alert("json_______________OUT");
        return count;
    }   
}


