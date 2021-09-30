package Brands;

import Products.IProduct;

import java.util.TreeSet;

public class BrandsManager {
    private TreeSet<Brand> brands;
    public BrandsManager(){
        brands = new TreeSet<>();
    }

    public void addBrand(String brandName){
        int id = brands.size();
        //System.out.println("Yeni marka " + brandName + ", mağazaya " + id + " id ile eklendi");
        brands.add(new Brand(brandName, id));
    }

    public Brand getBrand(String brandName){
        for (Brand brand : brands){
            if (brand.getBrandName().equals(brandName)){
                return brand;
            }
        }
        return new Brand(brandName+" bulunamadi.", -1);
    }

    public TreeSet<Brand> getAllBrands(){
        return this.brands;
    }

    public TreeSet<IProduct> getAllProducts(){
        TreeSet<IProduct> products = new TreeSet<>();
        for (Brand brand : brands){
            products.addAll(brand.getProducts());
        }
        return products;
    }
}
