package conexion.garage.com;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;


@WebServlet(name = "helloServlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {


        String jdbcUrl = "jdbc:mysql://localhost:3306/bbddgarageseptiembre23?useSSL=false";
        String usuario = "root";
        String password = "Unicamente1";

        String driver = "com.mysql.jdbc.Driver";

        try {

            PrintWriter out=response.getWriter(); // codigo explido en video de Servlet

            out.print("Nombre de la BBDD: " + jdbcUrl);

            Class.forName(driver);	// cargamos driver jdbc

            Connection myConnection = (Connection) DriverManager.getConnection(jdbcUrl, usuario, password);

            out.print("\n\n\nConectado al Garage 5/10/23!!!");

            myConnection.close();



        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public void destroy() {
    }
}