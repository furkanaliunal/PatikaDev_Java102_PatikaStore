package Products.BaseTypes;

import Products.Features.Spesifications.CpuModel;
import Products.Features.Spesifications.Ram;
import Products.Product;
import Products.ProductType;

public abstract class DeviceHardwareSpesifications extends Product {

    private String ram;
    private String cpuModel;
    private String disc;


    public DeviceHardwareSpesifications(ProductType productType, String productName, int price) {
        super(productType, productName, price);
        ram = "";
        cpuModel = "";
        disc = "";
    }

    public void setRam(Ram ram){
        this.ram = ram.toString();
    }
    public void setRam(String ram){
        this.ram = ram;
    }

    public void setCpuModel(CpuModel cpuModel) {
        this.cpuModel = cpuModel.toString();
    }
    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public String getRam() {
        return ram;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public String getDisc() {
        return disc;
    }

    @Override
    public String toString(){
        String specs = getSpesificationsString();
        if (specs == ""){
            return getProductName();
        }


        return getProductName() + " (" + specs + " )";
        //return getProductName() + " (" + getRam() + " " + getCpuModel() + " " + getDisc() + ")";
    }

    public String getSpesificationsString(){
        String specs = "";
        if (ram != ""){
            specs += " " + ram;
        }
        if (cpuModel != ""){
            specs += " " + cpuModel;
        }
        if (disc != ""){
            specs += " " + disc;
        }
        return specs;
    }


}
