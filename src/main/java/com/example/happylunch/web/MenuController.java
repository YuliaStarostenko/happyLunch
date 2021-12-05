package com.example.happylunch.web;

import com.example.happylunch.model.binding.MenuAddBindingModel;
import com.example.happylunch.model.binding.RestaurantAddBindingModel;
import com.example.happylunch.service.MenuService;
import com.example.happylunch.service.RestaurantService;
import com.example.happylunch.service.impl.HappyLunchUser;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class MenuController {

    private final MenuService menuService;
    private final RestaurantService restaurantService;


    public MenuController(MenuService menuService, RestaurantService restaurantService) {
        this.menuService = menuService;
        this.restaurantService = restaurantService;
    }

    @GetMapping("/restaurants/menu/{id}")
    public String showMenu (@PathVariable Long id, Model model){
        model.addAttribute("menus", this.menuService.findByRestaurantId(id));
        model.addAttribute("restaurant", this.restaurantService.findRestaurantById(id));
        return "menu";
    }

    @GetMapping("/menu/children")
    public String showMenu (){

        return "children";
    }

    @GetMapping("/menu/chilrldren/school")
    public String showMenuAtSchool (Model model){

        model.addAttribute("school", this.menuService.findSchoolMenu());

        return "school";
    }

    @GetMapping("/menu/chilrldren/kindergarten")
    public String showMenuAtKindergarten(Model model){

        model.addAttribute("kindergarten", this.menuService.findKindergartenMenu());

        return "kindergarten";
    }

    @GetMapping("/menus/add")
    public String getAddMenu(Model model) {

        if (!model.containsAttribute("menuAddBindModel")) {
            model.
                    addAttribute("menuAddBindModel", new MenuAddBindingModel());
        }
        return "menu-add";
    }

    @PostMapping("/menus/add")
    public String addMenu(@Valid MenuAddBindingModel menuAddBindingModel,
                                BindingResult bindingResult,
                                RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            redirectAttributes
                    .addFlashAttribute("menuAddBindingModel", menuAddBindingModel)
                    .addFlashAttribute("org.springframework.validation.BindingResult.menuAddBindingModel", bindingResult);

            return "redirect:/menus/add";
        }

        menuService.addMenu(menuAddBindingModel);

        return "redirect:/home";
    }
}
