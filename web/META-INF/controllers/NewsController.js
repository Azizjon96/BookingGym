class NewsController{

    
    getNewsById(id)     {
        var newsService = new NewsService();
        return newsService.getNewsById(id) ;
    }
     
    getNewsByIView(id)    {
            var news =this.getNewsById(id);
            var newsView=document.getElementById("news");
 
            var result="";
            var id = news.id;
            var title = news.title;
            var shortDescription=news.shortDescription;
            var fullDescription=news.fullDescription;
            var image=news.image;
            
            var date = new Date(news.date);           
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
                              "<p>"+fullDescription+"</p>"+
                              "<p align='right'>"+date+"</p>"+
                            "</div></div></div></div>";
        newsView.innerHTML = result;
    }
}




