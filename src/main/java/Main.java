import Products.Features.Spesifications.CpuModel;
import Products.Features.Spesifications.Ram;
import Products.ProductType;
import Products.ReadyTypes.CellPhone;
import Products.ReadyTypes.Notebook;

public class Main {
    public static void main(String[] args) {
        Shop patikaStore = new Shop("PatikaStore");
        patikaStore.addBrand("HP");
        patikaStore.addBrand("ASUS");
        patikaStore.addBrand("XIAOMI");
        patikaStore.addBrand("SAMSUNG");
        Notebook notebook = new Notebook("Omen", 3400);
        notebook.setCpuModel(CpuModel.AMD_5900X);
        notebook.setRam(Ram.GB16);
        notebook.setDisc("2TB Nvme m2 ssd");
        CellPhone cellphone = new CellPhone("Mi9T", 3000);
        cellphone.setRam(Ram.GB6);
        patikaStore.addProduct("HP", notebook);
        patikaStore.addProduct("XIAOMI", cellphone);
        patikaStore.listProducts();
        //patikaStore.listBrands();
    }
}
