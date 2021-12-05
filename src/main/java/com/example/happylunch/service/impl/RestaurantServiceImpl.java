package com.example.happylunch.service.impl;

import com.example.happylunch.model.binding.MenuAddBindingModel;
import com.example.happylunch.model.binding.RestaurantAddBindingModel;
import com.example.happylunch.model.entity.RestaurantEntity;
import com.example.happylunch.model.entity.RoleEntity;
import com.example.happylunch.model.entity.UserEntity;
import com.example.happylunch.model.enums.RoleNameEnum;
import com.example.happylunch.model.service.RestaurantAddServiceModel;
import com.example.happylunch.model.view.RestaurantFullViewModel;
import com.example.happylunch.model.view.RestaurantViewModel;
import com.example.happylunch.repository.MenuRepository;
import com.example.happylunch.repository.RestaurantRepository;
import com.example.happylunch.repository.UserRepository;
import com.example.happylunch.service.RestaurantService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepository;
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;


    public RestaurantServiceImpl(RestaurantRepository restaurantRepository, UserRepository userRepository, ModelMapper modelMapper) {
        this.restaurantRepository = restaurantRepository;
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;

    }


    @Override
    public List<RestaurantViewModel> findAllRestaurants() {

        return restaurantRepository
                .findAll()
                .stream()
                .map(restaurant ->{
                    RestaurantViewModel restaurantViewModel = modelMapper.map(restaurant, RestaurantViewModel.class);
                    if (restaurant.getPictures().isEmpty()) {
                        restaurantViewModel.setPictureUrl("/images/seagull.jpg");
                    } else {
                        restaurantViewModel.setPictureUrl(restaurant.getPictures().stream().findFirst().get().getUrl());
                    }
                    return restaurantViewModel;
                        })
                .collect(Collectors.toList());
    }

    @Override
    public RestaurantEntity findRestaurantById(Long id) {
        return getTheRestaurant(id);
    }

    @Override
    public RestaurantEntity findByRestaurantName(String name) {
        return restaurantRepository.findByName(name);
    }

    @Override
    public RestaurantFullViewModel findRestaurantDetails(Long id) {

        RestaurantEntity theRestaurant = getTheRestaurant(id);

        RestaurantFullViewModel restaurantFullViewModel = modelMapper
                .map(theRestaurant, RestaurantFullViewModel.class);

        if (theRestaurant.getPictures().isEmpty()) {
            restaurantFullViewModel.setPicture("/images/seagull.jpg");
        } else {
            restaurantFullViewModel.setPicture(theRestaurant.getPictures().stream().findFirst().get().getUrl());
        }

        return restaurantFullViewModel;
    }


    @Override
    public void like(Long id, Principal principal) {
        var theRestaurant = getTheRestaurant(id);
        var currentUserName = principal.getName();
        UserEntity user = userRepository.findByUsername(currentUserName).orElseThrow();

        Set<UserEntity> usersLiked = theRestaurant.getUsersLiked();
        var oldLikes = theRestaurant.getLikes();
        if (usersLiked.contains(user)){
            theRestaurant.setLikes(oldLikes);
        } else {
            theRestaurant.setLikes(oldLikes + 1);
            usersLiked.add(user);
            theRestaurant.setUsersLiked(usersLiked);
        }
        restaurantRepository.save(theRestaurant);
    }

    @Override
    public void addRestaurant(RestaurantAddBindingModel restaurantAddBindingModel) {

        RestaurantAddServiceModel restaurantAddServiceModel = modelMapper.map(restaurantAddBindingModel,
                RestaurantAddServiceModel.class);
        RestaurantEntity newRestaurant = modelMapper.map(restaurantAddServiceModel, RestaurantEntity.class);

        newRestaurant.setLikes(0L);

        RestaurantEntity restaurantEntity = restaurantRepository.save(newRestaurant);

        modelMapper.map(restaurantEntity, RestaurantAddServiceModel.class);
    }


    @Override
    public void deleteRestaurant(Long id, String name) {
        var user = userRepository.findByUsername(name).orElseThrow();
        if (isAdmin(user)){
            restaurantRepository.deleteById(id);
        }
    }

    @Override
    public String findRestaurantWithMostLikes() {
        var listOfRestaurantsSorted = restaurantRepository
                .findAll()
                .stream()
                .sorted(Comparator.comparing(RestaurantEntity::getLikes))
                .collect(Collectors.toList());

        Collections.reverse(listOfRestaurantsSorted);

        return listOfRestaurantsSorted.get(0).getName();
    }

    @Override
    public RestaurantViewModel findTopRestaurant() {

        String restaurantName = findRestaurantWithMostLikes();
        RestaurantEntity restaurant = findByRestaurantName(restaurantName);
        return modelMapper.map(restaurant, RestaurantViewModel.class);
    }


    private boolean isAdmin(UserEntity user) {

        return user.
                getRoles().
                stream().
                map(RoleEntity::getRole).
                anyMatch(r -> r == RoleNameEnum.ADMIN);
    }

    private RestaurantEntity getTheRestaurant(Long id) {
        return restaurantRepository
                .findById(id).orElseThrow();
    }


}
