class CategoryController{
    getAllCategory()        {
        var categoryService = new CategoryService();
        return categoryService.getAllCategory();
        
    }
    
    getAllCategoryViewButtons()     {
        var categories =this.getAllCategory();
        var categoriesView=document.getElementById("categories");
        var result="";
        for(var i=0; i<categories.length;i++)
        {
            result+= "<div class='row'>\n\
            <div onclick='categoryClick("+ categories[i].id   +")' class='btn btn-default col-md-12'  >"+categories[i].name+
            "</div></div>"
        }
        categoriesView.innerHTML = result;
    }
    getAllCategoryViewList()     {
         var categories =this.getAllCategory();
        var categoriesView=document.getElementById("categories");
        var result="";
        for(var i=0; i<categories.length;i++)
        {
            result+= "<div class='row'>\n\
            <div class='alert alert-success'>"+categories[i].name+
            "</div></div>"
        }
        categoriesView.innerHTML = result;
    }
    
    getNewsByIdCategory(id)     {
        var categoryService = new CategoryService();
        return categoryService.getNewsByIdCategory(id);
    }
     
    getNewsByIdCategoryViewList(id)    {
        var news =this.getNewsByIdCategory(id);
        var newsView=document.getElementById("news");
 
        var result="";
        for(var i=0; i<news.length;i++)
        {
            var id = news[i].id;
            var title = news[i].title;
            var shortDescription=news[i].shortDescription;
            var fullDescription=news[i].fullDescription;
            var image=news[i].image;
            
            var date = new Date(news[i].date);           
            var options = {
                    year: 'numeric',
                    month: 'long',
                    day: 'numeric',
                    hour: 'numeric',
                    minute: 'numeric'
                  };
                  
            date = date.toLocaleString("ru", options);
            
            
            
            result+= "<div class='row'>" +
                        "<div class='col-xs-12 col-sm-12 col-md-12 col-lg-12'>"+
                          "<div class='thumbnail' onclick='newsClick("+ id  +")'     >"+
                            "<img src='data:image/png;base64,"+image+"'>"+
                            "<div class='caption'>"+
                              "<h3>"+title+"</h3>" +
                              "<p>"+shortDescription+"</p>"+
                              "<p align='right'>"+date+"</p>"+
                            "</div></div></div></div>";
        }
        newsView.innerHTML = result;
    }
}


