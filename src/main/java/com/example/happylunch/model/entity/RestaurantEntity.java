package com.example.happylunch.model.entity;

import com.example.happylunch.model.enums.AreaNameEnum;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "restaurants")
public class RestaurantEntity extends BaseEntity {

    private String name;
    private String address;
    private AreaNameEnum area;
    private String phoneNumber;
    private Set<PictureEntity> pictures;
    private Long likes;
    private Set<RecipeEntity> recipes;
    private String description;
    private Set<UserEntity> usersLiked;
    private Set<MenuEntity> menus;


    public RestaurantEntity() {
    }

    @Column(nullable = false, unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(nullable = false)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Enumerated(EnumType.STRING)
    public AreaNameEnum getArea() {
        return area;
    }

    public void setArea(AreaNameEnum area) {
        this.area = area;
    }

    @Column(nullable = false)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @OneToMany(mappedBy = "restaurant", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public Set<PictureEntity> getPictures() {
        return pictures;
    }

    public void setPictures(Set<PictureEntity> pictures) {
        this.pictures = pictures;
    }

    @OneToMany(mappedBy = "restaurant", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public Set<MenuEntity> getMenus() {
        return menus;
    }

    public void setMenus(Set<MenuEntity> menus) {
        this.menus = menus;
    }

    @Column
    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    @OneToMany(mappedBy = "restaurant", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public Set<RecipeEntity> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<RecipeEntity> recipes) {
        this.recipes = recipes;
    }

    @Lob
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    public Set<UserEntity> getUsersLiked() {
        return usersLiked;
    }

    public RestaurantEntity setUsersLiked(Set<UserEntity> usersLiked) {
        this.usersLiked = usersLiked;
        return this;
    }
}
