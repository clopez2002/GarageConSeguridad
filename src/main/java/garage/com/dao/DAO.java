package garage.com.dao;

import garage.com.controlador.entity.Client;

import java.util.List;

public interface DAO {

    public List<Client> getClientList ();

    void addClientToDDBB(Client newClient);

    Client getClientById(int id);
}
