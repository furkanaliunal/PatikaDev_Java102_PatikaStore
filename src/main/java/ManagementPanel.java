import Products.ProductType;

import java.util.Scanner;

public class ManagementPanel {
    private Scanner input;
    private Shop shop;
    private Boolean exit = false;
    public ManagementPanel(Shop shop){
        input = new Scanner(System.in);
        this.shop = shop;
        while(!exit){
            getMenu();
            performSelection(getSelection());
        }

    }

    public void getMenu(){
        System.out.println("PatikaStore Ürün Yönetim Paneli !\n" +
                "1 - Notebook İşlemleri\n" +
                "2 - Cep Telefonu İşlemleri\n" +
                "3 - Marka Listele\n" +
                "0 - Çıkış Yap");
    }
    public String getSelection(){
        String result;
        System.out.print("Tercihiniz : ");
        result = input.nextLine();
        return result;
    }

    public void performSelection(String selection){

        switch(selection){
            case "0":
                this.exit = true;
                break;
            case "1":
                shop.listProducts(ProductType.Notebook);
                break;
            case "2":
                shop.listProducts(ProductType.CellPhone);
                break;
            case "3":
                shop.listBrands();
                break;
        }

    }
}
