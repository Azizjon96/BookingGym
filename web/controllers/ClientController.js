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
        var result="<h3>Список клиентов</h3>";
        for(var i=0; i<client.length;i++)
        {
            result+= "<div  style='border: 2px solid red; margin-top: 3%; padding: 2%; '>\n\
            <div>Номер заявки:</div> \n\
            <div>"+client[i].c_id_client+"</div> \n\
            <div>ФИО: "+client[i].c_surname +" "+ client[i].c_name + "  " + client[i].c_lastname +"</div>\n\
            <div>Телефон: "+client[i].c_phone+"</div>\n\
            </div>"
        }
        clientView.innerHTML = result;
    }
        getNewClientViewList()
    {
        
        var clientService = new ClientService();
        var client = clientService.getNewClient();
        var clientView=document.getElementById("client");
        var result="<h3>Список новых клиентов</h3>";
        for(var i=0; i<client.length;i++)
        {
            result+= "<div  style='border: 2px solid red; margin-top: 3%; padding: 2%; '>\n\
            <div>Номер заявки:</div> \n\
            <div>"+client[i].c_id_client+"</div> \n\
            <div>ФИО: "+client[i].c_surname +" "+ client[i].c_name + "  " + client[i].c_lastname +"</div>\n\
            <div>Телефон: "+client[i].c_phone+"</div>\n\
            <div style = 'float:right;'><input onclick='yesClick("+client[i].c_id_client+")' type = 'submit' class='btn btn-success' value='Принять'/></div>\n\
            <div style = 'float:right;'><input onclick='noClick("+client[i].c_id_client+")' type = 'submit' class='btn btn-danger' value='Отказать'/></div>\n\
            </div>"
        }
        clientView.innerHTML = result;
    }
}


