package spr;

import jakarta.persistence.*;

@Entity
@Table(name = "pickpoint")
public class PickPoint  {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String address;

    public PickPoint(String name, String address) {
        this.name = name;
        this.address = address;
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
}
