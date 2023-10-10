package garage.com.controlador;

import garage.com.controlador.entity.Client;
import garage.com.dao.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/addClientURL")
    public String addClientForm (Model theModel){

        // bind de datos

        Client newClient = new Client();

        //  agregamos al modelo

        theModel.addAttribute("newClientAttribute", newClient);

        return "addClientFile";
    }

/*******************************************************************/

    @PostMapping("/addNewClientDataURL")
    public String proccessNewClientDataMethod (@ModelAttribute("newClientAttribute") Client newClient){

        // insertar cliente en la BBDD
        
        daoClient.addClientToDDBB(newClient);

        return "redirect:/garageHomeURL/clientListURL";
    }

/*******************************************************************/

    @GetMapping("/updateLinkURL")
    public String updateClientMethod (@RequestParam ("clientID") int Id, Model theModel){

        // obtener el cliente cuyo ID le pasamos por parametro

        Client oneClient = daoClient.getClientById (Id);

        // agregar el cliente como atributo del modelo

        theModel.addAttribute("oneClientAttribute", oneClient);

        // enviar al fomulario

        return "updateClientForm";
    }

/*******************************************************************/

    @RequestMapping("/deleteLinkURL")
    public String deleteClientMethod (@RequestParam("clientID") int Id){

        // eliminamos el cliente

        daoClient.deleteClientById (Id);


        return "redirect:/garageHomeURL/clientListURL";

    }

/*******************************************************************/
}
