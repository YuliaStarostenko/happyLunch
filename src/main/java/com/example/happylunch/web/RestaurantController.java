package com.example.happylunch.web;

import com.example.happylunch.model.binding.RestaurantAddBindingModel;
import com.example.happylunch.model.service.RestaurantAddServiceModel;
import com.example.happylunch.service.RestaurantService;
import com.example.happylunch.service.impl.HappyLunchUser;
import org.modelmapper.ModelMapper;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.security.Principal;

@Controller
public class RestaurantController {

private final RestaurantService restaurantService;
private final ModelMapper modelMapper;

    public RestaurantController(RestaurantService restaurantService,
                                ModelMapper modelMapper) {
        this.restaurantService = restaurantService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/restaurants/all")
    public String allRestaurants(Model model){

        model.addAttribute("restaurants", restaurantService.findAllRestaurants());
        return "restaurants";
    }

    @GetMapping("restaurants/details/{id}")
    public String details(@PathVariable Long id, Model model) {
        model.addAttribute("restaurant", restaurantService.findRestaurantDetails(id));
        return "details";
    }


    @PostMapping("/restaurants/like/{id}")
    public String like(@PathVariable Long id, Principal principal){

        restaurantService.like(id, principal);

        return "redirect:/restaurants/details/{id}";
    }

    @GetMapping("/restaurants/add")
    public String getAddRestaurant(Model model) {

        if (!model.containsAttribute("restaurantAddBindModel")) {
            model.
                    addAttribute("restaurantAddBindModel", new RestaurantAddBindingModel());
        }
        return "restaurant-add";
    }

    @PostMapping("/restaurants/add")
    public String addRestaurant(@Valid RestaurantAddBindingModel restaurantAddBindingModel,
                           BindingResult bindingResult,
                           RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            redirectAttributes
                    .addFlashAttribute("restaurantAddBindModel", restaurantAddBindingModel)
                    .addFlashAttribute("org.springframework.validation.BindingResult.restaurantAddBindModel", bindingResult);
            return "redirect:/restaurants/add";
        }

                restaurantService.addRestaurant(restaurantAddBindingModel);

        return "redirect:/restaurants/all";
    }


    @DeleteMapping("/restaurants/{id}")
    public String deleteRestaurant(@PathVariable Long id,
                              Principal principal) {
        var name = principal.getName();

        restaurantService.deleteRestaurant(id, name);

        return "redirect:/restaurants/all";
    }
}
