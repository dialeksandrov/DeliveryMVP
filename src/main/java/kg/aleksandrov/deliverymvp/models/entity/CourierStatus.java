package kg.aleksandrov.deliverymvp.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "couriers_status")
@Data
public class CourierStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long courierStatusId;
    private String name;





}
