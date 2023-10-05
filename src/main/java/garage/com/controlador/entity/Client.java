package garage.com.controlador.entity;

import javax.persistence.*;

@Entity
@Table(name = "bbddgarage")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;

    @Column (name = "nombre")
    private String nombre;

    @Column (name = "apellido")
    private String apellido;

    @Column (name = "email")
    private String email;

    @Column (name = "calle")
    private String calle;

    @Column (name = "numero")
    private int numero;

    @Column (name = "piso")
    private int piso;

    @Column (name = "departamento")
    private String departamento;

    @Column (name = "marca_auto")
    private String marca_auto;

    @Column (name = "modelo")
    private String modelo;

    @Column (name = "anio")
    private int anio;

    @Column (name = "patente")
    private String patente;


/*****************************************************************************/

    public Client() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMarca_auto() {
        return marca_auto;
    }

    public void setMarca_auto(String marca_auto) {
        this.marca_auto = marca_auto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", calle='" + calle + '\'' +
                ", numero=" + numero +
                ", piso=" + piso +
                ", departamento='" + departamento + '\'' +
                ", marca_auto='" + marca_auto + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", patente='" + patente + '\'' +
                '}';
    }


/*****************************************************************************/

/*****************************************************************************/

}
