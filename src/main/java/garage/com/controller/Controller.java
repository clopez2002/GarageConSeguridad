package garage.com.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/garageHomeURL")
public class Controller {

/*******************************************************************/

    @RequestMapping("/clientListURL")
    public String displayClientsMethod (Model theModel){

        return "garageClientListFile";
    }

/*******************************************************************/

/*******************************************************************/

/*******************************************************************/

/*******************************************************************/

/*******************************************************************/
}
