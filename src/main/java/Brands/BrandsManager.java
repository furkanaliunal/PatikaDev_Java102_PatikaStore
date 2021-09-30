package Brands;

import Products.IProduct;

import java.util.TreeSet;

public class BrandsManager {
    private TreeSet<Brand> brands;
    public BrandsManager(){
        brands = new TreeSet<>();
    }

    public Brand addBrand(String brandName){
        int id = brands.size();
        //System.out.println("Yeni marka " + brandName + ", mağazaya " + id + " id ile eklendi");
        Brand resultBrand = new Brand(brandName, id);
        brands.add(resultBrand);
        return resultBrand;
    }

    public Brand getBrand(String brandName){
        for (Brand brand : brands){
            if (brand.getBrandName().equals(brandName)){
                return brand;
            }
        }
        Brand resultBrand = addBrand(brandName);
        return resultBrand;
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
