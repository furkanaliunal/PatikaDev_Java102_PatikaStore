package Brands;

import Products.IProduct;

import java.util.ArrayList;

public class Brand implements Comparable<Brand>{
    private String brandName;
    private int id;
    private ArrayList<IProduct> products;

    public Brand(String brandName, int id){
        this.brandName = brandName;
        this.id = id;
        this.products = new ArrayList<>();

    }

    @Override
    public String toString(){
        return this.brandName + " (" + this.id + ")";
    }

    @Override
    public int compareTo(Brand compareTo) {
        return brandName.compareTo(compareTo.getBrandName());
    }


    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<IProduct> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<IProduct> products) {
        this.products = products;
    }

    public void addProduct(IProduct product){
        product.setID(products.size());
        products.add(product);
    }
}
