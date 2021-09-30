package Products.ReadyTypes;

import Products.BaseTypes.DeviceHardwareSpesifications;
import Products.ProductType;

public class CellPhone extends DeviceHardwareSpesifications {

    public CellPhone(String productName, int price) {
        super(ProductType.CellPhone, productName, price);
    }
}
