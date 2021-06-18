package kg.aleksandrov.deliverymvp.models.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "addresses")
@Data
public class Address {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long addressId;
     private String name;
     private String phone;



}
