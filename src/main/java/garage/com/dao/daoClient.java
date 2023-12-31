package garage.com.dao;

import garage.com.controlador.entity.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class daoClient implements DAO{

/*****************************************************************************/

    @Autowired
    private SessionFactory sessionFactory;

/*****************************************************************************/

    @Override
    @Transactional
    public List<Client> getClientList() {

        // obtener session

        Session mySession = sessionFactory.getCurrentSession();

        // crear query

        Query myQuery = mySession.createQuery("from Client", Client.class);

        // ejecutar query y devolver resultados

        List<Client> clientList = myQuery.getResultList();

        return clientList;
    }

/*****************************************************************************/

    @Override
    @Transactional
    public void addClientToDDBB(Client newClient) {

        // obtener session

        Session mySession = sessionFactory.getCurrentSession();


        // mySession.save(newClient); esto solo guarda

        // la siguiente linea, guarda o actualiza...
        mySession.saveOrUpdate(newClient);

    }

/*****************************************************************************/

    @Override
    @Transactional
    public Client getClientById(int id) {

        // obtener session

        Session mySession = sessionFactory.getCurrentSession();

        // Obtener el cliente buscado

        Client oneClient = mySession.get(Client.class, id);

        return oneClient;
    }

/*****************************************************************************/

    @Override
    @Transactional
    public void deleteClientById(int id) {

        // obtener session

        Session mySession = sessionFactory.getCurrentSession();

        Query myqwery = mySession.createQuery("delete from Client where id =: IDdelCliente");

        myqwery.setParameter("IDdelCliente", id);

        myqwery.executeUpdate();

    }

/*****************************************************************************/

    @Override
    @Transactional
    public Client getClientByPlate(String plate) {

        // obtener session

        Session mySession = sessionFactory.getCurrentSession();

        // crear query

        Query myQuery = mySession.createQuery ("select cliente from Client cliente where cliente.patente like :patente");

        // devolver resultado

        myQuery.setParameter("patente", plate );
        Client theClient = (Client) myQuery.uniqueResult();
        return theClient;

    }

/*****************************************************************************/

}
