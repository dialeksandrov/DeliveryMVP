package kg.aleksandrov.deliverymvp.models.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "admins")
@Data
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long adminId;

    private String login;
    private String password;
    private String firstName;
    private String lastName;


}
