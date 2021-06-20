package kg.aleksandrov.deliverymvp.models.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "couriers")
@Data
public class Courier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long CourierId;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String phone;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "courier_status_id")
    private CourierStatus courierStatus;

}
