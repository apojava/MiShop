package com.shy.junit;

import com.shy.bean.Cart;
import com.shy.bean.CartItem;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @author shystart
 * @create 2021-04-02 下午 22:06
 */
public class CartTest {

    @Test
    public void addItem() {
        Cart cart = new Cart();

        cart.addItem(new CartItem(1, "小米11pro", 1, new BigDecimal(4999),new BigDecimal(4999)));
        cart.addItem(new CartItem(1, "小米11pro", 1, new BigDecimal(4999),new BigDecimal(4999)));
        cart.addItem(new CartItem(2, "小米11u", 1, new BigDecimal(5499),new BigDecimal(5999)));

        System.out.println(cart);

    }

    @Test
    public void deleteItem() {

        Cart cart = new Cart();

        cart.addItem(new CartItem(1, "小米11pro", 1, new BigDecimal(4999),new BigDecimal(4999)));
        cart.addItem(new CartItem(1, "小米11pro", 1, new BigDecimal(4999),new BigDecimal(4999)));
        cart.addItem(new CartItem(2, "小米11u", 1, new BigDecimal(5499),new BigDecimal(5999)));
        cart.deleteItem(1);

        System.out.println(cart);

    }

    @Test
    public void clear() {
        Cart cart = new Cart();

        cart.addItem(new CartItem(1, "小米11pro", 1, new BigDecimal(4999),new BigDecimal(4999)));
        cart.addItem(new CartItem(1, "小米11pro", 1, new BigDecimal(4999),new BigDecimal(4999)));
        cart.addItem(new CartItem(2, "小米11u", 1, new BigDecimal(5499),new BigDecimal(5999)));
        cart.deleteItem(1);

        cart.clear();

        System.out.println(cart);
    }

    @Test
    public void updateCount() {

        Cart cart = new Cart();

        cart.addItem(new CartItem(1, "小米11pro", 1, new BigDecimal(4999),new BigDecimal(4999)));
        cart.addItem(new CartItem(1, "小米11pro", 1, new BigDecimal(4999),new BigDecimal(4999)));
        cart.addItem(new CartItem(2, "小米11u", 1, new BigDecimal(5499),new BigDecimal(5999)));
        cart.deleteItem(1);

        cart.clear();

        cart.addItem(new CartItem(1, "java从入门到精通", 1, new BigDecimal(1000),new BigDecimal(1000)));

        cart.updateCount(1, 10);


        System.out.println(cart);

    }
}