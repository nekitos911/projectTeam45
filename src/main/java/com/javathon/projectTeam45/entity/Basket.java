package com.javathon.projectTeam45.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * Класс, отвечающий за датамодель корзины пользователя
 */

@Entity
public class Basket {

    public Basket() { }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "basket_id")
    private Long id;

    @NotBlank(message = "user_id can not be empty")
    @Column(name = "user_id")
    private String user_id;

    @NotBlank(message = "item_id can not be empty")
    @Column(name = "item_id")
    private String item_id;

    @Column(name = "price")
    private Long price;

    @Column(name = "count")
    private Long count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany
    private List<Integer> eatTime;

    public List<Integer> getEatTime() {
        return eatTime;
    }

    public void setEatTime(List<Integer> eatTime) {
        this.eatTime = eatTime;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

}