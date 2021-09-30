import Products.Features.Spesifications.CpuModel;
import Products.Features.Spesifications.Ram;
import Products.ReadyTypes.CellPhone;
import Products.ReadyTypes.Notebook;

public class initalizeDemo {
    Shop shop;
    public initalizeDemo(Shop shop){
        shop.addBrand("HP");
        shop.addBrand("ASUS");
        shop.addBrand("XIAOMI");
        shop.addBrand("SAMSUNG");



        CellPhone cellphone = new CellPhone("Mi9T", 3000);
        cellphone.setRam(Ram.GB6);
        shop.addProduct("XIAOMI", cellphone);


        Notebook notebook = new Notebook("Omen", 3400);
        notebook.setCpuModel(CpuModel.AMD_5900X);
        notebook.setRam(Ram.GB16);
        notebook.setDisc("2TB Nvme m2 ssd");
        shop.addProduct("HP", notebook);


        cellphone = new CellPhone("Note9", 5000);
        cellphone.setRam(Ram.GB6);
        shop.addProduct("SAMSUNG", cellphone);
        
    }
}
