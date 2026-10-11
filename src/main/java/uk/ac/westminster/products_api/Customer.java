package uk.ac.westminster.products_api;

public class Customer {
    private long id;
    private String name;
    private String email;
    private Address address;

    public Customer(){

    }
    public Customer(long id, String name, String email, Address address){
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public Address getAddress() {
        return address;
    }
}
