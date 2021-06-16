package kg.aleksandrov.deliverymvp.models.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "orders_status")
@Data
public class OrderStatus {

    @Id
    private Long orderStatusId;

    private String name;




}
