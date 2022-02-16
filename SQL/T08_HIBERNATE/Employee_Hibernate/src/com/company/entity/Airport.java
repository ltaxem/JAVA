package com.company.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="sb_airports")
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto increment
    @Column(name = "biz_id")
    private int id;

    @Column(name = "biz_name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    //Tevinis
    @OneToMany(mappedBy = "airport", cascade = CascadeType.ALL) //Sudedam visas cascade
    private List<Employee> employees;




    public Airport(int id, String name, String address, String city) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public Airport(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public Airport(int id) {
        this.id = id;
    }

    //Privalo but tuscias konstruktorius su Hibernate
    public Airport(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
