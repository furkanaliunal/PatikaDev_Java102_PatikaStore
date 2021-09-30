import Products.ProductType;
import Products.ReadyTypes.CellPhone;
import Products.ReadyTypes.Notebook;

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
                "0 - Çıkış Yap" +
                "\n\n\n");
    }
    public String getSelection(){
        String result;
        System.out.print("Tercihiniz : ");
        result = input.nextLine();
        return result;
    }

    public void performSelection(String selection){
        clear();
        switch(selection){
            case "0":
                this.exit = true;
                break;
            case "1":
                while(!menuNotebook());
                break;
            case "2":
                while(!menuCellPhone());
                break;
            case "3":
                shop.listBrands();
                enterToContinue();
                break;
        }
        clear();

    }

    public Boolean menuNotebook(){
        Boolean result = false;
        System.out.println("Notebook Yönetim Paneli !\n" +
                "1 - Notebook ekle\n" +
                "2 - Notebook Listele\n" +
                "0 - Ana Menü" +
                "\n\n\n");
        String selection = getSelection();
        switch (selection) {
            case "0":
                result = true;
                break;
            case "1":
                addNotebookProduct();
                result = false;
                break;
            case "2":
                clear();
                shop.listProducts(ProductType.Notebook);
                enterToContinue();
                result = false;
                break;
        }
        clear();
        return result;
    }

    public Boolean menuCellPhone(){
        Boolean result = false;
        System.out.println("Cep Telefonu Yönetim Paneli !\n" +
                "1 - Cep Telefonu ekle\n" +
                "2 - Cep Telefonu Listele\n" +
                "0 - Ana Menü" +
                "\n\n\n");
        String selection = getSelection();
        switch (selection) {
            case "0":
                result = true;
                break;
            case "1":
                result = false;
                addCellPhoneProduct();
                break;
            case "2":
                clear();
                shop.listProducts(ProductType.CellPhone);
                enterToContinue();
                result = false;
                break;
        }
        clear();
        return result;
    }

    public void addCellPhoneProduct(){
        System.out.println("Ürünün markasını, modelini, fiyatını araya ',' koyarak yazınız");
        System.out.println("Örnek: X Marka, S11 Plus, 2300");
        System.out.print("Giriş: ");
        String[] productData = input.nextLine().split(",");
        shop.addProduct(productData[0].trim(), new CellPhone(productData[1].trim(), Integer.parseInt(productData[2].trim())));
    }

    public void addNotebookProduct(){
        System.out.println("Ürünün markasını, modelini, fiyatını araya ',' koyarak yazınız");
        System.out.println("Örnek: X Marka, S11 Plus, 2300");
        System.out.print("Giriş: ");
        String[] productData = input.nextLine().split(",");
        shop.addProduct(productData[0].trim(), new Notebook(productData[1].trim(), Integer.parseInt(productData[2].trim())));
    }

    public void clear(){
        for (int i = 0; i < 100; i++){
            System.out.println("");
        }
    }
    public void enterToContinue(){
        System.out.print("Enter basarak geri dönebilirsin");
        input.nextLine();
    }
}
