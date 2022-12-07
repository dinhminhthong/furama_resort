package models.person;

public class Customer extends Person{
    private int idClient;
    private String typeClient;
    public Customer(){

    }

    public Customer(String name, String gender, int CMND,
                    String age, String telephonenumber, String email, String address, int idClient, String typeClient) {
        super(name, gender, CMND, age, telephonenumber, email, address);
        this.idClient = idClient;
        this.typeClient = typeClient;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getTypeClient() {
        return typeClient;
    }

    public void setTypeClient(String typeClient) {
        this.typeClient = typeClient;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idClient=" + idClient +
                ", typeClient='" + typeClient + '\'' +
                '}';
    }
}
