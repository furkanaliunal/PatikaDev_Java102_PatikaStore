package Products;

public interface IProduct extends Comparable<IProduct> {

    public String toString();

    public int getPrice();
    public void setPrice(int price);
    public String getProductName();
    public ProductType getProductType();
    public void setProductName(String productName);

}
