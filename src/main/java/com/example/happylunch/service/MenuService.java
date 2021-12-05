package com.example.happylunch.service;

import com.example.happylunch.model.binding.MenuAddBindingModel;
import com.example.happylunch.model.view.MenuViewModel;

import java.util.List;

public interface MenuService {
    List<MenuViewModel> findByRestaurantId(Long id);

    List<MenuViewModel> findSchoolMenu();

    List<MenuViewModel> findKindergartenMenu();

    void addMenu(MenuAddBindingModel menuAddBindingModel);

    void deleteMenusOfTheDay();
}
