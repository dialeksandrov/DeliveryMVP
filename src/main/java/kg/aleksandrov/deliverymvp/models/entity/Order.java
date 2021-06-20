package kg.aleksandrov.deliverymvp.models.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "orders")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @NotNull(message = "Информация о заказе не может быть пустой")
    private String orderInfo;

    @NotNull
    @Positive
    private Long ransomSum;

    @NotNull
    @Positive
    private Long deliveryPrice;

    private String comments;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "order_date")
    private Date orderDate;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "admin_id", nullable = false)
    private Admin admin;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "courier_id", nullable = false)
    private Courier courier;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_from_id")
    private Address addressFrom;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_to_id")
    private Address addressTo;

    @ManyToOne
    @JoinColumn(name = "order_status_id")
    private OrderStatus orderStatus;
}
