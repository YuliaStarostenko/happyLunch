package com.example.happylunch.service.impl;

import com.example.happylunch.model.binding.MenuAddBindingModel;
import com.example.happylunch.model.entity.MenuEntity;
import com.example.happylunch.model.entity.RestaurantEntity;
import com.example.happylunch.model.entity.UserEntity;
import com.example.happylunch.model.service.MenuAddServiceModel;
import com.example.happylunch.model.service.RestaurantAddServiceModel;
import com.example.happylunch.model.view.MenuViewModel;
import com.example.happylunch.repository.MenuRepository;
import com.example.happylunch.repository.RestaurantRepository;
import com.example.happylunch.repository.UserRepository;
import com.example.happylunch.service.MenuService;
import com.example.happylunch.service.RestaurantService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MenuServiceImpl implements MenuService {

    private final ModelMapper modelMapper;
    private final MenuRepository menuRepository;
    private final RestaurantRepository restaurantRepository;
    private final RestaurantService restaurantService;



    public MenuServiceImpl(ModelMapper modelMapper, MenuRepository menuRepository, RestaurantRepository restaurantRepository, RestaurantService restaurantService) {
        this.modelMapper = modelMapper;
        this.menuRepository = menuRepository;
        this.restaurantRepository = restaurantRepository;
        this.restaurantService = restaurantService;

    }


    @Override
    public List<MenuViewModel> findByRestaurantId(Long id) {
        RestaurantEntity restaurant = restaurantRepository.findById(id).orElseThrow();

        return getMenuViewModels(restaurant);
    }

    @Override
    public List<MenuViewModel> findSchoolMenu() {
        String name = "Училища";
        RestaurantEntity restaurant = restaurantService.findByRestaurantName(name);
        return getMenuViewModels(restaurant);
    }

    @Override
    public List<MenuViewModel> findKindergartenMenu() {
        String name = "Градини и ясла";
        RestaurantEntity restaurant = restaurantService.findByRestaurantName(name);
        return getMenuViewModels(restaurant);
    }

    @Override
    public void addMenu(MenuAddBindingModel menuAddBindingModel) {

        var menuServiceModel = modelMapper.map(menuAddBindingModel,
                MenuAddServiceModel.class);
        var newMenu = modelMapper.map(menuServiceModel, MenuEntity.class);

      var restaurantName = menuServiceModel.getRestaurantName();

      var restaurant = restaurantRepository.findByName(restaurantName);

      newMenu.setRestaurant(restaurant);

      menuRepository.save(newMenu);

    }

    @Override
    public void deleteMenusOfTheDay() {
        menuRepository.deleteAll();
    }


    private List<MenuViewModel> getMenuViewModels(RestaurantEntity restaurant) {
        String restaurantName = restaurant.getName();
        return menuRepository
                .findByRestaurant(restaurant)
                .stream()
                .map(menu -> {
                    MenuViewModel menuViewModel = modelMapper.map(menu, MenuViewModel.class);
                    menuViewModel.setRestaurant(restaurantName);
                    return menuViewModel;
                })
                .collect(Collectors.toList());
    }
}
