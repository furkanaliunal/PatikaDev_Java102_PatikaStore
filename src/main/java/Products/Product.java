package Products;

public abstract class Product implements IProduct{
    private ProductType productType;
    private String productName;
    private int price;
    private int id;

    public Product(ProductType productType, String productName, int price){
        this.productType = productType;
        this.productName = productName;
        this.price = price;
        this.id = -1;
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

    public void setID(int id) {
        this.id = id;
    }
    public int getID(){
        return this.id;
    }
}
