package kg.aleksandrov.deliverymvp.controllers;

import kg.aleksandrov.deliverymvp.dao.AddressRepo;
import kg.aleksandrov.deliverymvp.dao.AdminRepo;
import kg.aleksandrov.deliverymvp.dao.CourierRepo;
import kg.aleksandrov.deliverymvp.dao.OrderStatusRepo;
import kg.aleksandrov.deliverymvp.models.entity.Address;
import kg.aleksandrov.deliverymvp.models.entity.Admin;
import kg.aleksandrov.deliverymvp.models.entity.Order;
import kg.aleksandrov.deliverymvp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderStatusRepo orderStatusRepo;

    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private AdminRepo adminRepo;

    @Autowired
    private CourierRepo courierRepo;

    @GetMapping("/all")
    public String getOrders(Model model){
        model.addAttribute("title", "All orders");
        model.addAttribute("orders", orderService.findAll());
        return "orders";
    }

    @GetMapping("/addorder")
    public String showAddOrder(Model model){
        model.addAttribute("title", "Add order");
        model.addAttribute(new Order());

        model.addAttribute("orderStatus", orderStatusRepo.findAll());
        model.addAttribute("admin", adminRepo.findAll());
        model.addAttribute("courier", courierRepo.findAll());
        return "addorder";
    }

    @PostMapping("/addorder")
    public String addOrder(@ModelAttribute Order order, Model model) {
        model.addAttribute("title", "All Orders");
        model.addAttribute("admin", adminRepo.findAll());
        model.addAttribute("courier", courierRepo.findAll());
        orderService.saveOrder(order);
        return "redirect:/orders/all";
    }
    @GetMapping("/edit/{orderId}")
    public String showEditForm(@PathVariable("orderId") Long orderId, Model model) {
        model.addAttribute("title", "Edit order");
        Order order = orderService.editOrder(orderId);
        model.addAttribute("orderStatus", orderStatusRepo.findAll());
        model.addAttribute("order", order);
        return "edit-order";
    }

    @PostMapping("/edit/{orderId}")
    public String editOrder(@PathVariable("orderId") Long orderId,
                              @ModelAttribute Order order) {
        orderService.updateOrder(order, orderId);
        return "redirect:/courier-table";
    }
}
