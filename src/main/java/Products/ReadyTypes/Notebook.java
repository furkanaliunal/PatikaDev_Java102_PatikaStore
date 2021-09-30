package Products.ReadyTypes;

import Products.BaseTypes.DeviceHardwareSpesifications;
import Products.ProductType;

public class Notebook extends DeviceHardwareSpesifications {
    public Notebook(String productName, int price) {
        super(ProductType.Notebook, productName, price);
    }
}
