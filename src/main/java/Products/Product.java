package Products;

public abstract class Product implements IProduct{
    private ProductType productType;
    private String productName;
    private int price;

    public Product(ProductType productType, String productName, int price){
        this.productType = productType;
        this.productName = productName;
        this.price = price;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }
    public String getProductName(){
        return this.productName;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }

    @Override
    public int compareTo(IProduct product){
        return this.productName.compareTo(product.getProductName());
    }
    @Override
    public String toString(){
        return this.productName;
    }

    @Override
    public ProductType getProductType() {
        return productType;
    }
}
