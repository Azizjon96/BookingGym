class ClientController
{
    getAllClient()        
    {
        var clientService = new ClientService();
        return clientService.getAllClient();
        
    }
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
    getAllClientViewList()
    {
        
        var client =this.getAllClient();
        var clientView=document.getElementById("client");
        var result="<h1>Список клиентов</h1>";
        for(var i=0; i<client.length;i++)
        {
            result+= "<div  style='border: 2px solid red; margin-top: 3%; padding: 2%; '>\n\
            <div >Номер заявки: "+client[i].c_id_client+"</div> \n\
            <div>Имя: "+client[i].c_name+"</div>\n\
            <div>Фамилия: "+client[i].c_surname+"</div>\n\
            <div>Отчество: "+client[i].c_lastname+"</div>\n\
\n\            <div>Отчество: "+client[i].c_phone+"</div>\n\
            </div>"
        }
        clientView.innerHTML = result;
    }
}


