package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.LocationService;

@Controller
@RequestMapping("/api")
public class LocationController {

    private LocationService service;

    @Autowired
    public LocationController(LocationService service) {
        this.service = service;
    }

    @RequestMapping("/showCreate")
    public String CreateLocation() {
        //System.out.println(user.toString());
        return "TestHtml";
    }

    //@RequestMapping("/showCreate")
    //public String showCreate()
    //{
      //  return "CreateLocation";
    //}
}
