package com.example.happylunch.web;

import com.example.happylunch.model.binding.UserRegisterBindingModel;
import com.example.happylunch.model.service.UserRegisterServiceModel;
import com.example.happylunch.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UserRegistrationController {

    private final UserService userService;
    private final ModelMapper modelMapper;


    public UserRegistrationController(UserService userService,
                                      ModelMapper modelMapper) {
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @ModelAttribute("userModel")
    public UserRegisterBindingModel userModel() {

        return new UserRegisterBindingModel();
    }

    @GetMapping("/users/register")
    public String registerUser() {
        return "register";
    }

    @PostMapping("/users/register")
    public String register(
            @Valid UserRegisterBindingModel userRegisterBindingModel,
            BindingResult bindingResult,
            RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors() || !userRegisterBindingModel.getPassword().equals(userRegisterBindingModel.getConfirmPassword())) {
            redirectAttributes.addFlashAttribute("userModel", userRegisterBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userModel", bindingResult);

            return "redirect:/users/register";
        }

        UserRegisterServiceModel userRegisterServiceModel =
                modelMapper.map(userRegisterBindingModel, UserRegisterServiceModel.class);

        userService.registerAndLoginUser(userRegisterServiceModel);

        return "redirect:/home";
    }




}
