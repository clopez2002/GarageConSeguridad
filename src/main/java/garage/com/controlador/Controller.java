package garage.com.controlador;

import garage.com.controlador.entity.Client;
import garage.com.dao.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping("/garageHomeURL")
public class Controller {

/*******************************************************************/

    @Autowired
    private DAO daoClient;

/*******************************************************************/

    @RequestMapping("/clientListURL")
    public String displayClientsMethod (Model theModel){

        // obtener clientes del dao

        List<Client> clientList = daoClient.getClientList();

        //agregar clientes al modelo

        theModel.addAttribute("ClientsAttributes", clientList);

        return "garageClientListFile";
    }

/*******************************************************************/

/*******************************************************************/

/*******************************************************************/

/*******************************************************************/

/*******************************************************************/
}
