package kg.aleksandrov.deliverymvp.controllers;


import kg.aleksandrov.deliverymvp.dao.CourierStatusRepo;
import kg.aleksandrov.deliverymvp.models.entity.Courier;
import kg.aleksandrov.deliverymvp.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class CourierController {

    @Autowired
    private CourierService courierService;


    @Autowired
    private CourierStatusRepo courierStatusRepo;


    @GetMapping("/courier-table")
    public String getCourierTable(Model model) {
        model.addAttribute("title", "All Couriers");
        model.addAttribute("couriers", courierService.findAll());
        System.out.println(courierService.findAll());
        return "courier-table";
    }

    @GetMapping("/ordersback")
    public String backToOrders() {
        return "redirect:/orders/all";
    }

    @GetMapping("/courier-reg")
    public String getCourierForm(Model model) {
        model.addAttribute("title", "Add Courier");
        model.addAttribute(new Courier());
        model.addAttribute("courierStatus", courierStatusRepo.findAll());
        return "courier-reg";
    }

    @PostMapping("/courier-reg")
    public String addCourier(@ModelAttribute Courier courier, Model model) {
        model.addAttribute("title", "All Couriers");
        courierService.saveCourier(courier);
        return "redirect:/courier-table";
    }

    @PostMapping("/edit/{courierId}")
    public String editCourier(@PathVariable("courierId") Long courierId,
                              @ModelAttribute Courier courier) {
        courierService.updateCourier(courier, courierId);
        return "redirect:/courier-table";
    }

    @GetMapping("/edit/{courierId}")
    public String showEditForm(@PathVariable("courierId") Long courierId, Model model) {
        model.addAttribute("title", "Edit courier");
        Courier courier = courierService.editCourier(courierId);
        model.addAttribute("courierStatus", courierStatusRepo.findAll());
        model.addAttribute("courier", courier);
        return "edit-courier";
    }

    @Transactional
    @GetMapping("/delete/{courierId}")
    public String deleteCourier(@PathVariable("courierId") Long courierId,
                                @ModelAttribute Courier courier) {
        courierService.deleteCourier(courierId);
        return "redirect:/courier-table";
    }
}
