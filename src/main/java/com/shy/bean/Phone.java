package com.shy.bean;

/**
 * @author shystart
 * @create 2021-03-25 下午 16:22
 */
public class Phone {
    private Integer id;
    private String name;
    private String desiger;
    private String price;
    private Integer sales;
    private Integer stock;
    private String imgpath = "static/img/default.jpg";


    public Phone() {
    }

    public Phone(Integer id, String name, String desiger, String price, Integer sales, Integer stock, String imgpath) {
        this.id = id;
        this.name = name;
        this.desiger = desiger;
        this.price = price;
        this.sales = sales;
        this.stock = stock;
        if(imgpath != null&&"".equals(imgpath)){

            this.imgpath = imgpath;
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesiger() {
        return desiger;
    }

    public void setDesiger(String desiger) {
        this.desiger = desiger;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getImgPath() {
        return imgpath;
    }

    public void setImgPath(String imgpath) {
        if(imgpath != null||"".equals(imgpath)){


            this.imgpath = imgpath;
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desiger='" + desiger + '\'' +
                ", price='" + price + '\'' +
                ", sales=" + sales +
                ", stock=" + stock +
                ", img_path='" + imgpath + '\'' +
                '}';
    }
}
