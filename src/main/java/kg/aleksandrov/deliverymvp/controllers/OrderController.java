package kg.aleksandrov.deliverymvp.controllers;

import kg.aleksandrov.deliverymvp.models.entity.Order;
import kg.aleksandrov.deliverymvp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/addorder")
    public String getOrderForm(Order order){
        return "addorder";
    }

    @GetMapping("/all")
    public String getOrders(Model model){
        List<Order> orders = orderService.findAll();
        model.addAttribute("orders", orders);
        return "orders";
    }

    @PostMapping("/")
    public String makeOrder(@ModelAttribute("order") Order order, Model model){
        model.addAttribute(order);
        System.out.println(order.getComments());
        return "redirect:/orders/all";
    }
}
