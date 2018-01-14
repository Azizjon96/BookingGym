class StatusesController
{
   constructor(id) {
    this.id = id;
    }

    approved()
    {

        var statusesService = new StatusesService();
       // var doctor=sel.options[sel.selectedIndex].text; 
       var object = {};
        object.s_id_status = this.id;
        object.s_processing = 0;
        object.s_approved = 1;
        object.s_failure = 0;
        var json=JSON.stringify(object);
        var count= statusesService.updateStateses(json);
        //alert("json_______________OUT");
        return count;
    }  
    failure()
    {
        //alert("insertClienttDB+");
        var statesesService = new StatusesService();
       // var doctor=sel.options[sel.selectedIndex].text;  
        var object = {};
        object.s_id_status = this.id;
        object.s_processing = 0;
        object.s_approved = 0;
        object.s_failure = 1;
        var json=JSON.stringify(object);
        var count= statesesService.updateStateses(json);
        //alert("json_______________OUT");
        return count;
    }   
}




