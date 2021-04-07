var app = (function(){
    var city;
    var url = 'http://localhost:8080/weather/';
    var flag=true;
    var getWeather = function(cityName){
        
       city=cityName;
   
       $.get(url+city, function(resp){
           
           
           $("#id").html("id: "+`${resp.id}`);
           $("#Clouds").html("main: "+`${resp.main}`);
           $("#description").html("description: "+`${resp.description}`);
           $("#icon").html("icon: "+`${resp.icon}`);
 

            if(flag){
                $("#map").append("<iframe id=\"myIframe\" src=\"https://maps.google.com/maps?q="+`${resp.lat}`+","+`${resp.lon}`+"&hl=es;z=20&amp;output=embed\" height=\"500\" width=\"600\"></iframe>");
                flag=false;
           }
           else{
               $("#myIframe").remove();
                $("#map").append("<iframe id=\"myIframe\" src=\"https://maps.google.com/maps?q="+`${resp.lat}`+","+`${resp.lon}`+"&hl=es;z=20&amp;output=embed\" height=\"500\" width=\"600\"></iframe>");
               
           }
            
            
          ;
       });

    };        
       
    return{
        getbluePrints: function(author){           
            getWeather(author,false); 
            event.preventDefault();
        }      
    };
    
    
    
    
})(); 